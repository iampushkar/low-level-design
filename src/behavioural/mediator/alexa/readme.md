### Design a Smart Home Automation System 
A Virtual Assistant (like Alexa) acts as the central controller for all smart devices inside a home.

The assistant should be able to trigger multiple devices based on scenes or routines such as:

#### Morning Routine: When you wake up, Alexa should:

- Open Curtains
- Start Coffee Machine
- Turn ON Lights
- Adjust Thermostat (raise the temperature)

#### Night Routine: When you go to bed, Alexa should:

- Close Curtains
- Turn OFF Lights
- Arm Security Alarm
- Lower Thermostat temperature

                +--------------------+
                |  SmartHomeAssistant |
                |      (Mediator)     |
                +--------------------+
                         ▲
                         |
      +--------+  +-----------+  +-------------+  +-------------+
      | Lights |  | Curtains  |  | CoffeeMachine|  | Thermostat   |
      +--------+  +-----------+  +-------------+  +-------------+
