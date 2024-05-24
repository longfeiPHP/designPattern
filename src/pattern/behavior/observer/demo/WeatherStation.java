package pattern.behavior.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站
 */
public class WeatherStation implements Subject {
    private List<Observer> observers;/*被观察者的集合*/
    private float temperature;/*温度*/
    private float humidity;/*湿度*/
    private float pressure;/*气压*/

    public WeatherStation() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("<<通知所有观察者>>");
        for (Observer observer : observers) {
            System.out.println("--------观察者：" + observer.name() + "--------");
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
