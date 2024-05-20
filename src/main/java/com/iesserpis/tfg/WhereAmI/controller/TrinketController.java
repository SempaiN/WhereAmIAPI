package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.entity.Trinket;
import com.iesserpis.tfg.WhereAmI.repository.TrinketRepository;
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
}