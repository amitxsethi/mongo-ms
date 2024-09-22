package com.example.mongo_ms.controller;

import java.util.Arrays;

import com.example.mongo_ms.model.Inventory;
import com.example.mongo_ms.model.Item;
import com.example.mongo_ms.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MongoInventoryController {

    @GetMapping("/mongoInventory")
    public Inventory getInventory() {
        return new Inventory(Arrays.asList(
            new Stock(Item.TV, 20L),
            new Stock(Item.FRIDGE, 20L),
            new Stock(Item.WASHING_MACHINE, 20L)
        ));
    }
}
