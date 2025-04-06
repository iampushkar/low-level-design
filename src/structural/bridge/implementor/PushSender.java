package structural.bridge.implementor;

public class PushSender implements MessageSender {

    @Override
    public void sendMessage(String msg, String recipient) {
        System.out.println("Push Notification to " + recipient + " : "  + msg);
    }
}
