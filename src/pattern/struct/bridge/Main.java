package pattern.struct.bridge;

/**
 * 桥接模式
 */
public class Main {
    public static void main(String[] args){
        System.out.println("桥接模式");
        Color blue = new Blue();
        Shape square = new Square(new Red());
        Shape circle = new Circle(blue);
        square.applyColor();
        circle.applyColor();
    }
}
