package io.github.ninjutzu24.taskflow.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Project {
    private String name;
    private List<Task> tasks;

    public Project(String name)
    {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task)
    {
        tasks.add(task);
    }

    public List<Task> getTasks()
    {
        return List.copyOf(tasks);
    }

    public boolean removeTask(Task task)
    {
        return tasks.remove(task);
    }

    public Optional<Task> findTaskByTitle(String title)
    {
        return tasks.stream()
                .filter(task -> task.getTitle().equals(title))
                .findFirst();
    }

    public boolean changeTaskStatus(String title, Status status)
    {
        Optional<Task> task = findTaskByTitle(title);

        if (task.isPresent()) {
            task.get().setStatus(status);
            return true;
        }

        return false;
    }
}
