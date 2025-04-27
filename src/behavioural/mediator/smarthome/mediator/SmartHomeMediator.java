package behavioural.mediator.smarthome.mediator;

import behavioural.mediator.smarthome.colleagues.*;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeMediator implements ISmartHomeMediator {
    private final List<Device> devices = new ArrayList<>();

    @Override
    public void registerDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void notifyDevice(Device sender) {
        if (sender instanceof Thermostat) {
            System.out.println("Mediator - Thermostat event received. Turn on Sprinkler");
            for (Device device : devices) {
               if (device instanceof Sprinkler) {
                   ((Sprinkler) device).turnOn();
               }
            }
        } else if (sender instanceof Alarm) {
            System.out.println("Mediator - Alarm event received. Turn on Light. Turn off Sprinkler");
            for (Device device : devices) {
                if (device instanceof Light) {
                    ((Light) device).turnOn();
                } else if (device instanceof Sprinkler) {
                    ((Sprinkler) device).turnOn();
                }
            }
        }
    }
}
