package factory.pizza;

/**
 * @author dengb
 */
public final class PizzaCreator {

    public static Pizza create(PizzaIngredientFactory ingredientFactory, PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName(ingredientFactory.getName() + " Style Cheese Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName(ingredientFactory.getName() + " Style Veggie Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName(ingredientFactory.getName() + " Style Clam Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName(ingredientFactory.getName() + " Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
