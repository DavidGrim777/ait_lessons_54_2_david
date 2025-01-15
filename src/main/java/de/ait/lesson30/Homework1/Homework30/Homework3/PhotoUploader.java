package de.ait.lesson30.Homework1.Homework30.Homework3;

public class PhotoUploader implements Uploadable {

    @Override
    public void uploadMedia(String filePath) {
        checkFileType(filePath);
        if (filePath.contains("jpg") || filePath.contains("png")) {
            System.out.println("Photo uploaded: " + filePath);
        } else {
            System.out.println("Invalid file type for photo upload: " + filePath);
        }
    }

    @Override
    public void checkFileType(String filmPath) {
        Uploadable.super.checkFileType(filmPath);
    }
}
