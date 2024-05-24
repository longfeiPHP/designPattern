package pattern.behavior.observer.java;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {
    private float temperature;/*温度*/
    private float humidity;/*湿度*/
    private float pressure;/*气压*/
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherStation){
            WeatherStation weatherStation = (WeatherStation) o;
            this.temperature = weatherStation.getTemperature();
            this.humidity = weatherStation.getHumidity();
            this.pressure = weatherStation.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("---------------");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
        System.out.println("---------------");
    }
}
