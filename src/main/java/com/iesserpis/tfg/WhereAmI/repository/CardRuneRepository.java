package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.CardRune;
import com.iesserpis.tfg.WhereAmI.entity.CardRuneResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CardRuneRepository extends JpaRepository<CardRune, Integer> {

    @Query("select  new com.iesserpis.tfg.WhereAmI.entity.CardRuneResponse(pk.name,pk.wayToUnlock,pk.unlockable,cr.description,cr.message) from Pickup pk join CardRune cr on pk.id = cr.id")
    List<CardRuneResponse> getAllCardRune();

    @Query("select  new com.iesserpis.tfg.WhereAmI.entity.CardRuneResponse(pk.name,pk.wayToUnlock,pk.unlockable,cr.description,cr.message) from Pickup pk join CardRune cr on pk.id = cr.id where cr.id = :idcardrune" )
    CardRuneResponse getCardRune(@Param("idcardrune") int idcardrune);
}