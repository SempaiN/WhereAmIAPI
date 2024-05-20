package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pickup")
public class Pickup {
    @Id
    @Column(name = "idpickup", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "unlockable", nullable = false)
    private Boolean unlockable = false;

    @Column(name = "way_to_unlock", length = 45)
    private String wayToUnlock;

}