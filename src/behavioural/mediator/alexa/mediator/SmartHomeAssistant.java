package behavioural.mediator.alexa.mediator;

import behavioural.mediator.alexa.colleagues.SmartDevice;

public interface SmartHomeAssistant {
    void registerDevice(String deviceName, SmartDevice device);
    void executeRoutine(String routineName);
}
