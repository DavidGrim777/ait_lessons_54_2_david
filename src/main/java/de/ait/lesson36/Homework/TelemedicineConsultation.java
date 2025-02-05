package de.ait.lesson36.Homework;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TelemedicineConsultation {
    public static void main(String[] args) {
        ZonedDateTime doctorTime = ZonedDateTime.of(2024, 6, 12, 15, 0, 0, 0,
                ZoneId.of("Europe/Berlin"));
        System.out.println("Время консультации для врача: " + doctorTime);

        ZonedDateTime patientTime = doctorTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Время консультации для пациента: " + patientTime);
    }
}
