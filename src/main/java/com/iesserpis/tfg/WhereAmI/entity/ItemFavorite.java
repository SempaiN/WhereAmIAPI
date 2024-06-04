package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "item_favorite")
public class ItemFavorite {
    @EmbeddedId
    private ItemFavoriteId id;

    @MapsId("iditem")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iditem", nullable = false)
    private Item iditem;

    @MapsId("iduser")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iduser", nullable = false)
    private User iduser;

}