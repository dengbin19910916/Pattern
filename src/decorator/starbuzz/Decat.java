package decorator.starbuzz;

/**
 * @author dengb
 */
public strictfp class Decat extends Beverage {

    public Decat(BeverageSize size) {
        super(size);
        this.description = "Decat";
    }

    @Override
    public strictfp double cost() {
        switch (size) {
            case GRANDE:
                return 1.05 + .5;
            case VENTI:
                return 1.05 + 1;
            default:
                return 1.05;
        }
    }
}
