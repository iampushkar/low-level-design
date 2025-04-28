package behavioural.mediator.alexa.colleagues;

public class Thermostat implements SmartDevice {
    @Override
    public void performAction(String action) {
        switch (action) {
            case "set_morning_temp" -> System.out.println("Thermostat: Setting temperature to 22°C for morning...");
            case "set_night_temp" -> System.out.println("Thermostat: Lowering temperature to 18°C for night...");
        }
    }
}
