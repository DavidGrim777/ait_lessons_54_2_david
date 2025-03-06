package de.ait.lesson44.Homework;

/*Создайте два (или больше) конкретных класса-наследника Book:

EBook:
Дополнительное поле: double fileSizeMb (размер файла в мегабайтах).
Переопределённый метод getDescription(), возвращающий строку вида:
"E-Book: <title> by <author> (File size: <fileSizeMb> MB)"*/

public class EBook extends Book {
    private double fileSizeMb;

    public EBook(String title, String author, double fileSizeMb) {
        super(title, author);
        this.fileSizeMb = fileSizeMb;
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }

    @Override
    public void getDescription() {
        System.out.println("EBook: " + getTitle() + " by " + getAuthor() + " (File size: " + fileSizeMb + " MB)");
    }
}
