package factory.pizza;

/**
 * 披萨商店，负责定制披萨。
 *
 * @author dengb
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
