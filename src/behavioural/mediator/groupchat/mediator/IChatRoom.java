package behavioural.mediator.groupchat.mediator;

import behavioural.mediator.groupchat.colleague.User;

public interface IChatRoom {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
