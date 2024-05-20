package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.entity.CharacterUserResponse;
import com.iesserpis.tfg.WhereAmI.entity.User;
import com.iesserpis.tfg.WhereAmI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
}
