package pattern.behavior.command;

/**
 * 创建文件命令
 */
public class CreateFileCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("创建文件：" + String.join(",", args));
    }
}
