package combining.diner;

/**
 * @author dengb
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n----");
        for (MenuComponent menuComponent : allMenus) {
            if (menuComponent.isVegetarian()) {
                menuComponent.print();
            }
        }
    }
}
