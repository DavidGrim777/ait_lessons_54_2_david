package de.ait.lesson43.Homework;

/*1. Абстрактный класс Product
Создайте абстрактный класс, отражающий понятие «товар» (product).
Определите в нём необходимые поля:
название (name);
цена (price).
Реализуйте абстрактный метод, который будет возвращать описание товара (псевдо-метод getDescription()).*/

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void getDescription();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
