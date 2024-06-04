package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.TrinketFavorite;
import com.iesserpis.tfg.WhereAmI.entity.TrinketFavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrinketFavoriteRepository extends JpaRepository<TrinketFavorite, TrinketFavoriteId> {
}