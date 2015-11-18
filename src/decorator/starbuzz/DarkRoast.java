package decorator.starbuzz;

/**
 * @author dengb
 */
public strictfp class DarkRoast extends Beverage {

    public DarkRoast(BeverageSize size) {
        super(size);
        this.description = "Dark Roast";
    }

    @Override
    public strictfp double cost() {
        switch (size) {
            case GRANDE:
                return .99 + .5;
            case VENTI:
                return .99 + 1.0;
            default:
                return .99;
        }
    }
}
