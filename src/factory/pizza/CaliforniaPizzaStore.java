package factory.pizza;

/**
 * @author dengb
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        return PizzaCreator.create(new CaliforniaPizzaIngredientFactory(), type);
    }
}
