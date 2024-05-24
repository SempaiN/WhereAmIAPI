package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.Character;
import com.iesserpis.tfg.WhereAmI.responesAPI.StatsBaseResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface CharacterRepository extends JpaRepository<Character, Integer> {
    @Query("SELECT i.name AS item_name  FROM CharacterCanStartWith c  JOIN Item i ON c.item1.id = i.id OR c.item2.id = i.id OR c.item3.id = i.id WHERE c.id = :characterId")
    List<String> findItemCharacter(@Param("characterId") Integer characterId);


    @Query(value = """
            SELECT
            s.name,(cp.value + (COALESCE(SUM(im.value), 0)))
            FROM
            Character c
                                             LEFT JOIN CharacterCanStartWith ccsw ON c.id = ccsw.character.id
                                             LEFT JOIN Item i1 ON ccsw.item1 = i1
                                             LEFT JOIN Item i2 ON ccsw.item2 = i2
                                             LEFT JOIN Item i3 ON ccsw.item3 = i3
                                             LEFT JOIN CharacterPossese cp ON c.id = cp.idcharacter.id
                                             LEFT JOIN Stat s ON cp.idstat.id = s.id
                                             LEFT JOIN ItemModify im ON im.idstat.id = s.id AND (im.idstat.id = i1.id OR im.idstat.id = i2.id OR im.idstat.id = i3.id)
                                         WHERE
                                             c.id = :characterId
                                         GROUP BY
                                             s.id, cp.value
            """)
    List<Map<String,Double>> getCharacterStats(@Param("characterId") int characterId);

    @Query("select  new com.iesserpis.tfg.WhereAmI.responesAPI.StatsBaseResponse(s.name,cp.value)  " +
            "from Character c " +
            "join CharacterPossese cp on cp.idcharacter.id = c.id " +
            "join Stat s on s.id = cp.idstat.id " +
            "where c.id = :characterId " +
            "group by c.id,s.id")
    List<StatsBaseResponse> getCharacterStatsBase(@Param("characterId") int characterId);

    @Query("select new Character(c.id,c.name,c.unlockable,c.custom,c.wayToUnlock,c.tainted,c.imageUrl) from Character c where c.custom = false")
    List<Character> getCharactersNotCustom();
}