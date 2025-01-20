package de.ait.lesson31Homework;

public class Advertisement extends MailItem{
    private int quantity;


    public Advertisement(String sender, String recipient, double weight, int quantity) {
        super(sender, recipient, weight);
        this.quantity = quantity;
    }

    @Override
    public double calculateShippingCost() {
        return (quantity / 50.0) * 1;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Number of copies: " + quantity);
    }
}
