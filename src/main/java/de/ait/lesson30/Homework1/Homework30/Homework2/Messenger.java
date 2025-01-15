package de.ait.lesson30.Homework1.Homework30.Homework2;

import java.util.List;

public interface Messenger {
    void sendMessage(String message, String userId);

    List<String> receiveMessages(String userId);
}
