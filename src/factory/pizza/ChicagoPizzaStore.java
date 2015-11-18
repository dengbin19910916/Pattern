package factory.pizza;

/**
 * @author dengb
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        return PizzaCreator.create(new ChicagoPizzaIngredientFactory(), type);
    }
}
