package behavioural.mediator.smarthome.mediator;

import behavioural.mediator.smarthome.colleagues.Device;

public interface ISmartHomeMediator {
    void registerDevice(Device device);
    void notifyDevice(Device sender);
}
