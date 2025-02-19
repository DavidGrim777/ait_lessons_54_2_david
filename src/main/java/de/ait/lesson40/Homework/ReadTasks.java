package de.ait.lesson40.Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTasks {
    public static void main(String[] args) {
        String filePath = "listTasks.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException exception) {
            System.out.println("Error reading file.");
            exception.printStackTrace();
        }
    }
}
