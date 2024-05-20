package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pill")
public class Pill {
    @Id
    @Column(name = "id_pickup", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pickup", nullable = false)
    private Pickup pickup;

    @Column(name = "effect", nullable = false)
    private String effect;

    @Column(name = "polarity", nullable = false)
    private Integer polarity;

}