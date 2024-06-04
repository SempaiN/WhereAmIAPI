package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.ItemFavorite;
import com.iesserpis.tfg.WhereAmI.entity.ItemFavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemFavoriteRepository extends JpaRepository<ItemFavorite, ItemFavoriteId> {
}