package decorator.starbuzz;

/**
 * @author dengb
 */
public strictfp class HouseBlend extends Beverage {

    public HouseBlend(BeverageSize size) {
        super(size);
        this.description = "House Blend Coffee";
    }

    @Override
    public strictfp double cost() {
        switch (size) {
            case GRANDE:
                return .89 + .5;
            case VENTI:
                return .89 + 1;
            default:
                return .89;
        }
    }
}
