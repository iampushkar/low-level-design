package behavioural.mediator.smarthome.colleagues;

import behavioural.mediator.smarthome.mediator.ISmartHomeMediator;

public class Thermostat implements Device {
    private final ISmartHomeMediator mediator;

    public Thermostat(ISmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void updateState() {
        System.out.println("Thermostat - State Updated");
        mediator.notifyDevice(this);
    }
}
