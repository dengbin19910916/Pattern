package factory.pizza;

/**
 * @author dengb
 */
public enum PizzaType {
    CHEESE,
    VEGGIE,
    CLAM,
    PEPPERONI;

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
