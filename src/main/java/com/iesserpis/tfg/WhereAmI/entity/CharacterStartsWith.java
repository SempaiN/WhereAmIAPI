package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "character_starts_with")
public class CharacterStartsWith {
    @EmbeddedId
    private CharacterStartsWithId id;

    @MapsId("idcharacter")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idcharacter", nullable = false)
    private Character idcharacter;

    @MapsId("idTrinket")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_trinket", nullable = false)
    private Trinket idTrinket;

}