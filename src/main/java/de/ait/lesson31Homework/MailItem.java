package de.ait.lesson31Homework;

public abstract class MailItem {
    protected String sender;
    protected String recipient;
    protected double weight;

    public MailItem(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public MailItem() {

    }

    public abstract double calculateShippingCost();

    public void printDetails(){
        System.out.println("Отправитель: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Weight:" + weight + " kg");
    }
    /*@Override
    public String toString() {
        return "MailItem{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                '}';
    }*/
}
