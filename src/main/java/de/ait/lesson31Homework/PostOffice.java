package de.ait.lesson31Homework;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Slf4j

public class PostOffice extends MailItem{

    private List<MailItem> mailItems;

    public PostOffice() {
        super();
        mailItems = new ArrayList<>();
        log.info("The post office has been established.");
    }

    @Override
    public double calculateShippingCost() {
        return 0;
    }


    public void addMailItem(MailItem item) {
        mailItems.add(item);
        log.info("The postal item has been added to the system.");
    }

    public void calculateTotalShippingCost() {
        double totalCost = 0;
        for (MailItem item : mailItems) {
            totalCost = totalCost + item.calculateShippingCost();
        }
        log.info("Total shipping cost: {} euro", totalCost);
        System.out.println("Total shipping cost: " + totalCost + " euro");
    }
    public void printAllDetails() {
        for (MailItem item : mailItems) {
            item.printDetails();
            System.out.println("Shipping cost: " + item.calculateShippingCost() + " euro");
            System.out.println("---------------------------------------");
        }
    }
}
