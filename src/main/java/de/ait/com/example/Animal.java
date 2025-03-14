package de.ait.com.example;

public class Animal {
    private String name;
    private int age;

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String makeSound() {
        return "Some animal sound";
    }
}

