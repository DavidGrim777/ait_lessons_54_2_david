package de.ait.lesson35.lesson.Homework;

import java.util.HashMap;
import java.util.Map;

public class AirlineReservationSystem {

    private Map<String, Map<Integer, Boolean>> flights;

    public AirlineReservationSystem() {
        flights = new HashMap<>();

        Map<Integer, Boolean> su100Seats = new HashMap<>();
        su100Seats.put(1, false);
        su100Seats.put(2, false);
        su100Seats.put(3, false);
        flights.put("SU100", su100Seats);

        Map<Integer, Boolean> ba202Seats = new HashMap<>();
        ba202Seats.put(10, false);
        ba202Seats.put(11, false);
        flights.put("BA202", ba202Seats);
    }

    public void reserveSeat(String flightNumber, int seatNumber, String passengerName) throws SeatUnavailableException {
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Номер рейса не может быть пустым.");
        }
        if (seatNumber <= 0) {
            throw new IllegalArgumentException("Номер места должен быть положительным числом.");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            throw new IllegalArgumentException("Имя пассажира не может быть пустым.");
        }
        Map<Integer, Boolean> seats = flights.get(flightNumber);
        if (seats == null) {
            throw new IllegalArgumentException("Рейс " + flightNumber + " не существует.");
        }
        if (!seats.containsKey(seatNumber)) {
            throw new IllegalArgumentException("Место " + seatNumber + " не существует на рейсе " + flightNumber + ".");
        }
        if (seats.get(seatNumber)) {
            throw new SeatUnavailableException("Место " + seatNumber + " на рейсе " + flightNumber + " уже занято.");
        }
        seats.put(seatNumber, true);
        System.out.println("Место " + seatNumber + " на рейсе "
                + flightNumber + " успешно забронировано для " + passengerName + ".");

    }

    public void cancelReservation(String flightNumber, int seatNumber) throws SeatUnavailableException {
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Номер рейса не может быть пустым.");
        }
        if (seatNumber <= 0) {
            throw new IllegalArgumentException("Номер места должен быть положительным числом.");
        }
        Map<Integer, Boolean> seats = flights.get(flightNumber);
        if (seats == null) {
            throw new IllegalArgumentException("Рейс " + flightNumber + " не существует.");

        }
        if (!seats.containsKey(seatNumber)) {
            throw new IllegalArgumentException("Место " + seatNumber + " не существует на рейсе " + flightNumber + ".");
        }
        if (!seats.get(seatNumber)) {
            throw new SeatUnavailableException("Место " + seatNumber + " на рейсе " + flightNumber + " уже свободно.");
        }
        seats.put(seatNumber, false);
        System.out.println("Бронирование места " + seatNumber + " на рейсе " + flightNumber + " отменено.");
    }
}
