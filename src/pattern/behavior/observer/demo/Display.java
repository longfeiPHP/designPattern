package pattern.behavior.observer.demo;

/**
 * 被观察者 主要是update方法，在通知中会调用
 */
public class Display implements Observer {
    private float temperature;/*温度*/
    private float humidity;/*湿度*/
    private float pressure;/*气压*/
    private String name;/*被观察者名字*/

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public String name() {
        return this.name;
    }

    public void display() {
        System.out.println("Temperature:" + temperature);
        System.out.println("Humidity:" + humidity);
        System.out.println("Pressure" + pressure);
    }
}
