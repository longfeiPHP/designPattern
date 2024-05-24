package pattern.struct.flyweight;

public class Circle implements Shape {
    private String color;/*颜色*/
    private int x;/*x坐标*/
    private int y;/*y坐标*/
    private int radius;/*半径*/


    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("你画了一个" + color + "颜色的圆，半径为：" + radius + "，坐标为：" + x + "，" + y);
    }
}
