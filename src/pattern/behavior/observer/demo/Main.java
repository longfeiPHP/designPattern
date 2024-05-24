package pattern.behavior.observer.demo;

/**
 * WeatherStation是个气象站，可以注册、删除观察者，可以设置气象参数且通知被注册的观察者
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display("01");
        Display display2 = new Display("02");
        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);
        weatherStation.setMeasurements(25.0f, 60.0f, 1013.0f);
        weatherStation.removeObserver(display2);
        weatherStation.setMeasurements(26.0f, 65.0f, 1012.0f);
    }
}
