package de.ait.com.example;

public class Bird {
    private String name;
    private String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void fly() {
        System.out.println(name + " the " + color + " bird is flying!");
    }
}