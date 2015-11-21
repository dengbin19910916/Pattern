package iterator.diner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dengb
 */
public class PancakeHouseMenu implements Menu {

    private List<MenuItem> menuItems;

    public  PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator<MenuItem> iterator() {
//        return new PancakeHouseIterator();
        return menuItems.iterator();
    }

    /*private class PancakeHouseIterator implements Iterator<MenuItem> {
        private int position;

        @Override
        public boolean hasNext() {
            return !(position >= menuItems.size() || menuItems.get(position) == null);
        }

        @Override
        public MenuItem next() {
            return menuItems.get(position++);
        }
    }*/

    // other menu methods here
}
