package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public  class ExtraCheese extends BasePizza {

    BasePizza pizza;

    public ExtraCheese(BasePizza basePizza) {
        this.pizza = basePizza;
    }
    @Override
    public  int cost(){
        return this.pizza.cost()+ 10;
    };
}
