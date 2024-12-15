package de.ait.com.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bird {
    private String name;
    private String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
        log.info("Created a Bird: " + name + ", color: " + color);
    }

    public void fly() {
        log.info(name + " the " + color + " bird is flying!");
        System.out.println(name + " the " + color + " bird is flying!");
    }
}