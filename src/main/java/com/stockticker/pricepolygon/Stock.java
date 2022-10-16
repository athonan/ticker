package com.stockticker.pricepolygon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {

    private String ticker;
    public List<com.stockticker.pricepolygon.Results> results;



    public Stock(){
    }

    public String getTicker() { return ticker;}

    public void setTicker(String ticker) {this.ticker = ticker;}


    @Override
    public String toString(){

        return "Stock{" +
                "ticker='" + ticker + '\'' +
                ", results=" + results +
                '}';
    }
}
