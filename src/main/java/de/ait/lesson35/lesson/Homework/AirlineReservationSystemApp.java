package de.ait.lesson35.lesson.Homework;

import com.github.javafaker.Faker;

public class AirlineReservationSystemApp {
    public static void main(String[] args) {
        AirlineReservationSystem system = new AirlineReservationSystem();
        Faker faker = new Faker();

        try {
            system.reserveSeat("SU100", 1, faker.name().fullName());
            system.reserveSeat("BA202", 5, faker.name().fullName());

            system.reserveSeat("SU100", 1, faker.name().fullName());
        } catch (IllegalArgumentException | SeatUnavailableException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
        try {
            system.cancelReservation("SU100", 1);

            system.cancelReservation("SU100", 1);
        } catch (IllegalArgumentException | SeatUnavailableException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
    }
}
