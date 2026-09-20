package io.github.ninjutzu24.taskflow.model;

import org.junit.jupiter.api.Test;
import java.util.List;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void TestfindTaskByStatus()
    {
        //Arrange
        Project project = new Project("Project 1");

        Task task = new Task(
                "Task1",
                "first task",
                Priority.HIGH,
                LocalDate.of(2005, 7, 10)
        );

        Task task2 = new Task(
                "Task2",
                "second task",
                Priority.LOW,
                LocalDate.of(2005, 8, 10)
        );

        Task task3 = new Task(
                "Task3",
                "third task",
                Priority.MEDIUM,
                LocalDate.of(2006, 5, 5)
        );

        task2.setStatus(Status.DONE);
        task3.setStatus(Status.IN_PROGRESS);

        project.addTask(task);
        project.addTask(task2);
        project.addTask(task3);

        //ACT
        List<Task> result = project.findTasksByStatus(Status.DONE);

        // Assert
        assertEquals(1, result.size());
        assertEquals(task2, result.get(0));
    }

    @Test
    public void TestfindTaskByPriority()
    {
        //Arrange
        Project project = new Project("Project 1");

        Task task = new Task(
                "Task1",
                "first task",
                Priority.HIGH,
                LocalDate.of(2005, 7, 10)
        );

        Task task2 = new Task(
                "Task2",
                "second task",
                Priority.LOW,
                LocalDate.of(2005, 8, 10)
        );

        Task task3 = new Task(
                "Task3",
                "third task",
                Priority.MEDIUM,
                LocalDate.of(2006, 5, 5)
        );


        project.addTask(task);
        project.addTask(task2);
        project.addTask(task3);

        //ACT
        List<Task> result = project.findTasksByPriority(Priority.HIGH);

        // Assert
        assertEquals(1, result.size());
        assertEquals(task, result.get(0));
    }

    @Test
    public void TestSortingByDeadline()
    {
        //Arrange
        Project project = new Project("Project 1");

        Task task1 = new Task(
                "Task1",
                "first task",
                Priority.HIGH,
                LocalDate.of(2005, 5, 5)
        );

        Task task2 = new Task(
                "Task2",
                "second task",
                Priority.LOW,
                LocalDate.of(2005, 8, 10)
        );

        Task task3 = new Task(
                "Task3",
                "third task",
                Priority.MEDIUM,
                LocalDate.of(2006, 7, 10)
        );


        project.addTask(task1);
        project.addTask(task2);
        project.addTask(task3);

        //ACT
        List<Task> result = project.sortByDeadline();

        // Assert
        assertEquals(task1, result.get(0));
        assertEquals(task2, result.get(1));
        assertEquals(task3, result.get(2));
    }

}