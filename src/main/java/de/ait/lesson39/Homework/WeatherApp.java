package de.ait.lesson39.Homework;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static de.ait.lesson39.Homework.WeatherTestData.getWeatherList;

public class WeatherApp {

    public static List<Weather> weatherList = getWeatherList();

    public static void main(String[] args) {
        //Задание 1: Фильтрация данных по температуре 1. Найти все записи (Weather), у которых температура опускается ниже нуля.
        // 2. Вывести результат в удобном для вас формате (например, список или строку).
        //Подсказка • Используйте фильтрацию (filter) по условию temperature < 0.

        List<Weather> temperatureBelowZero = getWeatherList().stream()
                .filter(weather -> weather.getTemperature() < 0)
                .collect(Collectors.toList());

        System.out.println("Города с температурой ниже 0°C: ");
        for (Weather weather : temperatureBelowZero){
            System.out.println(weather.getCity());
        }
    }




    //Задание 2: Проверка условий и нахождение максимума
    //Состоит из двух частей: 1. Определить, есть ли хотя бы один город с температурой выше определённого порога (например, 25 градусов).
    // 2. Найти город (объект Weather) с максимальной температурой.
    //Подсказка • Для проверки какого-либо условия можно использовать anyMatch. • Для поиска максимума используйте max с Comparator по температуре.

    boolean higherTemperature = weatherList.stream()
            .anyMatch(weather -> weather.getTemperature() > 25);

    Optional<Weather> hottestCity = weatherList.stream()
            .max(Comparator.comparingDouble(Weather::getTemperature));


    //Подсчёт средней температуры с помощью mapToDouble и average().

    double averageTemperature = weatherList.stream()
            .mapToDouble(Weather::getTemperature)
            .average()
            .orElse(0.0);








}








