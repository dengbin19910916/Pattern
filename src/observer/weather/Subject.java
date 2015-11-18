package observer.weather;

/**
 * 被观察者关注的主题。
 *
 * @author dengb
 */
public interface Subject {

    /**
     * 注册观察者。
     *
     * @param observer 观察者对象。
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者。
     *
     * @param observer 观察者对象。
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有的观察者。
     */
    void notifyObservers();
}
