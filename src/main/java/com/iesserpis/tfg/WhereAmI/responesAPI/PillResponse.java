package com.iesserpis.tfg.WhereAmI.responesAPI;

public class PillResponse {
    public int id;
    public String name;
    public String effect;
    public Integer polarity;
    public String imageUrl;

    public PillResponse(String name, String effect, Integer polarity, String imageUrl, int id) {
        this.name = name;
        this.effect = effect;
        this.polarity = polarity;
        this.imageUrl = imageUrl;
        this.id = id;
    }
}
