public interface Task {
    String title();
    String description();
    int importance();
    void setImportance(int importance);
    TaskStatus status();
    void setStatus(TaskStatus status);
    void update();
    boolean equals(Task task);
}
