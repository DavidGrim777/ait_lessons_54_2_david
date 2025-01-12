package de.ait.homework29;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(123, "David1", "david1@gmail.com");
        user1.printInfo();
        user1.checkPermissions();

        System.out.println("-------------------------------");

        User user2 = new User(321, "David2", "david2@gmail.com");
        user2.printInfo();
        user2.checkPermissions();

        System.out.println("-------------------------------");

        PremiumUser premiumUser = new PremiumUser(1234, "Denis", "denis@gmail.com", 20250112);
        premiumUser.printInfo();
        premiumUser.checkPermissions();
        premiumUser.isSubscriptionActive(20250112);

        System.out.println("--------------------------------");

        AdminUser adminUser = new AdminUser(12345, "Daniel", "daniel@gmail.com");
        adminUser.printInfo();
        adminUser.checkPermissions();
        adminUser.banUser(user1);
    }
}
