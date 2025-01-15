package de.ait.lesson30.Homework1.Homework30.Homework3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> files = Arrays.asList("photo.jpg", "photo.png", "movie.mp4", "movie.mov");
        for (String file : files) {
            System.out.println("Processing file: " + file);
        }
    }
}
