package de.ait.lesson35.lesson.Homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightDatabase {
    private String[] flights = {"SU100", "BA202", "LH300", "AF101", "AA777"};
    private String[] passengers = new String[5];

    public void addPassenger(int flightIndex, String passengerName){
        if (flightIndex < 0 || flightIndex >=flights.length){
            log.error("Некорректный индекс рейса: {}", flightIndex);
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс рейса: " + flightIndex);
        }
        if (passengerName == null || passengerName.isEmpty()){
            log.error("Имя пассажира пустое или null");
            throw new IllegalArgumentException("Имя пассажира пустое или null");
        }
        passengers[flightIndex] = passengerName;
        log.info("Пассажир {} добавлен на рейс {}", passengerName, flights[flightIndex]);
    }
    public String getPassenger(int flightIndex) throws NoPassengerException {
        if (flightIndex < 0 || flightIndex >= flights.length){
            log.error("Некорректный индекс рейса: {}", flightIndex);
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс рейса: " + flightIndex);
        }
        if (passengers[flightIndex] == null){
            log.error("Для рейса {} нет пассажира", flights[flightIndex]);
            throw new NoPassengerException("Для рейса " + flights[flightIndex] + " нет пассажира");
        }
        return passengers[flightIndex];
    }

}
