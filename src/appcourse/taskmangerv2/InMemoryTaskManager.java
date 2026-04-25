package appcourse.taskmangerv2;

import java.util.HashMap;
import java.util.List;

public class InMemoryTaskManager implements TaskManager {

    private Long epicTaskIncrement = 0L;
    private Long subTaskIncrement = 0L;
    private Long taskIncrement = 0L;
    private HashMap<Long, Task> idListHashMapTask = new HashMap<>();
    private HashMap<Long, EpicTask> idListHashMapEpicTask = new HashMap<>();
    private HashMap<Long, SubTask> idListHashMapSubTask = new HashMap<>();
    private InMemoryHistoryManager historyManager = Managers.getDefaultHistory();

    @Override
    public void addTaskList(Task tasks) {
        Task Task = tasks;
        idListHashMapTask.put(taskIncrement, Task);
        ++taskIncrement;
    }

    @Override
    public void updateTaskList(String name, String description, StatusTask status, Long id) {
        Task Task = new Task(name, description, status);
        idListHashMapTask.put(id, Task);
    }

    @Override
    public void printTaskList(Long id) {
        Task task = idListHashMapTask.get(id);
        System.out.println(task);
        historyManager.addToHistory(task);
    }

    @Override
    public void printAllTaskList() {
        idListHashMapTask.forEach((id, value) -> {
            System.out.println("id:" + id + "Value:" + value);
        });
    }

    @Override
    public void deleteAllTaskList() {
        idListHashMapTask.clear();
    }

    @Override
    public void deleteTaskListById(Long id) {
        idListHashMapTask.remove(id);
    }

    @Override
    public void addEpicTaskList(EpicTask task) {
        EpicTask epicTask = task;
        idListHashMapEpicTask.put(epicTaskIncrement, epicTask);
        ++epicTaskIncrement;
    }

    @Override
    public void updateEpicTaskList(String name, Long id) {
        EpicTask epicTask = new EpicTask(name, null, null);
        idListHashMapEpicTask.put(id, epicTask);
    }

    @Override
    public void printAllEpicTaskList() {
        idListHashMapEpicTask.forEach((id, value) -> {
            System.out.println("id" + id + "Value" + value);
        });
    }

    @Override
    public void deleteAllEpicTaskList() {
        idListHashMapEpicTask.clear();
        if (idListHashMapEpicTask.isEmpty() == true) {
            deleteAllSubTaskList();
        }
    }

    @Override
    public void deleteEpicTaskListById(Long id) {
        EpicTask epicTask = idListHashMapEpicTask.get(id);
        if (epicTask != null) {
            List<Long> subIds = epicTask.getSubtasksIds();
            for (long ids : subIds) {
                idListHashMapEpicTask.remove(ids);
            }
            idListHashMapEpicTask.remove(id);
        }
    }

    @Override
    public void printAllSubTaskList() {
        idListHashMapSubTask.forEach((id, value) -> {
            System.out.println("id:" + id + "value" + value);
        });
    }

    @Override
    public void updateSubTaskById(String discription, StatusTask status, Long epicId, Long id) {

        if (!idListHashMapEpicTask.containsKey(epicId)) {
            System.out.println("Epic с id: " + epicId + " не найден!");
            return;
        }

        SubTask subTask = new SubTask(null, discription, status, epicId);
        long subTaskId = id;
        idListHashMapSubTask.put(subTaskId, subTask);
        updateEpicStatus(epicId);
    }

    @Override
    public void printAllSubTaskbyIdEpicTask(Long epicId) {

        EpicTask epicTask = idListHashMapEpicTask.get(epicId);

        if (epicTask == null) {
            System.out.println("Эпик с ID " + epicId + " не найден.");
            return;
        }
        System.out.println("Подзадачи для Эпика: " + epicTask.getName());

        List<Long> subIds = epicTask.getSubtasksIds();

        for (Long sId : subIds) {
            SubTask sub = idListHashMapSubTask.get(sId);
            historyManager.addToHistory(sub);
            if (sub != null) {
                System.out.println("--> [ID:" + sId + "] " + sub.getDescription() + " | Статус: " + sub.getStatusTask());
            }
        }
    }

    @Override
    public void deleteAllSubTaskList() {
        idListHashMapSubTask.clear();
    }

    @Override
    public void deleteSubTaskListById(Long id) {
        SubTask subTask = idListHashMapSubTask.get(id);
        if (subTask == null) return;

        Long epicId = subTask.getEpicId();
        EpicTask epic = idListHashMapEpicTask.get(epicId);

        if (epic != null) {
            epic.getSubtasksIds().remove(id);
        }

        idListHashMapSubTask.remove(id);
        updateEpicStatus(epicId);
    }

    @Override
    public void printEpicTaskList(Long id) {
        EpicTask epicTask = idListHashMapEpicTask.get(id);
        historyManager.addToHistory(epicTask);
        System.out.println(epicTask);

    }


    @Override
    public void addSubTaskList(SubTask subtask) {

        if (!idListHashMapEpicTask.containsKey(subtask.getEpicId())) {
            System.out.println("Epic с id: " + subtask.getEpicId() + " не найден!");
            return;
        }

        SubTask subTask = subtask;
        long subTaskId = subTaskIncrement;
        idListHashMapSubTask.put(subTaskId, subTask);
        subTaskIncrement++;
        EpicTask epic = idListHashMapEpicTask.get(subtask.getEpicId());
        epic.addsubTaskIds(subTaskId);
        updateEpicStatus(subtask.getEpicId());
    }

    @Override
    public void updateEpicStatus(Long epicId) {
        EpicTask epic = idListHashMapEpicTask.get(epicId);
        List<Long> subIds = epic.getSubtasksIds();

        if (subIds.isEmpty()) {
            epic.setStatusTask(StatusTask.NEW);
            return;
        }

        int countNew = 0;
        int countDone = 0;

        for (Long sId : subIds) {
            SubTask sub = idListHashMapSubTask.get(sId);

            if (sub.getStatusTask() == StatusTask.NEW) {
                countNew++;
            } else if (sub.getStatusTask() == StatusTask.DONE) {
                countDone++;
            }
        }

        if (countDone == subIds.size()) {
            epic.setStatusTask(StatusTask.DONE);
        } else if (countNew == subIds.size()) {
            epic.setStatusTask(StatusTask.NEW);
        } else {
            epic.setStatusTask(StatusTask.IN_PROGRESS);
        }
    }

    public List<Task> getHistory() {
        return historyManager.getHistory();
    }
}