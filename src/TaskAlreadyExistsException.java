public class TaskAlreadyExistsException extends TaskUserException {
    public TaskAlreadyExistsException(Task task) {
        super("Task already exists: ", task.title());
    }
}
