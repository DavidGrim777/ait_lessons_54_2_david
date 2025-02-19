package de.ait.lesson40.Homework;

import java.io.FileWriter;
import java.io.IOException;

public class AddTask {
    public static void main(String[] args) {
        String newTask = "Погулять с собакой";
        try {
            FileWriter writer = new FileWriter("listTasks.txt");
            writer.write(newTask + "\n");
            writer.close();
            System.out.println("All tasks have been successfully added!");
        } catch (IOException exception) {
            System.out.println("Error writing to file!");
            exception.printStackTrace();
        }
    }


}
