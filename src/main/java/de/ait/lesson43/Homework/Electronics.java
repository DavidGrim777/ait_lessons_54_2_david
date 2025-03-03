package de.ait.lesson43.Homework;

public class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void getDescription() {
        System.out.println("Electronics: " + getName() + " brand: " + getBrand() + " Price: " + getPrice());

    }
}
