package pattern.behavior.observer.java;

public class Main {
    public static void main(String[] args){
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display();
        Display display2 = new Display();
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.setMeasurements(25.0f, 60.0f, 1013.0f);
        weatherStation.deleteObserver(display1);
        weatherStation.setMeasurements(26.0f, 65.0f, 1012.0f);
    }
}
