package behavioural.mediator.alexa.colleagues;

public class Curtains implements SmartDevice {
    @Override
    public void performAction(String action) {
        switch (action) {
            case "open" -> System.out.println("Curtains - Opening");
            case "close" -> System.out.println("Curtains - Closing");
        }
    }
}