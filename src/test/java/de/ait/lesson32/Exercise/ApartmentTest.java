package de.ait.lesson32.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApartmentTest {

    @Test
    void testCalculatePriceWithoutElevator() {

        //Arrange
        Apartment apartment = new Apartment("11 Grim St", 2, 50.0, false);
        double expectedPrice = 50000.0;

        //Act
        double actualPrice = apartment.calculatePrice();

        //Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void testCalculatePriceWithElevator() {

        //Arrange
        Apartment apartment = new Apartment("11 Grim St", 2, 50.0, true);
        double expectedPrice = 52500.0;

        //Act
        double actualPrice = apartment.calculatePrice();

        //Assert
        assertEquals(expectedPrice, actualPrice);
    }
}
