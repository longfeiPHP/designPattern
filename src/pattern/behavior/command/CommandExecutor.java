package pattern.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义命令的执行者
 */
public class CommandExecutor {
    private Map<String, Command> commands = new HashMap<>();

    public CommandExecutor() {
        commands.put("create", new CreateFileCommand());
        commands.put("delete", new DeleteFileCommand());
    }

    public void executeCommand(String commandName, String[] args) {
        Command command = commands.get(commandName);
        if (command != null) {
            command.execute(args);
        } else {
            System.out.println("unknow command:" + commandName);
        }
    }
}
