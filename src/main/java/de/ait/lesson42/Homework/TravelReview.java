package de.ait.lesson42.Homework;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


@Slf4j
public class TravelReview {
    public static void main(String[] args) {
        Path filePath = Path.of("travel_review.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your travel review:");
        String reviw = scanner.nextLine();

        try {
            Files.writeString(filePath, reviw + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Your review has been saved!");
        } catch (IOException exception) {
            log.error("Error writing review: {}", exception.getMessage());
        }
    }
}
