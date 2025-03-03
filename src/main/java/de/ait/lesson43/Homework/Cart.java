package de.ait.lesson43.Homework;

/*3. Обобщённый класс Cart<T extends Product>
Определите класс, моделирующий «корзину» для определённого типа товаров.
Задайте в классе поле для хранения списка товаров (например, List<T>).
Добавьте методы для работы с корзиной:
добавление товара;
удаление товара по названию;
подсчёт итоговой стоимости;
вывод информации о каждом товаре в корзине.*/

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Cart <T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct (T product){
        products.add(product);
        log.info("Product {} addet to Cart", product.getName() );
    }
    public T removeProduct(String name){
        for (T product : products){
            if (product.getName().equals(name)){
                products.remove(product);
                log.info("Product {} removed from Cart", product.getName());
                return product;
            }
        }
        return null;
    }

    public double getTotalPrice(){
        double total = 0;
        for (T product : products){
            total = total + product.getPrice();
        }
        return total;
    }

    public void printAllProducts(){
        if (products.isEmpty()){
            log.error("The cart is empty.");
        }else {
            log.info("Products in cart: ");
            for (T product : products){
                System.out.println(product);
            }
        }
    }
}
