package de.ait.com.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        System.out.println(animal.getName() + " is " + animal.getAge() +
                " years old and says: " + animal.makeSound());
        animal.eat("grass");
        Bird bird = new Bird("Tweety", "yellow"); bird.fly();
    }
}
