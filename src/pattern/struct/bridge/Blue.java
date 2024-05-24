package pattern.struct.bridge;

public class Blue implements Color{
    @Override
    public void applyColor() {
        System.out.println("blue color");
    }
}
