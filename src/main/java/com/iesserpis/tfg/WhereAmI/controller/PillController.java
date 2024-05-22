package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.responesAPI.PillResponse;
import com.iesserpis.tfg.WhereAmI.repository.PillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tboi/pills")
public class PillController {

    @Autowired
    private PillRepository pillRepository;

    @GetMapping("/")
    public List<PillResponse> getAllPills() {
        return pillRepository.findAllPills();
    }

    @GetMapping("/{id}")
    public PillResponse getPillById(@PathVariable int id) {
        return pillRepository.findOnePill(id);
    }
}
