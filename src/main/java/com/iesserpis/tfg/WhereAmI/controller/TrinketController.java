package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.entity.Trinket;
import com.iesserpis.tfg.WhereAmI.repository.TrinketRepository;
import com.iesserpis.tfg.WhereAmI.responesAPI.ResponseObjectModifies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tboi/trinkets")
public class TrinketController {

    @Autowired
    private TrinketRepository trinketRepository;

    @GetMapping("/")
    public List<Trinket> getTrinkets() {
        return trinketRepository.findAll();
    }

    @GetMapping("/{id}")
    public Trinket getTrinket(@PathVariable int id) {
        return trinketRepository.findById(id).orElse(null);
    }

    @GetMapping("/trinket_modifies/{id}")
    public List<ResponseObjectModifies> getStatsTrinketModifies(@PathVariable int id) {
        return trinketRepository.getItemModified(id);
    }

    @GetMapping("/getTrinketsFavorites/")
    public List<Integer> getFavoriteTrinkets() {
        return trinketRepository.getTrinketsFavorites();
    }

    @GetMapping("/get_trinkets_unlockables/")
    public List<Trinket> getTrinketsUnlockables() {
        return trinketRepository.getTrinketUnlockables();
    }
}






