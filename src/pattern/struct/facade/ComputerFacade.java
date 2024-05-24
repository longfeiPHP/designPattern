package pattern.struct.facade;

/**
 * 外观类
 */
public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private HardDrive hardDrive;

    /**
     * 无参构造器
     */
    public ComputerFacade() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("开始启动...");
        cpu.processData();
        memory.load();
        hardDrive.readData();
        System.out.println("启动完成...");
    }

}
