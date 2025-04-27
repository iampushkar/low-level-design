package behavioural.mediator.smarthome.colleagues;

import behavioural.mediator.smarthome.mediator.ISmartHomeMediator;

public class Alarm implements Device {
    private final ISmartHomeMediator mediator;

    public Alarm(ISmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void updateState() {
        System.out.println("Alarm - State Updated");
        mediator.notifyDevice(this);
    }
}
