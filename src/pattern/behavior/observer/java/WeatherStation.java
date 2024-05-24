package pattern.behavior.observer.java;

import java.util.Observable;

public class WeatherStation extends Observable {
    private float temperature;/*温度*/
    private float humidity;/*湿度*/
    private float pressure;/*气压*/

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
