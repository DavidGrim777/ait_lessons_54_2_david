package de.ait.lesson33Homework;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j

public class GiftManager {
    private ArrayList<Gift> gifts;       //Список всех подарков

    public GiftManager(ArrayList<Gift> gifts) {   //Конструктор создаёт пустой список подарков
        this.gifts = new ArrayList<>();
        log.info("GiftManager is initialized with an empty list of gifts.");
    }

    public GiftManager() {
        gifts = new ArrayList<>();

    }

    public void addGift(Gift gift) {    //Добавляет новый подарок в список
        try {
            if (gifts == null) {
                gifts = new ArrayList<>();
            }
            gifts.add(gift);
            log.info("Gift added: {}", gift);

        } catch (NullPointerException exception) {
            System.out.println("Error: Gift list not initialized.");
        }
    }

    public ArrayList<Gift> filterByCategory(GiftCategory category) {   //Фильтрует подарки по указанной категории
        ArrayList<Gift> filteredGifts = new ArrayList<>();
        for (Gift gift : gifts) {
            if (gift.getCategory() == category) {
                filteredGifts.add(gift);
            }
        }
        log.info("Filtered gifts by category {}: {}", category, filteredGifts.size());
        return filteredGifts;
    }

    public boolean updateGiftStatus(String giftName, GiftStatus newStatus) {    //Обновляет статус подарка по имени
        if (giftName == null || giftName.isEmpty()) {
            return false;
        }
        for (Gift gift : gifts) {
            if (gift.getName().equalsIgnoreCase(giftName)) {
                gift.setStatus(newStatus);
                log.info("Gift status updated: {} to {}", giftName, newStatus);
                return true;
            }
        }
        log.warn("Gift with name {} not found.", giftName);
        return false;
    }

    public ArrayList<Gift> getAllGifts() {     //Возвращает все подарки
        log.info("A list of all gifts has been received.");

        if (gifts == null) {
            gifts = new ArrayList<>();
        }
        return gifts;

    }
}
