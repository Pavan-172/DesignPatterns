package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public  class Veggies extends BasePizza {

    BasePizza pizza;

    public Veggies(BasePizza basePizza) {
        this.pizza = basePizza;
    }
    @Override
    public  int cost(){
        return this.pizza.cost()+ 25;
    };
}
