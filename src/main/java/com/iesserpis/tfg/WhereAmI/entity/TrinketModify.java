package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trinket_modifies")
public class TrinketModify {
    @EmbeddedId
    private TrinketModifyId id;

    @MapsId("idtrinket")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idtrinket", nullable = false)
    private Trinket idtrinket;

    @MapsId("idstat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idstat", nullable = false)
    private Stat idstat;

    @Column(name = "value")
    private Double value;

}