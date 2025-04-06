package structural.bridge.implementor;

public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String msg, String recipient) {
        System.out.println("Email to " + recipient + " : " + msg);
    }
}
