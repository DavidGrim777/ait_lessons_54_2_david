package de.ait.lesson30.Homework1.Homework30.Homework3;

public class VideoUploader implements Uploadable {

    @Override
    public void uploadMedia(String filePath) {
        checkFileType(filePath);
        if (filePath.contains("mp4") || filePath.contains("mov")) {
            System.out.println("Video uploaded: " + filePath);
        } else {
            System.out.println("Invalid file type for vido upload: " + filePath);
        }
    }

    @Override
    public void checkFileType(String filmPath) {
        Uploadable.super.checkFileType(filmPath);
    }
}
