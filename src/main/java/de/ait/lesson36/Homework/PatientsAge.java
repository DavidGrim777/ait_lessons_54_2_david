package de.ait.lesson36.Homework;

import java.time.LocalDate;
import java.time.Period;

public class PatientsAge {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1989, 10, 17);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        int years = age.getYears();
        int month = age.getMonths();
        int days = age.getDays();
        System.out.println("возраста пациента: " + years + "лет, " + month + "месяцев, " + days + "дней.");
    }
}
