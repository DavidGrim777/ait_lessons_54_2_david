package de.ait.com.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal {
    private String name;
    private int age;

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
        log.info(name + " is eating " + food + ".");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        log.info("Created an Animal: " + name + ", age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String makeSound() {
        log.info(name + " is making a sound.");
        return "Some animal sound";

    }
}

