package decorator.starbuzz;

/**
 * @author dengb
 */
public strictfp class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public strictfp double cost() {
        switch (getSize()) {
            case GRANDE:
                return .20 + .05 + beverage.cost();
            case VENTI:
                return .20 + .1 + beverage.cost();
            default:
                return .20 + beverage.cost();
        }
    }
}
