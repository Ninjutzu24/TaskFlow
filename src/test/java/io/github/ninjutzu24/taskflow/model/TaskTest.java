package io.github.ninjutzu24.taskflow.model;

import io.github.ninjutzu24.taskflow.exception.InvalidTaskException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void shouldThrowExceptionWhenTitleIsBlank() {

        InvalidTaskException exception = assertThrows(
                InvalidTaskException.class,
                () -> new Task(
                        "",
                        "first task",
                        Priority.HIGH,
                        LocalDate.of(2005, 5, 5)
                )
        );

        assertEquals(
                "Task title cannot be null or blank",
                exception.getMessage()
        );
    }

    @Test
    void shouldThrowExceptionWhenPriorityIsNull() {

        InvalidTaskException exception = assertThrows(
                InvalidTaskException.class,
                () -> new Task(
                        "Task1",
                        "first task",
                        null,
                        LocalDate.of(2005, 5, 5)
                )
        );

        assertEquals(
                "Priority cannot be null",
                exception.getMessage()
        );
    }

    @Test
    void shouldThrowExceptionWhenDeadlineIsNull() {

        InvalidTaskException exception = assertThrows(
                InvalidTaskException.class,
                () -> new Task(
                        "Task1",
                        "first task",
                        Priority.HIGH,
                        null
                )
        );

        assertEquals(
                "Deadline cannot be null",
                exception.getMessage()
        );
    }

    @Test
    void shouldCreateTaskWhenDataIsValid() {
        assertDoesNotThrow(
                () -> new Task(
                        "Task1",
                        "first task",
                        Priority.HIGH,
                        LocalDate.of(2005, 5, 5)
                )
        );
    }
}