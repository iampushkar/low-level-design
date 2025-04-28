package behavioural.mediator.alexa.colleagues;

public class Light implements SmartDevice {
    @Override
    public void performAction(String action) {
        switch (action) {
            case "turn_on" -> System.out.println("Light - ON");
            case "turn_off" -> System.out.println("Light - OFF");
        }
    }
}
