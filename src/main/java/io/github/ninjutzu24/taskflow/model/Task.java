package io.github.ninjutzu24.taskflow.model;

import io.github.ninjutzu24.taskflow.exception.InvalidTaskException;
import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private Priority priority;
    private Status status;
    private LocalDate deadline;

    public Task(
            String title,
            String description,
            Priority priority,
            LocalDate deadline
    )
    {

        if (title == null || title.isBlank()) {
           throw new InvalidTaskException("Task title cannot be null or blank");
        }

        if (priority == null) {
            throw new InvalidTaskException("Priority cannot be null");
        }

        if (deadline == null) {
            throw new InvalidTaskException("Deadline cannot be null");
        }

        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = Status.TO_DO;
        this.deadline = deadline;
    }

    public String getTitle() { return title; }

    public void setStatus(Status status) { this.status = status; }

    public Status getStatus() { return status; }

    public Priority getPriority(){ return priority; }

    public LocalDate getDeadline() { return deadline; }

}
