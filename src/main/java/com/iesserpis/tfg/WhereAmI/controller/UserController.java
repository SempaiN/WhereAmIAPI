package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.entity.Character;
import com.iesserpis.tfg.WhereAmI.entity.Item;
import com.iesserpis.tfg.WhereAmI.entity.User;
import com.iesserpis.tfg.WhereAmI.repository.UserRepository;
import com.iesserpis.tfg.WhereAmI.responesAPI.CardRuneResponse;
import com.iesserpis.tfg.WhereAmI.responesAPI.PillResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tboi/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get_characters_user/{id}")
    public List<Character> getCharactersUser(@PathVariable("id") Integer id) {
        return userRepository.getCharactersByUser(id);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/last")
    public User getLastUserId() {
        return userRepository.getLastUser();
    }

    @GetMapping("/get/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return userRepository.getUserByEmail(email);
    }

    @GetMapping("/getFavoriteItems/{id}")
    public List<Item> getItemsFavoriteUser(@PathVariable("id") Integer id) {
        return userRepository.getItemsFavoriteByUser(id);
    }

    @GetMapping("/getFavoriteCardRune/{id}")
    public List<CardRuneResponse> getCardRuneFavoriteUser(@PathVariable("id") int id) {
        return userRepository.getCardRuneFavoritesByUser(id);
    }

    @GetMapping("/getFavoritePill/{id}")
    public List<PillResponse> getPillFavoriteUser(@PathVariable("id") int id) {
        return userRepository.getPillsFavoriteByUser(id);
    }

    @GetMapping("/itemIsFavorite/{idItem}/{idUser}")
    public boolean itemIsFavorite(@PathVariable("idItem") int idItem, @PathVariable("idUser") int idUser) {
        return userRepository.itemIsFavorite(idItem, idUser);
    }

    @PostMapping("/addItemToFavorite/{idItem}/{idUser}")
    public void addItemToFavorite(@PathVariable int idItem, @PathVariable int idUser) {
        userRepository.addItemToFavorite(idItem, idUser);
    }

    @DeleteMapping("/deleteItemFavorite/{idUser}/{idItem}")
    public void deleteItemFavorite(@PathVariable int idUser, @PathVariable int idItem) {
        userRepository.deleteItemFavorite(idUser, idItem);
    }

    @GetMapping("/trinketIsFavorite/{idTrinket}/{idUser}")
    public boolean trinketIsFavorite(@PathVariable("idTrinket") int idTrinket, @PathVariable("idUser") int idUser) {
        return userRepository.trinketIsFavorite(idTrinket, idUser);
    }

    @PostMapping("/addTrinketToFavorite/{idTrinket}/{idUser}")
    public void addTrinketToFavorite(@PathVariable int idTrinket, @PathVariable int idUser) {
        userRepository.addTrinketToFavorite(idTrinket, idUser);
    }

    @DeleteMapping("/deleteTrinketFavorite/{idUser}/{idTrinket}")
    public void deleteTrinketFavorite(@PathVariable int idUser, @PathVariable int idTrinket) {
        userRepository.deleteTrinketFavorite(idUser, idTrinket);
    }

    @GetMapping("/pickupIsFavorite/{idPickup}/{idUser}")
    public boolean pickupIsFavorite(@PathVariable("idPickup") int idPickup, @PathVariable("idUser") int idUser) {
        return userRepository.pickupIsFavorite(idPickup, idUser);
    }

    @PostMapping("/addPickupToFavorite/{idPickup}/{idUser}")
    public void addPickupToFavorite(@PathVariable int idPickup, @PathVariable int idUser) {
        userRepository.addPickupToFavorite(idPickup, idUser);
    }

    @DeleteMapping("/deletePickupFavorite/{idUser}/{idPickup}")
    public void deletePickupFavorite(@PathVariable int idUser, @PathVariable int idPickup) {
        userRepository.deletePickupFavorite(idUser, idPickup);
    }
}

