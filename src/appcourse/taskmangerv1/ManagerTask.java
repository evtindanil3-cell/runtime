package appcourse.taskmangerv1;

import java.util.HashMap;
public class ManagerTask {
    private Long taskIncrement = 0L;
    private HashMap<Long, Task> idListHashMapTask = new HashMap<>();

    public void addTaskList(String name, String description, StatusTask status) {
        Task Task = new Task(name, description, status);
        idListHashMapTask.put(taskIncrement, Task);
        ++taskIncrement;
    }

    public void updateTaskList(String name, String description, StatusTask status, Long id) {
        Task Task = new Task(name, description, status);
        idListHashMapTask.put(id, Task);
    }

    public void printTaskList(Long id) {

        Task task = idListHashMapTask.get(id);
        System.out.println(task);
    }

    public void printAllTaskList() {
        idListHashMapTask.forEach((id, value) -> {
            System.out.println("id:" + id + "Value:" + value);
        });
    }

    public void deleteAllTaskList() {
        idListHashMapTask.clear();
    }

    public void deleteTaskListById(Long id) {
        idListHashMapTask.remove(id);
    }
}
