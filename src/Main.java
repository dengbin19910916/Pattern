import factory.pizza.NYPizzaStore;
import factory.pizza.Pizza;
import factory.pizza.PizzaStore;
import factory.pizza.PizzaType;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza + "\n");
    }
}
