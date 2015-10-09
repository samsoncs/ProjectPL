package com.projectpl.ppl.projectpl;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Samson on 09.10.2015.
 */
public class Data {

    private Season currentSeason;
    @SerializedName("matches")
    private List<Fixture> fixtures;

    public List<Fixture> getFixtures(){
        return fixtures;
    }

    public Season getSeason(){
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason){
        this.currentSeason = currentSeason;
    }

    public void setFixtures(List<Fixture> fixtures){
        this.fixtures = fixtures;
    }

}
