package de.ait.lesson44.Homework;

/*Создайте обобщённый класс Library<T extends Book>:
Поле List<T> books = new ArrayList<>() для хранения книг.
addBook(T book): добавить книгу в библиотеку.
removeBook(String title): найти книгу по названию и удалить, если такая есть.
findBook(String title): вернуть книгу по названию (или null, если не найдена).
listBooks(): вывести getDescription() для каждой книги в библиотеке.*/

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class Library <T extends Book>{
    private List<T> books = new ArrayList<>();

    public void addBook(T book){
        books.add(book);
    }

    public boolean removeBook(String title){
        Iterator<T> iterator = books.iterator();
        while (iterator.hasNext()){
            T currentBook = iterator.next();
            if (title.equals(currentBook.getTitle())){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public T findBook(String title){
        for (T book : books){
            if (book.getTitle().equals(title)){
                log.info("Book {} found in the library.", book.getTitle());
                return book;
            }
        }
        log.error("Book {} not found in the library.", title);
        return null;
    }

    public void listBooks(){
        if (books.isEmpty()){
            log.error("The library is empty.");
        }else {
            log.info("Library Collection: ");
            for (T book : books){
                System.out.println(book);
            }
        }
    }
}
