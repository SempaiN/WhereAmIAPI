package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.PickupFavorite;
import com.iesserpis.tfg.WhereAmI.entity.PickupFavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickupFavoriteRepository extends JpaRepository<PickupFavorite, PickupFavoriteId> {
}