package de.ait.lesson32.Exercise;

import java.util.concurrent.Callable;

public class PropertyManager {

    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

        Apartment apartment = new Apartment("11 Grim St", 6, 90.0, true);
        agency.addProperty(apartment);
        System.out.println("..............................................");

        House house = new House("22 Grin St", 120.0, 250.0, true);
        agency.addProperty(house);
        System.out.println("..............................................");

        CommercialProperty office = new CommercialProperty("13 Dalina St", 200.0, "Office");
        agency.addProperty(office);
        System.out.println("..............................................");

        CommercialProperty warehouse = new CommercialProperty("14 Dalina St", 400.0, "Warehouse");
        agency.addProperty(warehouse);

        agency.printAllDetails();

        agency.calculateTotalPrice();


            }
}
