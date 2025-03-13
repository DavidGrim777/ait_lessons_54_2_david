package lesson46;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class homework_java_time_api {
    public static void main(String[] args) {

        //10 заданий по теме Java Time API

        /*  1.Получение текущих даты и времени
Создайте объекты LocalDate, LocalTime и LocalDateTime для текущего момента.
Выведите их в консоль.*/

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        System.out.println("............................................");

        /*  2.Форматирование даты и времени
Возьмите текущий LocalDateTime.
Сформатируйте его в строку вида dd-MM-yyyy HH:mm:ss.
Выведите результат в консоль. */

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Current Date and Time: " + currentDateTime.format(formatter));
        System.out.println("............................................");

        /*  3.Парсинг даты и времени из строки
Считайте с консоли строку формата yyyy-MM-dd HH:mm.
Преобразуйте её в объект LocalDateTime.
Выведите результат в консоль.*/



        /*  4.Работа с часовыми поясами
Получите текущий ZonedDateTime для системной временной зоны.
Переведите это время в другой часовой пояс (например, ZoneId.of("America/New_York")).
Выведите оба результата.*/

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current Date and Time Zone: " + zonedDateTime);

        ZonedDateTime nowInNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time Zone in New York: " + nowInNY);
        System.out.println("............................................");

        /*  5.Вычисление разницы между двумя датами
Создайте два объекта LocalDate (например, дата рождения и текущая дата).
Подсчитайте, сколько дней, месяцев и лет между этими датами, используя Period.
Выведите результат в удобном формате, например:
Прошло N лет, M месяцев и D дней.*/

        LocalDate birthDate = LocalDate.of(1989, 10,17);
        LocalDate newCurrentDate = LocalDate.now();
        Period period = Period.between(birthDate, newCurrentDate);
        System.out.println(period.getYears()+ " years, " + period.getMonths() + " months and " + period.getDays() + " days have passed.");
        System.out.println("............................................");

        /*  6.Работа с интервалами времени (Duration)
Создайте два объекта LocalTime: начало рабочего дня (например, 09:00) и конец рабочего дня (например, 18:00).
Подсчитайте, сколько часов и минут между ними, используя Duration.
Выведите результат.*/

        LocalTime workStart = LocalTime.of(9, 0);
        LocalTime workEnd = LocalTime.of(18, 0);
        Duration duration = Duration.between(workStart, workEnd);
        System.out.println("Between start of the working day and end of the working day: "
                + duration.toHours() + " hours or " + duration.toMinutes() + " minutes.");
        System.out.println("............................................");

        /*  7.Операции сложения и вычитания времени
Создайте объект LocalDateTime для текущего момента.
Добавьте к нему 2 недели, вычтите 3 дня, прибавьте 5 часов.
Выведите получившийся результат в консоль.*/

        LocalDateTime date = LocalDateTime.now().plusWeeks(2).minusDays(3).plusHours(5);
       // LocalDateTime weeks = date.plusWeeks(2);
       // LocalDateTime days = date.minusDays(3);
       // LocalDateTime hours = date.plusHours(5);
        System.out.println("Modified Date and Time: " + date);

        System.out.println("............................................");

        /*  8.Конвертация из старого класса Date
Создайте объект Date (из пакета java.util).
Переведите его в Instant, а затем в LocalDateTime (используя системный часовой пояс).
Выведите результат в консоль.*/

        /*  9.Работа с эпохой (Epoch)
Создайте Instant, соответствующий текущему моменту.
Выведите количество миллисекунд (или секунд) с начала эпохи (1970-01-01T00:00:00Z).
Преобразуйте этот Instant обратно в LocalDateTime в локальном часовом поясе. */

        /*  10.Проверка, прошло ли заданное время
Создайте LocalDateTime, который наступит через 2 часа от текущего момента.
Напишите небольшой цикл или метод, который будет каждые 10 секунд проверять, наступило ли это время.
Как только время наступит – выведите сообщение и завершите проверку.*/







    }
}
