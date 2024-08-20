package DecoratorPattern;

import DecoratorPattern.Decorator.ExtraCheese;

public class PizzaClient {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new FarmHousePizza());
        System.out.println(pizza.cost());
    }
}
