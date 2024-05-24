package pattern.struct.flyweight;

/**
 * 享元模式 可以减少对象创建的次数 在一个map里记录创建的对象，如果存在直接返回对象，如果不存在则创建，再返回
 * 类似redis缓存的处理方式
 */
public class Main {
    private static final String[] colors = {"红色", "绿色", "蓝色", "黄色", "黑色"};

    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    /**
     * 随机返回颜色
     *
     * @return
     */
    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    /**
     * 随机生成坐标
     *
     * @return
     */
    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    /**
     * 随机生成坐标
     *
     * @return
     */
    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
