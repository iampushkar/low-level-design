package behavioural.mediator.alexa.mediator;

import behavioural.mediator.alexa.colleagues.SmartDevice;

import java.util.HashMap;
import java.util.Map;

public class AlexaSmartHomeAssistant implements SmartHomeAssistant {

    private Map<String, SmartDevice> deviceMap = new HashMap<>();

    @Override
    public void registerDevice(String deviceName, SmartDevice device) {
        deviceMap.put(deviceName, device);
    }

    @Override
    public void executeRoutine(String routineName) {
        switch (routineName.toLowerCase()) {
            case "morning" -> {
                System.out.println("Executing Morning Routine");
                deviceMap.get("curtains").performAction("open");
                deviceMap.get("lights").performAction("turn_on");
                deviceMap.get("coffee_machine").performAction("brew_coffee");
                deviceMap.get("thermostat").performAction("set_morning_temp");
            }
            case "night" -> {
                System.out.println("Executing Night Routine...");
                deviceMap.get("curtains").performAction("close");
                deviceMap.get("lights").performAction("turn_off");
                deviceMap.get("alarm").performAction("arm");
                deviceMap.get("thermostat").performAction("set_night_temp");
            }
            default -> System.out.println("Unknown Routine: " + routineName);
        }
    }
}
