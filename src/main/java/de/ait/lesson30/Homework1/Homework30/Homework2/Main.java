package de.ait.lesson30.Homework1.Homework30.Homework2;

public class Main {
    public static void main(String[] args) {
        UserMessenger messenger = new UserMessenger();

        // Отправляем сообщения между пользователями
        messenger.sendMessage("Hi, how are you? ", "user1");
        messenger.sendMessage("Everything is great, thank you! ", "user2");


        // Получаем и выводим сообщения для user1
        System.out.println("Messages for user1: " + messenger.receiveMessages("user1"));

        // Получаем и выводим сообщения для user2
        System.out.println("Messages for user2: " + messenger.receiveMessages("user2"));


    }
}
