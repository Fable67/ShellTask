public class TaskNotFoundException extends TaskUserException {
    public TaskNotFoundException(Task task) {
        super("Task does not exist: ", task.title());
    }
}
