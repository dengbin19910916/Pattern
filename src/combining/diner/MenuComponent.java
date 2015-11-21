package combining.diner;

import java.util.Iterator;

/**
 * @author dengb
 */
public abstract class MenuComponent implements Iterable<MenuComponent> {

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<MenuComponent> iterator();

    @Override
    public String toString() {
        return "MenuComponent{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", vegetarian=" + isVegetarian() +
                ", price=" + getPrice() +
                '}';
    }
}
