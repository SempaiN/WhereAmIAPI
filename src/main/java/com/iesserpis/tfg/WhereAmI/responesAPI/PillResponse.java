package com.iesserpis.tfg.WhereAmI.responesAPI;

public class PillResponse {
    public int id;
    public String name;
    public String effect;
    public Integer polarity;
    public String imageUrl;
    public Boolean unlockable;
    public String wayToUnlock;

    public PillResponse(int id, String name, String effect, Integer polarity, String imageUrl, Boolean unlockable, String wayToUnlock) {
        this.id = id;
        this.name = name;
        this.effect = effect;
        this.polarity = polarity;
        this.imageUrl = imageUrl;
        this.unlockable = unlockable;
        this.wayToUnlock = wayToUnlock;
    }


}
