package appcourse.taskmangerv1;

import appcourse.taskmangerv1.EpicTask;

import java.util.HashMap;
import java.util.List;

public class ManagerEpicAndSubTask {

    private Long epicTaskIncrement = 0L;
    private Long subTaskIncrement = 0L;
    private HashMap<Long, EpicTask> idListHashMapEpicTask = new HashMap<>();
    private HashMap<Long, SubTask> idListHashMapSubTask = new HashMap<>();

    public void addEpicTaskList(String name) {
        EpicTask epicTask = new EpicTask(name, null, null);
        idListHashMapEpicTask.put(epicTaskIncrement, epicTask);
        ++epicTaskIncrement;
    }

    public void updateEpicTaskList(String name, Long id) {
        EpicTask epicTask = new EpicTask(name, null, null);
        idListHashMapEpicTask.put(id, epicTask);
    }

    public void printAllEpicTaskList() {
        idListHashMapEpicTask.forEach((id, value) -> {
            System.out.println("id" + id + "Value" + value);
        });
    }

    public void deleteAllEpicTaskList() {
        idListHashMapEpicTask.clear();
        if (idListHashMapEpicTask.isEmpty() == true) {
            deleteAllSubTaskList();
        }
    }

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

    public void printAllSubTaskList() {
        idListHashMapSubTask.forEach((id, value) -> {
            System.out.println("id:" + id + "value" + value);
        });
    }

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
            if (sub != null) {
                System.out.println("--> [ID:" + sId + "] " + sub.getDescription() + " | Статус: " + sub.getStatusTask());
            }
        }
    }

    public void deleteAllSubTaskList() {
        idListHashMapSubTask.clear();
    }

    public void deleteSubTaskListById(Long id) {
        idListHashMapSubTask.remove(id);
    }

    public void printEpicTaskList(Long id) {
        EpicTask epicTask = idListHashMapEpicTask.get(id);
        System.out.println(epicTask);
    }

    public void addSubTaskList(String discription, StatusTask status, Long epicId) {

        if (!idListHashMapEpicTask.containsKey(epicId)) {
            System.out.println("Epic с id: " + epicId + " не найден!");
            return;
        }

        SubTask subTask = new SubTask(null, discription, status, epicId);
        long subTaskId = subTaskIncrement;
        idListHashMapSubTask.put(subTaskId, subTask);
        subTaskIncrement++;
        EpicTask epic = idListHashMapEpicTask.get(epicId);
        epic.addsubTaskIds(subTaskId);
        updateEpicStatus(epicId);
    }

    private void updateEpicStatus(Long epicId) {
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
}