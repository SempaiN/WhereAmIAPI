package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.Trinket;
import com.iesserpis.tfg.WhereAmI.responesAPI.ResponseObjectModifies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrinketRepository extends JpaRepository<Trinket, Integer> {
    @Query("""
            select new com.iesserpis.tfg.WhereAmI.responesAPI.ResponseObjectModifies(s.name, tm.value)  from TrinketModify tm  join Stat s on s.id = tm.idstat.id where tm.idtrinket.id =:trinketId
            """)
            List<ResponseObjectModifies>getItemModified(@Param("trinketId") int trinketId);
}