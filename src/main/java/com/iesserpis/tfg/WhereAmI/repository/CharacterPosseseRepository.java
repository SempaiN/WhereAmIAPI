package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.CharacterPossese;
import com.iesserpis.tfg.WhereAmI.entity.CharacterPosseseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterPosseseRepository extends JpaRepository<CharacterPossese, CharacterPosseseId> {
}