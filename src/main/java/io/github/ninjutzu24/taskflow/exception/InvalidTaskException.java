package io.github.ninjutzu24.taskflow.exception;

public class InvalidTaskException extends IllegalArgumentException {

    public InvalidTaskException(String message) {
        super(message);
    }
}