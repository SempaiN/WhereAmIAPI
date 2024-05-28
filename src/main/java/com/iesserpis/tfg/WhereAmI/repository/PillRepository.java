package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.responesAPI.PillResponse;

import com.iesserpis.tfg.WhereAmI.entity.Pill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PillRepository extends JpaRepository<Pill, Integer> {

    @Query("SELECT new com.iesserpis.tfg.WhereAmI.responesAPI.PillResponse(pk.name, p.effect, p.polarity,pk.imageUrl,pk.id) FROM Pickup pk JOIN Pill p ON p.id = pk.id")
    List<PillResponse> findAllPills();

    @Query("SELECT new com.iesserpis.tfg.WhereAmI.responesAPI.PillResponse(pk.name, p.effect, p.polarity,pk.imageUrl,pk.id) FROM Pickup pk JOIN Pill p ON p.id = pk.id where p.id = :idpill")
    PillResponse findOnePill(@Param("idpill") int idpill);
}