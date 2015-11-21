package template.sort;

/**
 * @author dengb
 */
public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck o) {
        if (this.weight < o.weight) {
            return -1;
        } else if (this.weight == o.weight) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }
}
