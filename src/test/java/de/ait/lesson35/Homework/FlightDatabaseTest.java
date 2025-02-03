package de.ait.lesson35.Homework;

import com.github.javafaker.Faker;
import de.ait.lesson35.lesson.Homework.FlightDatabase;
import de.ait.lesson35.lesson.Homework.NoPassengerException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightDatabaseTest {

    private FlightDatabase flightDatabase = null;
    private static Faker faker = null;

    @BeforeEach
    public void setUp(){
        faker = new Faker();
        flightDatabase = new FlightDatabase();
    }
    @Test
    void testAddPassengerSuccess(){
        assertDoesNotThrow(() -> flightDatabase.addPassenger(0, faker.name().fullName()));
    }

    @Test
    void testAddPassengerFailInvalidFlightIndex(){
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> flightDatabase.addPassenger(-2, faker.name().fullName()));
    }

    @Test
    void testAddPassengerFailPassengerNameIsNull(){
        assertThrows(IllegalArgumentException.class, () -> flightDatabase.addPassenger(0, null));
    }

    @Test
    void testGetPassengerSuccess() throws NoPassengerException{
        flightDatabase.addPassenger(0, faker.name().fullName());
        assertDoesNotThrow(() -> flightDatabase.getPassenger(0));
    }

    @Test
    void testGetPassengerFailInvalidFlightIndex(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> flightDatabase.getPassenger(-1));
    }

    @Test
    void testGetPassengerFailNoPassenger(){
        assertThrows(NoPassengerException.class, () -> flightDatabase.getPassenger(0));
    }
}
