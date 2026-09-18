package io.github.ninjutzu24.taskflow.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private List<Project> projects;

    public User(
            String firstName,
            String lastName,
            String email
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        this.projects = new ArrayList<>();
    }
}


