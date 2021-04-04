package rtu.mirea.project.model;

/**
 * Model of task created by user
 */
public class Task {
    private long datecreated;
    private String description;
    private String task;

    /**
     * Constructor of task
     */
    public Task() {

    }
    /**
     * Constructor of task
     * @param datecreated The date the task was created
     * @param description Describe what the task needs to do
     * @param task Name of task
     */
    public Task(long datecreated, String description, String task) {
        this.datecreated = datecreated;
        this.description = description;
        this.task = task;
    }

    /**
     * Return the date task was created
     * @return date
     */
    public long getDatecreated() {
        return datecreated;
    }

    /**
     * Set date created task
     * @param datecreated The date the task was created
     */
    public void setDatecreated(long datecreated) {
        this.datecreated = datecreated;
    }

    /**
     * Get description of task
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description of task
     * @param description Describe what the task needs to do
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get name of task
     * @return name of task
     */
    public String getTask() {
        return task;
    }

    /**
     * Set name of task
     * @param task Name of task
     */
    public void setTask(String task) {
        this.task = task;
    }
}
