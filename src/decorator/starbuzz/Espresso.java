package decorator.starbuzz;

/**
 * @author dengb
 */
public strictfp class Espresso extends Beverage {


    public Espresso(BeverageSize size) {
        super(size);
        this.description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public strictfp double cost() {
        switch (size) {
            case GRANDE:
                return 1.99 + .5;
            case VENTI:
                return 1.99 + 1;
            default:
                return 1.99;
        }

    }
}
