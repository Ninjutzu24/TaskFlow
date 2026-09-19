package io.github.ninjutzu24.taskflow.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ProjectTest {

    @Test
    void shouldAddTaskToProject() {
        // Arrange
        Project project = new Project("Java Backend");

        Task task = new Task(
                "Learn SQL",
                "Study PostgreSQL basics",
                Priority.HIGH,
                LocalDate.of(2026, 10, 1)
        );

        // Act
        project.addTask(task);

        // Assert
        assertEquals(1, project.getTasks().size());
        assertEquals(task, project.getTasks().get(0));
    }



    @Test
    void shouldEliminateTaskFromProject(){
        //Arrange
            Project project = new Project("My best project");

        Task task = new Task(
                "Task1",
                "first task",
                Priority.HIGH,
                LocalDate.of(2005, 7, 10)
        );

        project.addTask(task);

        // Act
        boolean removed = project.removeTask(task);

        // Assert
        assertTrue(removed);
        assertEquals(0, project.getTasks().size());

    }


    @Test
    void shouldFindTaskByTitle(){
        //Arrange
        Project project = new Project("My secondary project");

        Task task = new Task(
                "Task1",
                "first task",
                Priority.HIGH,
                LocalDate.of(2005, 7, 10)
        );

        project.addTask(task);

        // Act
        Optional<Task> result = project.findTaskByTitle("Task1");

        // Assert
        assertTrue(result.isPresent());
        assertEquals(task, result.get());
    }


    @Test
    void shouldNotFindTaskByTitle(){
        //Arrange
        Project project = new Project("My secondary project");

        Task task = new Task(
                "Task1",
                "first task",
                Priority.HIGH,
                LocalDate.of(2005, 7, 10)
        );

        project.addTask(task);

        // Act
        Optional<Task> result = project.findTaskByTitle("Something");

        // Assert
        assertFalse(result.isPresent());
    }

    @Test
    void shouldChangeTaskStatus(){
        //Arrange
        Project project = new Project("My secondary project");

        Task task = new Task(
                "Task1",
                "first task",
                Priority.HIGH,
                LocalDate.of(2005, 7, 10)
        );

        project.addTask(task);

        // Act
        boolean result = project.changeTaskStatus("Task1", Status.DONE);

        // Assert
        assertTrue(result);
        assertEquals(Status.DONE, task.getStatus());
    }
}