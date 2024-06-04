package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trinket_favorite")
public class TrinketFavorite {
    @EmbeddedId
    private TrinketFavoriteId id;

    @MapsId("idTrinket")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idTrinket", nullable = false)
    private Trinket idTrinket;

    @MapsId("idUser")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idUser", nullable = false)
    private User idUser;

}