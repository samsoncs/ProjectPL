package com.projectpl.ppl.projectpl;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Samson on 02.10.2015.
 */
public class Fixture {

    @SerializedName("homeTeamName")
    private String homeTeam;
    @SerializedName("awayTeamName")
    private String awayTeam;
    //@SerializedName("home")
    //private int homeScore;
    //@SerializedName("away")
    //private int awayScore;

    public String getHomeTeam(){
        return homeTeam;
    }

    public String getAwayTeam(){
        return awayTeam;
    }

    /*
    private int getHomeScore(){
        return homeScore;
    }

    private int getAwayScore(){
        return awayScore;
    }
    */

    public void setHomeTeam(String homeTeam){
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam){
        this.awayTeam = awayTeam;
    }

    /*
    public void setHomeScore(int homeScore){
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore){
        this.awayScore = awayScore;
    }
    */

}
