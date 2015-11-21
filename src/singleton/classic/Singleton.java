package singleton.classic;

/**
 * @author dengb
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if (instance != null) {
            return instance;
        }
        return new Singleton();
    }

    private static class InstanceHandler {
        public static final Singleton instance = new Singleton();
    }
}
