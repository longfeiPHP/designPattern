package pattern.struct.facade;

/**
 * 外观模式是一种结构型设计模式 通过隐藏子系统的复杂性
 */
public class Main {
    public static void main(String args[]) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}
