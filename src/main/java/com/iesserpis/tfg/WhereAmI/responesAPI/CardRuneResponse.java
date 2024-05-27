package com.iesserpis.tfg.WhereAmI.responesAPI;

public class CardRuneResponse {
    public String name;
    public String wayToUnlock;
    public Boolean unlockable;
    public String description;
    public String message;
    public String imageUrl;

    public CardRuneResponse(String name, String wayToUnlock, Boolean unlockable, String description, String message, String imageUrl) {
        this.name = name;
        this.wayToUnlock = wayToUnlock;
        this.unlockable = unlockable;
        this.description = description;
        this.message = message;
        this.imageUrl = imageUrl;
    }
}
