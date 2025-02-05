package de.ait.lesson36.Homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalculatingNextAppointment {
    public static void main(String[] args) {
        LocalDate lastVisitDate = LocalDate.of(2023, 2, 10);
        System.out.println("дату последнего визита: "+ lastVisitDate);

        LocalDate nextVisitDate = lastVisitDate.plusMonths(6);
        System.out.println("Дата следующего визита: " + nextVisitDate);

        if (nextVisitDate.getDayOfWeek().getValue() == 6){
            nextVisitDate = nextVisitDate.plusDays(2);
        }else if (nextVisitDate.getDayOfWeek().getValue() == 7){
            nextVisitDate = nextVisitDate.plusDays(1);
        }
        System.out.println("Дата следующего визита: " + nextVisitDate.getDayOfMonth() + " " +
                nextVisitDate.getMonth() + " " + nextVisitDate.getYear());
    }
}
