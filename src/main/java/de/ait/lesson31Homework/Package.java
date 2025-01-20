package de.ait.lesson31Homework;

public class Package extends MailItem {
    private double length;
    private double width;
    private double height;

    public Package(String sender, String recipient, double weight, double length, double width, double height) {
        super(sender, recipient, weight);
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateShippingCost() {
        return 2 * weight;
    }
}
