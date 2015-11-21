package iterator.diner;

/**
 * @author dengb
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, new CafeMenu());

        waitress.printMenu();
    }
}
