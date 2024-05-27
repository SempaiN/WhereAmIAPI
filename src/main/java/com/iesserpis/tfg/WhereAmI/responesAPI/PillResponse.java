package com.iesserpis.tfg.WhereAmI.responesAPI;

public class PillResponse {

    public String name;
    public String effect;
    public Integer polarity;
    public String imageUrl;

    public PillResponse(String name, String effect, Integer polarity, String imageUrl) {
        this.name = name;
        this.effect = effect;
        this.polarity = polarity;
        this.imageUrl = imageUrl;
    }
}
