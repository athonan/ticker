package com.stockticker.pricepolygon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {

    public String c;

    public Results(){
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString(){
        return "Results{" +
                "c=" + c + '\''+
                '}';

    }
}

