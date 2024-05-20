package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.entity.Pickup;
import com.iesserpis.tfg.WhereAmI.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tboi/pickups")
public class PickupController {

    @Autowired
    private PickupRepository pickupRepository;

    @GetMapping("/")
    public List<Pickup> getAllPickups() {
        return pickupRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pickup getPickupById(@PathVariable int id) {
        return pickupRepository.findById(id).orElse(null);
    }


}
