package decorator.starbuzz;

/**
 * 饮品。
 * 其直接子类为被装饰者。
 *
 * @author dengb
 */
public strictfp abstract class Beverage {

    protected String description;
    protected BeverageSize size;

    protected Beverage(BeverageSize size) {
        this.description = "Unknown Beverage.";
        this.size = size;
    }

    /**
     * 返回饮品的描述。
     *
     * @return 饮品的描述。
     */
     public String getDescription() {
        return description;
     }

    public BeverageSize getSize() {
        return size;
    }

    public void setSize(BeverageSize size) {
        this.size = size;
        this.description += "[" + size+ "]";
    }

    /**
     * 计算价钱。
     *
     * @return 单价。
     */
    public abstract double cost();

    @Override
    public String toString() {
        return "Beverage{" +
                "description='" + description + '\'' +
                ", size=" + size +
                '}';
    }
}
