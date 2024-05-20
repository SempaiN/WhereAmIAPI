package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "character_owns")
public class CharacterOwn {
    @EmbeddedId
    private CharacterOwnId id;

    @MapsId("idCharacter")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_character", nullable = false)
    private Character idCharacter;

    @MapsId("idPickup")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pickup", nullable = false)
    private Pickup idPickup;

}