package de.ait.lesson37.Homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Geography {
    public static void main(String[] args) {

        //1. Фильтрация стран по первой букве

        List<String> countriesLonger = Arrays.asList("Germany", "France", "Brazil", "Argentina", "Canada", "China", "Australia", "India");

        List<String> resultCountries = countriesLonger.stream().filter(countriesName -> countriesName.startsWith("C")).collect(Collectors.toList());
        System.out.println("1.The countries whose names start with the letter (C): " + resultCountries);

        System.out.println("..................................................................");

        //2. Фильтрация городов по длине названия

        List<String> cities = Arrays.asList("Berlin", "Buenos Aires", "Paris", "Los Angeles", "New York", "London", "Beijing");

        List<String> resultCities = cities.stream().filter(citiesName -> citiesName.length() > 6).collect(Collectors.toList());
        System.out.println("2.The cities whose names are longer than 6 characters: " + resultCities);

        System.out.println("..................................................................");

        //3. Фильтрация рек с четным количеством букв в названии

        List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");

        List<String> resultRivers = rivers.stream().filter(riversName -> riversName.length() %2 == 0).collect(Collectors.toList());
        System.out.println("3.The rivers whose names have an even number of letters: " + resultRivers);

        System.out.println("..................................................................");

        //4. Фильтрация континентов по количеству символов

        List<String> continents = Arrays.asList("Europe", "Asia", "Africa", "Australia", "Antarctica", "South America", "North America");

        List<String> resultContinentsShorter = continents.stream().filter(continentsName -> continentsName.length() < 7).collect(Collectors.toList());
        System.out.println("4.The continents whose names are shorter than 7 characters: " + resultContinentsShorter);

        System.out.println("..................................................................");

        //5. Фильтрация стран с названием из 6 букв

        List<String> countries = Arrays.asList("Mexico", "Sweden", "Brazil", "Russia", "Canada", "France", "Norway");

        List<String> resultContinentsConsist = countries.stream().filter(countriesName -> countriesName.length() == 6).collect(Collectors.toList());
        System.out.println("5.The countries whose names consist of 6 letters: " + resultContinentsConsist);

        System.out.println("..................................................................");

        //6. Поиск стран с названием, содержащим букву "a"

        List<String> resultCountriesContainA  = countries.stream().filter(countriesName -> countriesName.contains("a")).collect(Collectors.toList());
        System.out.println("6.The countries whose names contain the letter (a): " + resultCountriesContainA);

        System.out.println("..................................................................");

        //7. Фильтрация городов по последней букве

        List<String> resultcitiesEndO  = cities.stream().filter(citiesEndOName -> citiesEndOName.endsWith("o")).collect(Collectors.toList());
        System.out.println("7.The cities whose names end with (o): " + resultcitiesEndO);

        System.out.println("..................................................................");

        //8. Определение рек, содержащих более 7 букв

        List<String> resultRiversMoreLetters = rivers.stream().filter(riversName -> riversName.length() > 7).collect(Collectors.toList());
        System.out.println("8.The rivers whose names contain more than 7 letters: " + resultRiversMoreLetters);

        System.out.println("..................................................................");

        //9. Фильтрация континентов по первой букве

        List<String> resultContinentsFirstLetter = continents.stream().filter(continentsName -> continentsName.startsWith("A")).collect(Collectors.toList());
        System.out.println("9.The continents whose names start with (A): " + resultContinentsFirstLetter);












    }
}
