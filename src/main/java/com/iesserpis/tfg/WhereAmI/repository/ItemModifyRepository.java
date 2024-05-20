package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.ItemModify;
import com.iesserpis.tfg.WhereAmI.entity.ItemModifyId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemModifyRepository extends JpaRepository<ItemModify, ItemModifyId> {
}