package decorator.starbuzz;

/**
 * @author dengb
 */
public strictfp class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public strictfp double cost() {
        switch (getSize()) {
            case GRANDE:
                return .12 + .05 + beverage.cost();
            case VENTI:
                return .12 + .1 + beverage.cost();
            default:
                return .12 + beverage.cost();
        }
    }
}
