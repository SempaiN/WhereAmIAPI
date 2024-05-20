package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "item_modifies")
public class ItemModify {
    @EmbeddedId
    private ItemModifyId id;

    @MapsId("iditem")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iditem", nullable = false)
    private Item iditem;

    @MapsId("idstat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idstat", nullable = false)
    private Stat idstat;

    @Column(name = "value")
    private Double value;

}