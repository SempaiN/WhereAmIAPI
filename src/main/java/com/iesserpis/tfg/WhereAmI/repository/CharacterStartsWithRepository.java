package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.CharacterStartsWith;
import com.iesserpis.tfg.WhereAmI.entity.CharacterStartsWithId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterStartsWithRepository extends JpaRepository<CharacterStartsWith, CharacterStartsWithId> {
}