import java.util.Scanner;

public class ShellTask {
    public static void main(String[] args) {
        Task task = new CounterTask("Test", "This is a test.");

        task.setImportance(4);
        task.setStatus(TaskStatus.UNFINISHED);

        task.update();
        
        System.out.print("Task: ");
        System.out.println(task.title());
        System.out.print("Description: ");
        System.out.println(task.description());
        System.out.print("Importance: ");
        System.out.println(task.importance());
        System.out.print("Status: ");
        System.out.println(task.status());

        TaskManager m = new TaskManager();
        try {
            m.addTask(task);
            m.removeTask(new SimpleTask("This is a  test task", ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
