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
@Table(name = "items")
public class Item {
    @Id
    @Column(name = "iditem", nullable = false)
    private Integer id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "charges", nullable = false)
    private Integer charges;

    @Column(name = "unlockable", nullable = false)
    private Boolean unlockable = false;

    @Column(name = "quote", nullable = false, length = 45)
    private String quote;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "way_to_unlock", length = 45)
    private String wayToUnlock;

}