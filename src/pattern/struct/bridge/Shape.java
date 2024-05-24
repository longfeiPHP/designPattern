package pattern.struct.bridge;

/**
 * 形状的抽象类
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
    public abstract void applyColor();
}
