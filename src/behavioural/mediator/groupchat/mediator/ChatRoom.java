package behavioural.mediator.groupchat.mediator;

import behavioural.mediator.groupchat.colleague.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IChatRoom {
    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (!user.equals(sender)) {
                user.receiveMsg(message, sender.getName());
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
