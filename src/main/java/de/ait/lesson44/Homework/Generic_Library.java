package de.ait.lesson44.Homework;

/*Напишите тестовый класс (например, Main), в котором:
Создайте Library<PaperBook>, добавьте несколько бумажных книг, выведите их.
Создайте Library<EBook>, добавьте несколько электронных книг, найдите и удалите одну по названию,
затем снова выведите оставшиеся.*/

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class Generic_Library {
    public static void main(String[] args) {

        Library<PaperBook> paperBookLibrary = new Library<>();
        paperBookLibrary.addBook(new PaperBook("Harry Potter", "Joanne Rowling", 500));
        paperBookLibrary.addBook(new PaperBook("The Lord of the Rings", "John Ronald Reuel Tolkien", 700));
        paperBookLibrary.addBook(new PaperBook("Game of Thrones", "George Raymond Richard Martin", 1000));
        paperBookLibrary.addBook(new PaperBook("House of the Dragon", "George Raymond Richard Martin", 850));

        System.out.println("Books Library: ");
        paperBookLibrary.listBooks();
        System.out.println("...................................");

        Library<EBook> eBookLibrary = new Library<>();
        eBookLibrary.addBook(new EBook("Iron Flame", "Rebecca Yarros", 10.1 ));
        eBookLibrary.addBook(new EBook("The War of the Worlds", "H.G. Wells", 0.3 ));
        eBookLibrary.addBook(new EBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 0.6 ));
        eBookLibrary.addBook(new EBook("Foundation", "Isaac Asimov", 0.5 ));

        System.out.println("E-Books Library: ");
        eBookLibrary.listBooks();
        System.out.println("...................................");

        eBookLibrary.removeBook("The Hitchhiker's Guide to the Galaxy");
        System.out.println("After removing a E-Book: ");
        eBookLibrary.listBooks();
    }
}
