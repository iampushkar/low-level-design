package behavioural.mediator.smarthome.colleagues;

import behavioural.mediator.smarthome.mediator.ISmartHomeMediator;

public class Light implements Device {
    private final ISmartHomeMediator mediator;

    public Light(ISmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void updateState() {
        System.out.println("Light - State Updated");
        mediator.notifyDevice(this);
    }

    public void turnOn() {
        System.out.println("Light - Turned On");
    }
}
