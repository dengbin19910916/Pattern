package decorator.starbuzz;

import java.util.*;

/**
 * @author dengb
 */
public class CondimentPrettyPrint extends CondimentDecorator {

    public CondimentPrettyPrint(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        Map<String, Description> descriptions = new LinkedHashMap<>();
        try (Scanner scanner = new Scanner(beverage.getDescription()).useDelimiter(", *")) {
            while (scanner.hasNext()) {
                String name = scanner.next();
                if (descriptions.containsKey(name)) {
                    descriptions.get(name).increment();
                } else {
                    descriptions.put(name, new Description(name));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Description> entry : descriptions.entrySet()) {
            sb.append(entry.getValue().toString());
            sb.append(", ");
        }

        return sb.substring(0, sb.lastIndexOf(",") - 1);
    }

    private boolean contains(List<Description> descriptions, Description description) {
        for (Description d : descriptions) {
            if (d.name.equals(description.name)) {
                return true;
            }
        }
        return false;
    }

    static class Description {
        private String name;
        private int count;

        public Description(String name) {
            this.name = name;
            this.count = 1;
        }

        public void increment() {
            count++;
        }

        public String getName() {
            switch (count) {
                case 2:
                    return "Double " + name;
                case 3:
                    return "Third " + name;
                case 4:
                    return "Four " + name;
                case 5:
                    return "Five " + name;
                default:
                    return name;
            }
        }

        @Override
        public String toString() {
            return getName();
        }
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 0 + beverage.cost();
    }
}
