package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pickup_modifies")
public class PickupModify {
    @EmbeddedId
    private PickupModifyId id;

    @MapsId("idpickup")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idpickup", nullable = false)
    private Pickup idpickup;

    @MapsId("idStat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_stat", nullable = false)
    private Stat idStat;

    @Column(name = "value")
    private Double value;

}