package behavioural.mediator.alexa.colleagues;

public class Alarm  implements SmartDevice {
    @Override
    public void performAction(String action) {
        if ("arm".equals(action)) {
            System.out.println("Alarm: Arming the security system...");
        }
    }
}
