package behavioural.mediator.groupchat.colleague;

import behavioural.mediator.groupchat.mediator.IChatRoom;

public class User {
    private final String name;
    private final IChatRoom chatRoom;

    public User(String name, IChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMsg(String msg) {
        System.out.println(name + " sends " + msg);
        chatRoom.sendMessage(msg, this);
    }

    public void receiveMsg(String msg, String senderName) {
        System.out.println(name + " received msg from " + senderName + " : " + msg);
    }

}
