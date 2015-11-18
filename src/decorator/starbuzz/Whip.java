package decorator.starbuzz;

/**
 * 奶泡。
 *
 * @author dengb
 */
public strictfp class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public strictfp double cost() {
        switch (getSize()) {
            case GRANDE:
                return .15 + .05 + beverage.cost();
            case VENTI:
                return .15 + .1 + beverage.cost();
            default:
                return .15 + beverage.cost();
        }
    }
}
