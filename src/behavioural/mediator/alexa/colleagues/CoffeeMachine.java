package behavioural.mediator.alexa.colleagues;

public class CoffeeMachine implements SmartDevice {
    @Override
    public void performAction(String action) {
        if ("brew_coffee".equals(action)) {
            System.out.println("CoffeeMachine - Brewing Coffee");
        }
    }
}
