package appcourse.taskmangerv1;

public class Task {
    private Long id;
    private String description;
    private String name;
    private StatusTask statusTask;

    public Task(String name, String description, StatusTask statusTask) {
        this.name = name;
        this.description = description;
        this.statusTask = statusTask;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusTask getStatusTask() {
        return statusTask;
    }

    public void setStatusTask(StatusTask statusTask) {
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        return "Задача='" + name + '\'' +
                ", Описание='" + description + '\'' +
                ", Статус=" + statusTask;
    }
}