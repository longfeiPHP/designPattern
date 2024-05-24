package pattern.behavior.observer.demo;

/**
 * 被观察者接口
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);

    String name();
}
