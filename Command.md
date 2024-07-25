
Design Pattern 
-----------------------------------
- Template or Blueprint for solving a particular design problems
- Reusable solutions to solve commonly occuring problems 
- Why?
    - Toolkit of tried and tested solutions 
    - Code structure
    - Easy to understand

Types of Patterns:
------------------------------------
3 categories :

    - Creational 
        - Singleton
        - Builder
        - Factory
        - Prototype

    - Structural
        - Adapter
        - Decorator
        - Proxy
        - Facade

    - Behavioural
        - Command
        - Strategy
        - Observer
        - Chain of Responsibility


Behavioural Pattern :
--------------------------------------

Command Pattern:
------------------

you goto restaurant to order a pizza -> go to kitchen ❌
call a waiter -> waiter go to kitchen -> waiter will communicate to chef to bake pizza 

class Client {
    main() {
        // pizza , waiter 
        Pizza pizza = new Pizza(true, false);
        Waiter waiter = new Waiter(pizza);

        waiter.orderPizza();
    }
}

class Pizza {

    boolean extraCheese;
    boolean extraToppings;

    Pizza(boolean extraCheese, boolean extraToppings) {
        this.extraCheese = extraCheese;
        this.extraToppings = extraToppings;
    }

    makePizza() {
        print("pizza is being made");
        if (extraCheese) {
            print("Adding extra cheese");
        }
        if (extraToppings) {
            print("Adding extra toppings");
        }
    }
}

class Waiter {
    private Pizza pizza;

    Waiter(Pizza pizza) {
        this.pizza = pizza;
    }


    orderPizza() {
        pizza.makePizza();
    }
}

client wants to add extra cheese and toppings 

Issues with this approch:
---------------------------
- Tight coupling 
    - any changes/customization impacts pizza class directly

- Lack of flexibility
    - violates open/ closed principle
    - doesnt scale well 

- Hard to extend 
    - no new customization possible for example - vegan pizza 
    - make the class bloated 
    - violates SRP (single Responsibility principle)
        - pizza making logic + pizza customization logic

Command Pattern :
-------------------------
Command Interface ✅
Command concrete Classes ✅
Invoker 
Client 


interface Command {
    void execute();
}

class Pizza {

    makePizza() {
        print("Pizza is being made");
    }

    addCheese() {
        print("Added cheese");
    }
}

class OrderPizzaCommand implements Command {

    Pizza pizza;

    OrderPizzaCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    void execute() {
        pizza.makePizza();
    }
}

class AddCheeseCommand implements Command {
    Pizza pizza;
    AddCheeseCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    void execute() {
        pizza.addCheese();
    }
}

class Waiter {
    // list of command 
    // waiter executing all this command 

    List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {   
        commands.add(command);
    }

    public void placeOrder() {
        for (Command command : commands) {
            command.execute();
        }
    }


}

class Client {
    public static void main(String[] args) {
        
        Waiter waiter = new Waiter();

        Pizza pizza = new Pizza();
        Command orderPizza = new OrderPizzaCommand(pizza);
        Command addCheese = new AddCheeseCommand(pizza);
        Command addTopping = new AddDoubleToppings(pizza);
       
        waiter.setCommand(orderPizza);
        waiter.setCommand(addCheese);
        waiter.setCommand(addTopping);
    
        waiter.placeOrder();
    }
}

Benefit:
-------------------
1. Decoupling
    - waiter class is no longer tied to the pizza 
    - it interacts with the command interface & make system easier to extend and maintain 

2. Flexibility
    - New commands can be easily added without modifying existing code 
    - adhers to the open close principle making system open for extension but closed for modification 

3. SRP 
    - pizza class handles making of pizza 
