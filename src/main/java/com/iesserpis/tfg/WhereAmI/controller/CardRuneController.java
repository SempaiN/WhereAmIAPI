package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.responesAPI.CardRuneResponse;
import com.iesserpis.tfg.WhereAmI.repository.CardRuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tboi/cards_runes")
public class CardRuneController {

    @Autowired
    private CardRuneRepository cardRuneRepository;

    @GetMapping("/")
    public List<CardRuneResponse> getCardRunes() {
        return cardRuneRepository.getAllCardRune();
    }

    @GetMapping("/{id}")
    public CardRuneResponse getCardRune(@PathVariable int id) {
        return cardRuneRepository.getCardRune(id);
    }

}
