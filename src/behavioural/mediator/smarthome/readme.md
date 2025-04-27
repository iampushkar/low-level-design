## Case Study - Smart Home Mediator

Imagine you are designing the control system for a Smart Home — a "House of the Future."
In this house, different smart devices like Lights, Thermostats, Sprinklers, Alarms, and others can interact with each other automatically.
- When the Thermostat detects that the temperature has risen above a threshold, it might turn on the Sprinkler to water the garden.
- When the Alarm goes off, it might turn on all Lights and disable the Sprinkler.

##### Class Diagram

          +----------------+
          | SmartHomeMediator|
          +----------------+
                  ▲
                  |
          +----------------+
          | ConcreteMediator|
          +----------------+
           /      |      \
          /       |       \
    +--------+ +------------+ +-----------+
    | Light  | | Thermostat  | | Sprinkler |
    +--------+ +------------+ +-----------+
