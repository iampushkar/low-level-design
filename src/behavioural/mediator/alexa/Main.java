package behavioural.mediator.alexa;

import behavioural.mediator.alexa.colleagues.*;
import behavioural.mediator.alexa.mediator.AlexaSmartHomeAssistant;
import behavioural.mediator.alexa.mediator.SmartHomeAssistant;

public class Main {
    public static void main(String[] args) {
        SmartHomeAssistant alexa = new AlexaSmartHomeAssistant();

        SmartDevice lights = new Light();
        SmartDevice curtains = new Curtains();
        SmartDevice coffeeMachine = new CoffeeMachine();
        SmartDevice thermostat = new Thermostat();
        SmartDevice alarm = new Alarm();

        alexa.registerDevice("lights", lights);
        alexa.registerDevice("curtains", curtains);
        alexa.registerDevice("coffee_machine", coffeeMachine);
        alexa.registerDevice("thermostat", thermostat);
        alexa.registerDevice("alarm", alarm);

        alexa.executeRoutine("morning");
        System.out.println("---------------------------------");
        alexa.executeRoutine("night");
    }
}
