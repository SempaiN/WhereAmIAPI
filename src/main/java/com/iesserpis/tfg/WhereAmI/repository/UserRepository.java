package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select new Character(c.id,c.name,c.unlockable,c.custom,c.wayToUnlock,c.tainted) from User u JOIN UserCanCreate ucc on u.id = ucc.id.idUser JOIN Character c on ucc.idCharacter.id = c.id where ucc.idUser.id = :idUser")
    List<Character> getCharactersByUser(@Param("idUser") int idUser);

    @Query("select new User(u.id,u.name,u.email) from User u order by u.id desc limit 1")
    User getLastUser();

    @Query("select new User(u.id,u.name,u.email) from User u  where u.email = :email ")
    User getUserByEmail(@Param("email") String email);

}
