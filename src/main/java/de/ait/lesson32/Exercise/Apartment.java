package de.ait.lesson32.Exercise;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Apartment implements Property {
    private String address;
    private int floor;
    private double area;
    private boolean hasElevator;

    public Apartment(String address, int floor, double area, boolean hasElevator) {
        this.address = address;
        this.floor = floor;
        this.area = area;
        this.hasElevator = hasElevator;
    }

    @Override
    public double calculatePrice() {
        int pricePerSquareMeter = 1000;
        double price = pricePerSquareMeter * area;
        if (hasElevator) {
            price = price * 1.05;
        }
        log.info("Price calculation for an apartment: {}", price);
        return price;

    }

    @Override
    public void printDetails() {
        log.info("Printing details for an apartment");
        System.out.println("Apartment:");
        System.out.println("Address: " + address);
        System.out.println("Floor: " + floor);
        System.out.println("Area" + area + " square meters");
        if (hasElevator) {
            System.out.println("Has an elevator: Yes");
        } else {
            System.out.println("Has an elevator: No");
        }
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }

    public double getArea() {
        return area;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

}
