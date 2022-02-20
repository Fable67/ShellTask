import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<Task>();

    public TaskManager() {}

    public void addTask(Task task) throws TaskAlreadyExistsException {
        if (this.tasks.contains(task)) {
            throw new TaskAlreadyExistsException(task);
        }
        this.tasks.add(task);
    }

    public void removeTask(Task task) throws TaskNotFoundException {
        if (!this.tasks.contains(task)) {
            throw new TaskNotFoundException(task);
        }
    }
}
