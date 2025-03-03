package de.ait.lesson43.Homework;

/*2. Потомки класса Product
Создайте, как минимум, два конкретных класса, наследующих Product. Например, «Книга» и «Электроника».
Добавьте каждому классу собственное специфичное поле:
«автор» у книг;
«бренд» у электроники.
Переопределите метод описания товара так, чтобы он учитывал специфичные поля
(например, «Книга [название] от [автор], цена: …»).*/

public class Book extends Product{
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void getDescription() {
        System.out.println("Book: " + getName() + " Author: " + getAuthor() + " Price: " + getPrice());
    }
}
