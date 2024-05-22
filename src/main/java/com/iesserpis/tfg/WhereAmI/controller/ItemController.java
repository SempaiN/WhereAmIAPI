package com.iesserpis.tfg.WhereAmI.controller;

import com.iesserpis.tfg.WhereAmI.entity.Item;
import com.iesserpis.tfg.WhereAmI.repository.ItemRepository;
import com.iesserpis.tfg.WhereAmI.responesAPI.ResponseItemModifies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tboi/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/")
    public List<Item> getItems() {
//        ItemResponse = new ItemResponse(itemRepository.count, itemRepository.findAll())
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable int id) {
        return itemRepository.findById(id).orElse(null);
    }

    @GetMapping("/get_stats_changes/{id}")
    public List<ResponseItemModifies> getItemChanges(@PathVariable int id) {
        return itemRepository.getStatChanges(id);
    }
}
