package com.projectpl.ppl.projectpl;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by Samson on 02.10.2015.
 */
public class Response {

    @SerializedName("siteHeaderSection")
    private Data data;

    public Data getData(){
        return data;
    }

    public void setData(Data data){
        this.data = data;
    }

}
