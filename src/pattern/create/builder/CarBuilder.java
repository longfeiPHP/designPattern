package pattern.create.builder;

/**
 * 使用建造者类一步步创建对象 最后调用build方法创建car对象
 * 可以使用链式调用
 */
public class CarBuilder {
    private int year;
    private String engine;
    private int seats;

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public Car build() {
        return new Car(year, engine, seats);
    }
}
