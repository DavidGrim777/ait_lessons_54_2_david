package de.ait.lesson33Homework;

import java.util.ArrayList;

public class GiftManager {

    private ArrayList<Gift> gifts;

    public GiftManager(ArrayList<Gift> gifts) {
        this.gifts = new ArrayList<>();
    }

    public GiftManager() {
        gifts = new ArrayList<>();

    }

    public void addGift(Gift gift) {
        try {
            if (gifts == null) {
                gifts = new ArrayList<>();
            }
            gifts.add(gift);
        } catch (NullPointerException exception) {
            System.out.println("Error: Gift list not initialized.");
        }
    }

    public ArrayList<Gift> filterByCategory(GiftCategory category) {
        ArrayList<Gift> filteredGifts = new ArrayList<>();
        for (Gift gift : gifts) {
            if (gift.getCategory() == category) {
                filteredGifts.add(gift);
            }
        }
        return filteredGifts;
    }

    public boolean updateGiftStatus(String giftName, GiftStatus newStatus) {
        if (giftName == null || giftName.isEmpty()) {
            return false;
        }
        for (Gift gift : gifts) {
            if (gift.getName().equalsIgnoreCase(giftName)) {
                gift.setStatus(newStatus);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Gift> getAllGifts() {
        if (gifts == null) {
            gifts = new ArrayList<>();
        }
        return gifts;

    }
}
