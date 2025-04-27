package behavioural.mediator.smarthome.colleagues;

import behavioural.mediator.smarthome.mediator.ISmartHomeMediator;

public class Sprinkler implements Device {
    private final ISmartHomeMediator mediator;

    public Sprinkler(ISmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void updateState() {
        System.out.println("Sprinkler - State Updated");
        mediator.notifyDevice(this);
    }

    public void turnOn() {
        System.out.println("Sprinkler - Turned On");
    }

    public void turnOff() {
        System.out.println("Sprinkler - Turned Off");
    }
}
