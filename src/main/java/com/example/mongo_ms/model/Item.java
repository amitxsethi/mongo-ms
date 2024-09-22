package com.example.mongo_ms.model;

import lombok.Getter;

@Getter
public enum Item {
    TV("Television", 5) ,
    FRIDGE ("Refridgerator", 5) ,
    WASHING_MACHINE ("Washing Machine", 5);

    private final String displayName;
    private final Integer id;

    Item(String displayName, Integer id) {
        this.displayName = displayName;
        this.id = id;
    }

}
