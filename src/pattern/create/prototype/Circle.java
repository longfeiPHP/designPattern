package pattern.create.prototype;

public class Circle extends Shape{
	public Circle() {
		type = "Circle";
	}
	@Override
	public void draw() {
		System.out.println("draw circle");
	}
}
