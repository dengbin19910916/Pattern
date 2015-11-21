package iterator.diner;

import java.util.Iterator;

/**
 * @author dengb
 */
public class DinerMenu implements Menu {

    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("HotDog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
//        addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public Iterator<MenuItem> iterator() {
        return new DinerMenuIterator();
    }

    private class DinerMenuIterator implements Iterator<MenuItem> {
        private int position;

        @Override
        public boolean hasNext() {
            return !(position >= menuItems.length || menuItems[position] == null);
        }

        @Override
        public MenuItem next() {
            return menuItems[position++];
        }

        @Override
        public void remove() {
            if (position <= 0) {
                throw new IllegalStateException("You can't remove an item until you've done at least one next()");
            }
            if (menuItems[position - 1] != null) {
                for (int i = position - 1; i < menuItems.length - 1; i++) {
                    menuItems[i] = menuItems[i + 1];
                }
                menuItems[menuItems.length - 1] = null;
            }
        }
    }

}
