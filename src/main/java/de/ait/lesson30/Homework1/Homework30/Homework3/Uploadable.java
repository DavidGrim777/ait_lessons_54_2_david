package de.ait.lesson30.Homework1.Homework30.Homework3;

public interface Uploadable {
    void uploadMedia(String filePath);

    default void checkFileType(String filmPath) {
        System.out.println("Checking file type for: " + filmPath);
    }
}
