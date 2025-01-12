package de.ait.homework29;

public class PremiumUser extends User {
    private int subscriptionEndDate;


    public PremiumUser(int id, String name, String email, int subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }
    public boolean isSubscriptionActive(int currentDate){
        return currentDate <= subscriptionEndDate;
    }

    @Override
    public void printInfo(){
        System.out.println("Subscription Active: " + isSubscriptionActive(20250112));
    }
    @Override
    public void checkPermissions(){
        System.out.println(name + " has premium user permissions.");
    }


}
