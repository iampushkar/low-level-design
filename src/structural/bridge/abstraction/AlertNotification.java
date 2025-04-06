package structural.bridge.abstraction;

import structural.bridge.implementor.MessageSender;

public class AlertNotification extends Notification {

    public AlertNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String msg, String recipient) {
        sender.sendMessage("[ALERT] " + msg, recipient);
    }
}
