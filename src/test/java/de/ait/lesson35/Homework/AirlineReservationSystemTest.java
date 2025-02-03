package de.ait.lesson35.Homework;

import com.github.javafaker.Faker;
import de.ait.lesson35.lesson.Homework.AirlineReservationSystem;
import de.ait.lesson35.lesson.Homework.SeatUnavailableException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AirlineReservationSystemTest {

    private AirlineReservationSystem system;
    private Faker faker;

    @BeforeEach
    public void setUp(){
        system = new AirlineReservationSystem();
        faker = new Faker();
    }
    @Test
    void testReserveSeatSuccess(){
        assertDoesNotThrow(() -> system.reserveSeat("SU100", 1, faker.name().fullName()));
    }
    @Test
    void testReserveSeatFailInvalidFlightNumber(){
        assertThrows(IllegalArgumentException.class, () ->
                system.reserveSeat("INVALID", 1, faker.name().fullName()));
    }
    @Test
    void testReserveSeatFailInvalidSeatNumber(){
        assertThrows(IllegalArgumentException.class, () ->
                system.reserveSeat("SU100", -1, faker.name().fullName()));
    }
    @Test
    void testReserveSeatFailEmptyPassengerName(){
        assertThrows(IllegalArgumentException.class, () ->
                system.reserveSeat("SU100", 1, ""));
    }
    @Test
    void testReserveSeatFailSeatUnavailable() throws SeatUnavailableException {
        system.reserveSeat("SU100", 1, faker.name().fullName());
        assertThrows(SeatUnavailableException.class, () ->
                system.reserveSeat("SU100", 1, faker.name().fullName()));
    }
    @Test
    void testCancelReservationSuccess() throws SeatUnavailableException{
        system.reserveSeat("SU100", 1, faker.name().fullName());
        assertDoesNotThrow(() -> system.cancelReservation("SU100", 1));
    }
    @Test
    void testCancelReservationFailInvalidFlightNumber(){
        assertThrows(IllegalArgumentException.class, () -> system.cancelReservation("INVALID", 1));
    }
    @Test
    void testCancelReservationFailInvalidSeatNumber(){
        assertThrows(IllegalArgumentException.class, () -> system.cancelReservation("SU100", -1));
    }
    @Test
    void testCancelReservationFailSeatAlreadyFree(){
        assertThrows(SeatUnavailableException.class, () -> system.cancelReservation("SU100", 1));
    }
}
