package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcharacter", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "unlockable", nullable = false)
    private Boolean unlockable = false;

    @Column(name = "custom", nullable = false)
    private Boolean custom = false;

    @Column(name = "way_to_unlock")
    private String wayToUnlock;

    @Column(name = "tainted", nullable = false)
    private Boolean tainted = false;

    @Column(name = "imageurl")
    private String imageUrl;

    @Column(name = "transitionimageurl")
    private String transitionImage;

    public Character(Integer id, String name, Boolean unlockable, Boolean custom, String wayToUnlock, Boolean tainted, String imageUrl, String transitionImage) {
        this.id = id;
        this.name = name;
        this.unlockable = unlockable;
        this.custom = custom;
        this.wayToUnlock = wayToUnlock;
        this.tainted = tainted;
        this.imageUrl = imageUrl;
        this.transitionImage = transitionImage;
    }

    public Character() {
    }
}