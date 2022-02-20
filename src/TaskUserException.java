public abstract class TaskUserException extends Exception {
    public TaskUserException(String prefix, String task) {
        super(prefix + task);
    }
} 
