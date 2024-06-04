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
}
