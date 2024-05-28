package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.Pickup;
import com.iesserpis.tfg.WhereAmI.responesAPI.ResponseObjectModifies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PickupRepository extends JpaRepository<Pickup, Integer> {
    @Query("select new com.iesserpis.tfg.WhereAmI.responesAPI.ResponseObjectModifies(s.name, pm.value) " +
            "from Pickup p" +
            "         join PickupModify pm on p.id = pm.idpickup.id " +
            "         join Stat s on s.id = pm.idStat.id " +
            "where pm.idpickup.id = :idPickup")
    List<ResponseObjectModifies> getStatsModifiedByPickup(@Param("idPickup") int idPickup);
}