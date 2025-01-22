package de.ait.lesson32.Exercise;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class CommercialProperty implements Property {
    private String address;
    private double area;
    private String businessType;
    private String officeType = "Office";
    private String warehouseType = "Warehouse";

    public CommercialProperty(String address, double area, String businessType) {
        this.address = address;
        this.area = area;
        this.businessType = businessType;
    }

    @Override
    public double calculatePrice() {
        Map<String, Double> priceProperty = new HashMap<>();
        priceProperty.put(officeType, 1500.0);
        priceProperty.put(warehouseType, 800.0);

        double pricePerSquareMeter = priceProperty.getOrDefault(businessType, 1000.0);
        log.info("Price calculation for a commercial property: {}", pricePerSquareMeter);
        return area * pricePerSquareMeter;
    }

    @Override
    public void printDetails() {
        log.info("Printing details for a commercial property");
        switch (businessType) {
            case "office" -> {
                System.out.println("office: ");
            }
            case "warehouse" -> {
                System.out.println("warehouse: ");
            }
            default -> {
                System.out.println("Other real estate: ");
            }
        }
        System.out.println("Address: " + address);
        System.out.println("Area: " + area + " square meters");

    }
}
