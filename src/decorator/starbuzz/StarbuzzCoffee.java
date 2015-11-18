package decorator.starbuzz;

/**
 * @author dengb
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso(BeverageSize.VENTI);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new CondimentPrettyPrint(new Mocha(new Whip(new Mocha(new Mocha(new DarkRoast(BeverageSize.TALL))))));
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend(BeverageSize.GRANDE);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new CondimentPrettyPrint(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
