package appcourse.taskmangerv2;

import java.util.ArrayList;

public class EpicTask extends Task {
    private ArrayList<Long> subtasksIds = new ArrayList<>();

    public EpicTask(String name, String description, StatusTask statusTask) {
        super(name, description, statusTask);
    }

    public ArrayList<Long> getSubtasksIds() {
        return subtasksIds;
    }

    public void addsubTaskIds(Long id) {
        this.subtasksIds.add(id);
    }
}