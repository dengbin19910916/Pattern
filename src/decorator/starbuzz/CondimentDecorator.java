package decorator.starbuzz;

/**
 * 配料。
 * 其子类为装饰者。
 *
 * @author dengb
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        super(beverage.size);
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract BeverageSize getSize();
}
