package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "`card/rune`")
public class CardRune {
    @Id
    @Column(name = "idpickup", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idpickup", nullable = false)
    private Pickup pickup;

    @Column(name = "message", nullable = false, length = 45)
    private String message;

    @Column(name = "description", nullable = false)
    private String description;

}