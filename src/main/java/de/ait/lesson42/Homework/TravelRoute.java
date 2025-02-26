package de.ait.lesson42.Homework;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Slf4j
public class TravelRoute {
    public static void main(String[] args) {
        Path path = Path.of("travel_route.txt");
        printTravelRoute(path);
    }
    public static void printTravelRoute(Path path){
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println("Travel Route:");
            int index = 1;
            for (String line : lines){
                System.out.println(index++ + ". " + line);
            }
        } catch (IOException exception) {
            log.error("Error reading file: {}", exception.getMessage());

        }
    }
}
