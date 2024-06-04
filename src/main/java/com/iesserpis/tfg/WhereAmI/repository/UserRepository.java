package com.iesserpis.tfg.WhereAmI.repository;

import com.iesserpis.tfg.WhereAmI.entity.Character;
import com.iesserpis.tfg.WhereAmI.entity.Item;
import com.iesserpis.tfg.WhereAmI.entity.User;
import com.iesserpis.tfg.WhereAmI.responesAPI.CardRuneResponse;
import com.iesserpis.tfg.WhereAmI.responesAPI.PillResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select new com.iesserpis.tfg.WhereAmI.entity.Character(c.id,c.name,c.unlockable,c.custom,c.wayToUnlock,c.tainted,c.imageUrl,c.transitionImage) from User u JOIN UserCanCreate ucc on u.id = ucc.id.idUser JOIN Character c on ucc.idCharacter.id = c.id where ucc.idUser.id = :idUser")
    List<Character> getCharactersByUser(@Param("idUser") int idUser);

    @Query("select new User(u.id,u.name,u.email) from User u order by u.id desc limit 1")
    User getLastUser();

    @Query("select new User(u.id,u.name,u.email) from User u  where u.email = :email ")
    User getUserByEmail(@Param("email") String email);

    @Query("select i " +
            "from ItemFavorite if " +
            "join  Item i on i.id = if.iditem.id " +
            "where if.iduser.id = :idUser "
    )
    List<Item> getItemsFavoriteByUser(@Param("idUser") int idUser);

    @Query("select new com.iesserpis.tfg.WhereAmI.responesAPI.CardRuneResponse(p.name,p.wayToUnlock,p.unlockable,cr.description,cr.message,p.imageUrl,p.id) " +
            "from PickupFavorite pf " +
            "join Pickup p on p.id = pf.idpickup.id " +
            "join CardRune cr on p.id = cr.id " +
            "where pf.iduser.id = :idUser")
    List<CardRuneResponse> getCardRuneFavoritesByUser(@Param("idUser") int idUser);

    @Query("select new com.iesserpis.tfg.WhereAmI.responesAPI.PillResponse(p.id, p.name, p2.effect,p2.polarity,p.imageUrl,p.unlockable,p.wayToUnlock) " +
            "from PickupFavorite pf " +
            "join Pickup p on p.id = pf.idpickup.id " +
            "join Pill p2 on p.id = p2.id " +
            "where pf.iduser.id = :idUser")
    List<PillResponse> getPillsFavoriteByUser(@Param("idUser") int idUser);
}
