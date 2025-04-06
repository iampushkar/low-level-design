package structural.bridge.implementor;

public class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String msg, String recipient) {
        System.out.println("SMS to " + recipient + " : " + msg);
    }
}
