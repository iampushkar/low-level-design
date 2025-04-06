package structural.bridge.abstraction;

import structural.bridge.implementor.MessageSender;

abstract public class Notification {

    protected MessageSender sender;

    public Notification(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String msg, String recipient);
}
