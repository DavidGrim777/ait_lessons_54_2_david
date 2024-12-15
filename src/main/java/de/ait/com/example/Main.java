package de.ait.com.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        log.info(animal.getName() + " is " + animal.getAge() +
                " years old and says: " + animal.makeSound());
        System.out.println(animal.getName() + " is " + animal.getAge() +
                " years old and says: " + animal.makeSound());
        animal.eat("grass");
        Bird bird = new Bird("Tweety", "yellow");
        bird.fly();

    }
}
