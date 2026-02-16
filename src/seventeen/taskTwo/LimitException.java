package seventeen.taskTwo;

import inLesson.model.Teacher;

public class LimitException extends RuntimeException {
    public LimitException(String message) {
        super(message);
    }
}
