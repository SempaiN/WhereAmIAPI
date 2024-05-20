package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.entity.Character;
import com.iesserpis.tfg.WhereAmI.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tboi/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping("/get_item_character/{id}")
    public List<String> getItemsCharacters(@PathVariable int id) {
        return characterRepository.findItemCharacter(id);
    }
    @PostMapping("/new")
    public Character newCharacter(@RequestBody Character character) {
        return characterRepository.save(character);
    }
    @GetMapping("/{id}")
    public Character getCharacter(@PathVariable int id) {
        return characterRepository.findById(id).orElse(null);
    }

    @GetMapping("/stats/{id}")
    public List<Map<String, Double>> getCharacterStats(@PathVariable int id) {
        return characterRepository.getCharacterStats(id);
    }
    @GetMapping("/")
    public List<Character> getCharactersDefault(){
        return characterRepository.getCharactersNotCustom();
    }

}
