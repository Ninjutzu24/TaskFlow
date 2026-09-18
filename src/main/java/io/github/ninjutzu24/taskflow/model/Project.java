package io.github.ninjutzu24.taskflow.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Task> tasks;

    public Project(String name)
    {
        this.name = name;
        this.tasks = new ArrayList<>();
    }
}
