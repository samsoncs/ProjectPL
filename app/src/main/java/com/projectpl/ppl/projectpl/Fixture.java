package com.projectpl.ppl.projectpl;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Samson on 02.10.2015.
 */
public class Fixture {

    @SerializedName("homeTeamName")
    private String homeTeam;
    @SerializedName("awayTeamName")
    private String awayTeam;
    Score score;

    public String getHomeTeam(){
        return homeTeam;
    }

    public String getAwayTeam(){
        return awayTeam;
    }
    public Score getScore(){
        return score;
    }


    public void setHomeTeam(String homeTeam){
        this.homeTeam = homeTeam;
    }
    public void setAwayTeam(String awayTeam){
        this.awayTeam = awayTeam;
    }
    public void setScore(Score score){
        this.score = score;
    }



}
