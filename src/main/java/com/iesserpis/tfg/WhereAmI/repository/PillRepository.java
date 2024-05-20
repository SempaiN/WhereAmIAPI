package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.PillResponse;

import com.iesserpis.tfg.WhereAmI.entity.Pickup;
import com.iesserpis.tfg.WhereAmI.entity.Pill;
import com.iesserpis.tfg.WhereAmI.entity.PillResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface PillRepository extends JpaRepository<Pill, Integer> {

    @Query("SELECT new com.iesserpis.tfg.WhereAmI.entity.PillResponse(pk.name, p.effect, p.polarity) FROM Pickup pk JOIN Pill p ON p.id = pk.id")
    List<PillResponse> findAllPills();

    @Query("SELECT new com.iesserpis.tfg.WhereAmI.entity.PillResponse(pk.name, p.effect, p.polarity) FROM Pickup pk JOIN Pill p ON p.id = pk.id where p.id = :idpill")
    PillResponse findOnePill(@Param("idpill") int idpill);
}