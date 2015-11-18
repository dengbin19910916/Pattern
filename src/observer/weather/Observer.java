package observer.weather;

/**
 * 观察者。
 *
 * @author dengb
 */
public interface Observer {

    /**
     * 更新数据。
     *
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temperature, float humidity, float pressure);
}
