package de.ait.lesson32.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseTest {

    @Test
    void testCalculatePriceWithoutGarage(){

        //Arrange
        House house = new House("22 Grin St", 100.0, 50.0, false);
        double expectedPrice = 90000.0;

        //Act
        double actualPrice = house.calculatePrice();

        //Assert
        assertEquals(expectedPrice, actualPrice);
    }
    @Test
    void testCalculatePriceWithGarage(){

        //Arrange
        House house = new House("22 Grin St", 100.0, 50.0, true);
        double expectedPrice = 95000.0;

        //Act
        double actualPrice = house.calculatePrice();

        assertEquals(expectedPrice, actualPrice);
    }
}
