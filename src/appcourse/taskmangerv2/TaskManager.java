package appcourse.taskmangerv2;

public interface TaskManager {
    void addTaskList(String name, String description, StatusTask status);

    void updateTaskList(String name, String description, StatusTask status, Long id);

    void printTaskList(Long id);

    void printAllTaskList();

    void deleteAllTaskList();

    void deleteTaskListById(Long id);

    void addEpicTaskList(String name);

    void updateEpicTaskList(String name, Long id);

    void printAllEpicTaskList();

    void deleteAllEpicTaskList();

    void deleteEpicTaskListById(Long id);

    void printAllSubTaskList();

    void updateSubTaskById(String discription, StatusTask status, Long epicId, Long id);

    void printAllSubTaskbyIdEpicTask(Long epicId);

    void deleteAllSubTaskList();

    void deleteSubTaskListById(Long id);

    void printEpicTaskList(Long id);

    void addSubTaskList(String discription, StatusTask status, Long epicId);

    void updateEpicStatus(Long epicId);
}