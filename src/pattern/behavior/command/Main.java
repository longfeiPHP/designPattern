package pattern.behavior.command;

public class Main {
    public static void main(String[] args) {
        System.out.println("命令模式");
        CommandExecutor executor = new CommandExecutor();
        executor.executeCommand("create", new String[]{"file.txt", "Hello World!"});
        executor.executeCommand("delete", new String[]{"file.txt"});
        executor.executeCommand("abc", new String[]{});
    }
}
