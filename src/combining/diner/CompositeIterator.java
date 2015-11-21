package combining.diner;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author dengb
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            MenuComponent component = stack.peek().next();
            if (component instanceof Menu) {
                stack.push(component.iterator());
            }
            return component;
        } else {
            return null;
        }
    }
}
