package com.projectpl.ppl.projectpl;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.JsonReader;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new InputStreamReader(getAssets().open("fixtures.txt"), "UTF-8"));
            Gson gson = new Gson();
            //String url = "http://www.premierleague.com/ajax/site-header/ajax-all-fixtures.json";
            Response response = gson.fromJson(reader, Response.class);
            reader.close();

            //Testing JSON parsing
            String homeTeam = response.getData().getFixtures().get(0).getHomeTeam();
            String awayTeam = response.getData().getFixtures().get(0).getAwayTeam();
            int homeScore = response.getData().getFixtures().get(0).getScore().getHome();
            int awayScore = response.getData().getFixtures().get(0).getScore().getAway();

            TextView text = (TextView) findViewById(R.id.text1);
            text.setText("Home team: " + homeTeam + " - " + homeScore + " | Away team: " + awayTeam + " - " + awayScore);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void handleFixtures(List<Fixture> fixtures){

    }

    /*
    private class JSONFetcher extends AsyncTask<Void, Void, String>{

        @Override
        protected String doInBackground(Void... params) {

            BufferedReader reader = null;

            try{
                reader = new BufferedReader(new InputStreamReader(getAssets().open("fixtures.txt"), "UTF-8"));

                Gson gson = new Gson();
                Response response = gson.fromJson(reader, Response.class);

                reader.close();

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    */
}
