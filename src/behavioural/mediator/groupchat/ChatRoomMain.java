package behavioural.mediator.groupchat;

import behavioural.mediator.groupchat.colleague.User;
import behavioural.mediator.groupchat.mediator.ChatRoom;
import behavioural.mediator.groupchat.mediator.IChatRoom;

public class ChatRoomMain {
    public static void main(String[] args) {
        IChatRoom chatRoom = new ChatRoom();

        User peter =  new User("Peter", chatRoom);
        User miles = new User("Miles", chatRoom);
        User vulture =  new User("Vulture", chatRoom);

        chatRoom.addUser(peter);
        chatRoom.addUser(miles);
        chatRoom.addUser(vulture);

        peter.sendMsg("hey I am back from multiverse");
        vulture.sendMsg("Lets meet Peter");
    }
}
