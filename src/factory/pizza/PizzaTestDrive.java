package factory.pizza;

/**
 * @author dengb
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyPizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + nyPizza + "\n");

        System.out.println("--------------------------------");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Ethan ordered a " + chicagoPizza + "\n");

        System.out.println("--------------------------------");

        PizzaStore californiaStore = new CaliforniaPizzaStore();
        Pizza californiaPizza = californiaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Ethan ordered a " + californiaPizza + "\n");
    }
}
