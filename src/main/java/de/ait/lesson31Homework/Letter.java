package de.ait.lesson31Homework;

public class Letter extends MailItem {

    private boolean isRegistered;

    public Letter(String sender, String recipient, double weight, boolean isRegistered) {
        super(sender, recipient, weight);
        this.isRegistered = isRegistered;

    }


    @Override
    public double calculateShippingCost() {
        if (isRegistered) {
            return 10;
        } else {
            return 5;
        }
    }
}
