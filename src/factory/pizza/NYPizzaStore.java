package factory.pizza;

/**
 * @author dengb
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        return PizzaCreator.create(new NYPizzaIngredientFactory(), type);
    }
}
