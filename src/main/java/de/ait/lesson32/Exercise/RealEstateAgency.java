package de.ait.lesson32.Exercise;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class RealEstateAgency {
    private List<Property> properties;

    public RealEstateAgency() {
        this.properties = new ArrayList<>();
    }

    // — добавляет объект недвижимости в список.
    public void addProperty(Property property) {
        properties.add(property);
    }


    //— выводит общую стоимость всех объектов недвижимости.
    public void calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Property property : properties) {
            totalPrice = totalPrice + property.calculatePrice();
        }
        log.info("Total price: {} euro", totalPrice);
        System.out.println("Total price: " + totalPrice + " euro");
    }


    //— выводит информацию обо всех объектах недвижимости, используя метод printDetails().
    public void printAllDetails() {
        System.out.println("All details:");
        for (Property property : properties) {
            property.printDetails();
            System.out.println("---------------------------------------");
        }

    }

    public List<Property> getProperties() {
        return properties;
    }
}
