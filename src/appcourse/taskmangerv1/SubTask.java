package appcourse.taskmangerv1;

public class SubTask extends Task {
    private Long epicId;

    public SubTask(String name, String description, StatusTask statusTask, Long epicId) {
        super(name, description, statusTask);
        this.epicId = epicId;
    }

    public Long getEpicId() {
        return epicId;
    }
}