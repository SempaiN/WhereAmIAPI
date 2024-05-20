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
@Table(name = "trinket")
public class Trinket {
    @Id
    @Column(name = "idtrinket", nullable = false)
    private Integer id;

    @Column(name = "unlockable", nullable = false)
    private Boolean unlockable = false;

    @Column(name = "way_to_unlock")
    private String wayToUnlock;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "quote", nullable = false, length = 45)
    private String quote;

}