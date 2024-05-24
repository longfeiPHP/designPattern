package pattern.create.builder;

public class Car {
    private int year;
    private String engine;
    private int seats;

    public Car(int year, String engine, int seats) {
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                '}';
    }
}
