package com.iesserpis.tfg.WhereAmI.entity;

public class PillResponse {

    public String name;
    public String effect;
    public Integer polarity;

    public PillResponse(String name, String effect, Integer polarity) {
        this.name = name;
        this.effect = effect;
        this.polarity = polarity;
    }
}
