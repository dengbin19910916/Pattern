package factory.pizza;

/**
 * 披萨原料工厂。
 *
 * @author dengb
 */
public interface PizzaIngredientFactory {
    String getName();

    /**
     * 制作面团。
     *
     * @return 面团。
     */
    Dough createDough();

    /**
     * 制作酱料。
     *
     * @return 酱料。
     */
    Sauce createSauce();

    /**
     * 制作奶酪。
     *
     * @return 奶酪。
     */
    Cheese createCheese();

    /**
     * 制作一些蔬菜。
     *
     * @return 一些蔬菜。
     */
    Veggies[] createVeggies();

    /**
     * 制作意大利香肠。
     *
     * @return 意大利香肠。
     */
    Pepperoni createPepperoni();

    /**
     * 自作扇贝。
     *
     * @return 扇贝。
     */
    Clams createClam();
}
