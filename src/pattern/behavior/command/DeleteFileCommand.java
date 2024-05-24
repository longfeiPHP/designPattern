package pattern.behavior.command;

/**
 * 删除文件命令
 */
public class DeleteFileCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("删除文件：" + String.join(",", args));
    }
}
