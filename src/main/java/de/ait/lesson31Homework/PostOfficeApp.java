package de.ait.lesson31Homework;

public class PostOfficeApp {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        postOffice.addMailItem(new Letter("Leonardo", "Bred", 0.05, true));
        postOffice.addMailItem(new Package("Scarlett", "Chris", 2.5, 30, 20, 15));
        postOffice.addMailItem(new Advertisement("Tom", "All residents of Hollywood", 0.1, 100));

        postOffice.calculateTotalShippingCost();

        postOffice.printAllDetails();
    }
}
