package pattern.struct.bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Circle shape color:");
        color.applyColor();
    }
}
