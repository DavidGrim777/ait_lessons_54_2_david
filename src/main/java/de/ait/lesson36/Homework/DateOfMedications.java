package de.ait.lesson36.Homework;

import java.time.LocalDate;
import java.time.Period;

public class DateOfMedications {
    public static void main(String[] args) {
        LocalDate productionDate = LocalDate.of(2021, 3, 15);
        System.out.println("Дата производства: " + productionDate);

        int shelfLifeMonths = 24;
        LocalDate expirationDate = productionDate.plusMonths(shelfLifeMonths);
        System.out.println("Срок хранения: " + shelfLifeMonths + " месяца");

        LocalDate currentDate = LocalDate.now();
        System.out.println("Лекарство годно до: " + expirationDate);

        Period period = Period.between(expirationDate, currentDate);
        if (!period.isNegative()){
            System.out.println("Статус: ПРОСРОЧЕНО!");
        }else {
            System.out.println("Статус: ГОДНО!");
        }
    }
}
