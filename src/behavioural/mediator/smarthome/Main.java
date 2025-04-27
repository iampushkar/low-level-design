package behavioural.mediator.smarthome;

import behavioural.mediator.smarthome.colleagues.Alarm;
import behavioural.mediator.smarthome.colleagues.Light;
import behavioural.mediator.smarthome.colleagues.Sprinkler;
import behavioural.mediator.smarthome.colleagues.Thermostat;
import behavioural.mediator.smarthome.mediator.ISmartHomeMediator;
import behavioural.mediator.smarthome.mediator.SmartHomeMediator;

public class Main {
    public static void main(String[] args) {
        ISmartHomeMediator mediator =  new SmartHomeMediator();
        Light light = new Light(mediator);
        Thermostat thermostat = new Thermostat(mediator);
        Sprinkler sprinkler = new Sprinkler(mediator);
        Alarm alarm = new Alarm(mediator);

        mediator.registerDevice(light);
        mediator.registerDevice(thermostat);
        mediator.registerDevice(sprinkler);
        mediator.registerDevice(alarm);

        System.out.println("Thermostat - Temperature Changes");
        thermostat.updateState();

        System.out.println("Alarm - Triggered");
        alarm.updateState();
    }
}
