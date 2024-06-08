package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.Item;
import com.iesserpis.tfg.WhereAmI.responesAPI.ResponseObjectModifies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    @Query("select new com.iesserpis.tfg.WhereAmI.responesAPI.ResponseObjectModifies(s.name,im.value) from Item i  inner join ItemModify im on i.id = im.iditem.id inner join Stat s on im.idstat.id = s.id where im.iditem.id = :idItem")
    List<ResponseObjectModifies> getStatChanges(@Param("idItem") int idItem);

    @Query(value = "SELECT i FROM Item i where i.charges != 0")
    List<Item> selectAllActiveItems();

    @Query(value = "Select i from Item i where i.unlockable = true")
    List<Item> selectUnlockableItems();
}