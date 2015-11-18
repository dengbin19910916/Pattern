package decorator.starbuzz;

/**
 * @author dengb
 */
public strictfp class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public strictfp double cost() {
        switch (getSize()) {
            case GRANDE:
                return .10 + .05 + beverage.cost();
            case VENTI:
                return .10 + .1 + beverage.cost();
            default:
                return .10 + beverage.cost();
        }
    }
}
