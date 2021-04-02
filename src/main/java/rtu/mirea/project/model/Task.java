package rtu.mirea.project.model;

public class Task {
    private long datecreated;
    private String description;
    private String task;

    public Task() {

    }

    public Task(long datecreated, String description, String task) {
        this.datecreated = datecreated;
        this.description = description;
        this.task = task;
    }

    public long getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(long datecreated) {
        this.datecreated = datecreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
