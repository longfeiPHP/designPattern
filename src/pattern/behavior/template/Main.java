package pattern.behavior.template;

/**
 * 模板模式
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
