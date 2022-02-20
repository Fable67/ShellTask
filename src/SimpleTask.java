public class SimpleTask implements Task {
    private String title;
    private String description;
    private int importance = 0;
    private TaskStatus status = TaskStatus.UNFINISHED;

    public SimpleTask(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String description() {
        return this.description;
    }

    public String title() {
        return this.title;
    }

    public int importance() {
        return this.importance;
    }

    public TaskStatus status() {
        return this.status;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void update() {}

    public boolean equals(Task task) {
        return this.title.equals(task.title());
    }
}   
