package combining.diner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dengb
 */
public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        menuComponents.forEach(MenuComponent::print);
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
