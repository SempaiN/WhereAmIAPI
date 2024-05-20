package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "character_can_start_with")
public class CharacterCanStartWith {
    @Id
    @Column(name = "id_character", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_character", nullable = false)
    private Character character;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item1")
    private Item item1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item2")
    private Item item2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item3")
    private Item item3;

}