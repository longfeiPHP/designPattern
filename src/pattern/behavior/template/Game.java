package pattern.behavior.template;

abstract public class Game {
    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    public final void play() {
        initialize();/*初始化游戏*/
        startPlay();/*开始游戏*/
        endPlay();/*结束游戏*/
    }
}
