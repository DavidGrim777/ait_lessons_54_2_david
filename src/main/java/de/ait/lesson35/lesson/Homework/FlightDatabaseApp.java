package de.ait.lesson35.lesson.Homework;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightDatabaseApp {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        Faker faker = new Faker();

        try {
            flightDatabase.addPassenger(3, faker.name().fullName());
            flightDatabase.addPassenger(5, faker.name().fullName());
            flightDatabase.addPassenger(7, faker.name().fullName());
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException exception){
            log.error(exception.getMessage());
            System.out.println(exception.getMessage());
        }
        try {
            flightDatabase.getPassenger(5);
            flightDatabase.getPassenger(10);
        }catch (NoPassengerException | ArrayIndexOutOfBoundsException exception){
            log.error(exception.getMessage());
            System.out.println(exception.getMessage());
        }
    }
}
