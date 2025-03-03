package de.ait.lesson43.Homework;

/*4. Демонстрация работы
Продумайте, как вы будете проверять вашу реализацию в коде (не пишите здесь готовые методы, а только план).
Создайте несколько объектов разных типов (книги, электроника и т.д.), добавьте их в соответствующие корзины.
Попробуйте удалить товар по названию и выведите результат (получилось ли удалить).
Посчитайте суммарную стоимость в корзине после добавления и удаления товаров.
Выведите информацию обо всех товарах, например, при помощи переопределённого метода описания.*/

public class ProductApp {
    public static void main(String[] args) {
        Cart<Book> bookCart = new Cart<>();
        bookCart.addProduct(new Book("Harry Potter", 29.99, "Joanne Rowling"));
        bookCart.addProduct(new Book("The Lord of the Rings", 39.99, "John Ronald Reuel Tolkien"));
        bookCart.addProduct(new Book("Game of Thrones", 34.99, "George Raymond Richard Martin"));
        bookCart.addProduct(new Book("House of the Dragon", 32.99, "George Raymond Richard Martin"));

        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addProduct(new Electronics("Iphone", 900, "Apple"));
        electronicsCart.addProduct(new Electronics("Tablet", 350.50, "Lenovo"));
        electronicsCart.addProduct(new Electronics("Laptop", 599.99, "Acer"));
        electronicsCart.addProduct(new Electronics("Washing machine", 430.95, "Siemens"));

        System.out.println("Books Cart: ");
        bookCart.printAllProducts();
        System.out.println("Total Price: " + bookCart.getTotalPrice());

        System.out.println("...................................");

        bookCart.removeProduct("The Lord of the Rings");
        System.out.println("After removing a book: ");
        bookCart.printAllProducts();
        System.out.println("Total price: " + bookCart.getTotalPrice());

        System.out.println("....................................");

        System.out.println("Electronics Cart: ");
        electronicsCart.printAllProducts();
        System.out.println("Total Price: " + electronicsCart.getTotalPrice());
    }

}
