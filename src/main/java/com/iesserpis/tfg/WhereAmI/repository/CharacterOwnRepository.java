package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.CharacterOwn;
import com.iesserpis.tfg.WhereAmI.entity.CharacterOwnId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterOwnRepository extends JpaRepository<CharacterOwn, CharacterOwnId> {
}