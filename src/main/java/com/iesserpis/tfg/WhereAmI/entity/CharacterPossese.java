package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "character_posseses")
public class CharacterPossese {
    @EmbeddedId
    private CharacterPosseseId id;

    @MapsId("idcharacter")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idcharacter", nullable = false)
    private Character idcharacter;

    @MapsId("idstat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idstat", nullable = false)
    private Stat idstat;

    @Column(name = "value", nullable = false)
    private Double value;

}