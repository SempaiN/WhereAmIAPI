package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.PickupModify;
import com.iesserpis.tfg.WhereAmI.entity.PickupModifyId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickupModifyRepository extends JpaRepository<PickupModify, PickupModifyId> {
}