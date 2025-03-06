package de.ait.lesson44.Homework;

/*Создайте абстрактный класс Book:
Поля: String title (название), String author (автор).
Конструктор, принимающий title и author.
Абстрактный метод String getDescription(): возвращает строку-описание книги.*/

public abstract class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void getDescription();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
