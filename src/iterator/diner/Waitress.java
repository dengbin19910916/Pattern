package iterator.diner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author dengb
 */
public class Waitress {
    private List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public Waitress(Menu... menus) {
        this.menus = new ArrayList<>(menus.length);
        Collections.addAll(this.menus, menus);
    }

    public void printMenu() {
        menus.forEach(this::printMenu);
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
