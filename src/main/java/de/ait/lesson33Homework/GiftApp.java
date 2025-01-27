package de.ait.lesson33Homework;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Scanner;

@Slf4j
public class GiftApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiftManager manager = new GiftManager();


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a gift");
            System.out.println("2. Show all gifts");
            System.out.println("3. Filter gifts by category");
            System.out.println("4. Update gift status");
            System.out.println("5. Exit");
            System.out.print("Select an action: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {    //Добавление подарка
                    System.out.print("Enter the name of the gift: ");
                    log.info("The user chooses to add a new gift.");

                    String name = scanner.nextLine();
                    if (name == null || name.isEmpty()) {
                        System.out.println("Gift name cannot be empty.");
                        log.warn("Attempt to add a gift with an empty name.");
                        break;
                    }
                    System.out.println("Select category: 1. ELECTRONICS, 2. TOYS, 3. BOOKS, " +
                            "4. CLOTHING, 5. HOME_APPLIANCES");
                    int categoryChoice = scanner.nextInt();
                    scanner.nextLine();
                    GiftCategory category = GiftCategory.values()[categoryChoice - 1];
                    System.out.println("Select status: 1. AVAILABLE, 2. OUT_OF_STOCK, " +
                            "3. RESERVED, 4. DELIVERED");
                    int statusChoice = scanner.nextInt();
                    scanner.nextLine();
                    GiftStatus status = GiftStatus.values()[statusChoice - 1];
                    manager.addGift(new Gift(name, category, status));
                    System.out.println("Gift added!");
                }

                case 2 -> {   //Показ всех подарков
                    ArrayList<Gift> allGifts = manager.getAllGifts();
                    if (allGifts == null || allGifts.isEmpty()) {
                        System.out.println("The gift list is empty.");
                    } else {
                        System.out.println("List of all gifts:");
                        for (Gift gift : allGifts) {
                            System.out.println(gift);
                        }
                    }
                }

                case 3 -> {   //Фильтрация подарков по категории
                    System.out.println("Select category: 1. ELECTRONICS, 2. TOYS, 3. BOOKS," +
                            " 4. CLOTHING, 5. HOME_APPLIANCES");
                    log.info("The user has chosen to filter gifts by category.");

                    int filterChoice = scanner.nextInt();
                    scanner.nextLine();
                    GiftCategory filterCategory = GiftCategory.values()[filterChoice - 1];
                    ArrayList<Gift> filteredGifts = manager.filterByCategory(filterCategory);

                    System.out.println("Gifts in category " + filterCategory + ":");
                    log.info("Found {} gifts in category {}.", filteredGifts.size(),filterCategory);

                    for (Gift gift : filteredGifts) {
                        System.out.println(gift);
                    }
                }

                case 4 -> {    //Обновление статуса подарка
                    System.out.print("Enter the name of the gift to update the status: ");
                    log.info("gift status update.");

                    String giftName = scanner.nextLine();
                    if (giftName == null || giftName.isEmpty()) {
                        System.out.println("Gift name cannot be empty.");
                        log.warn("Attempting to update status with empty gift name.");
                        break;
                    }
                    System.out.println("Select a new status: 1. AVAILABLE, 2. OUT_OF_STOCK, " +
                            "3. RESERVED, 4. DELIVERED");
                    int newStatusChoice = scanner.nextInt();
                    scanner.nextLine();
                    GiftStatus newStatus = GiftStatus.values()[newStatusChoice - 1];
                    boolean updated = manager.updateGiftStatus(giftName, newStatus);
                    if (updated) {
                        System.out.println("Gift status updated!");
                    } else {
                        System.out.println("Gift with this name not found.");
                    }
                }

                case 5 -> {   //Выход из программы
                    System.out.println("Thank you for using!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Incorrect selection. Please try again.");
            }
        }
    }
}
