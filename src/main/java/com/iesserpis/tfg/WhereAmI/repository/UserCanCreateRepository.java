package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.UserCanCreate;
import com.iesserpis.tfg.WhereAmI.entity.UserCanCreateId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCanCreateRepository extends JpaRepository<UserCanCreate, UserCanCreateId> {
}