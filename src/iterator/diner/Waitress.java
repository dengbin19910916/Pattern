package iterator.diner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dengb
 */
public class Waitress {
    private List<Menu> menus;
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
        this.menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
    }

    public void printMenu() {
        menus.forEach(this::printMenu);

//        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();
//        Iterator<MenuItem> dinerIterator = dinerMenu.iterator();
        /*System.out.println("MENU\n---\nBREAKFAST");
//        printMenu(pancakeIterator);
        printMenu(pancakeHouseMenu);
        System.out.println("\nLUNCH");
//        printMenu(dinerIterator);
        printMenu(dinerMenu);
        System.out.println("\nDINNER");
        printMenu(cafeMenu);*/
    }

    private void printMenu(Menu menu) {
        for (MenuItem menuItem : menu) {
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
