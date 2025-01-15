package de.ait.lesson30.Homework1.Homework30.Homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMessenger implements Messenger {
    private Map<String, List<String>> messages;

    public UserMessenger(Map<String, List<String>> messages) {
        if (messages == null) {
            this.messages = new HashMap<>();
        } else {
            this.messages = messages;
        }
    }

    public UserMessenger() {
        this.messages = new HashMap<>();
    }

    @Override
    public void sendMessage(String message, String userId) {
        if (!messages.containsKey(userId)) {
            messages.put(userId, new ArrayList<>());
        }
        messages.get(userId).add(message);

    }

    @Override
    public List<String> receiveMessages(String userId) {
        if (messages.containsKey(userId)) {
            return messages.get(userId);
        } else {
            return new ArrayList<>();
        }
    }
}
