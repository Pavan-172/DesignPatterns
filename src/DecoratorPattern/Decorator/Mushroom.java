package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public  class Mushroom extends ToppingDecorator {

    BasePizza pizza;

    public Mushroom(BasePizza basePizza) {
        this.pizza = basePizza;
    }
    @Override
    public  int cost(){
        return this.pizza.cost()+ 15;
    };
}
