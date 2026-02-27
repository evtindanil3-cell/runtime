package appcourse.taskmangerv1;

import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    ManagerEpicAndSubTask manager = new ManagerEpicAndSubTask();
    ManagerTask managerTask = new ManagerTask();
    int numMenu;
    int numTask;
    int numTaskEpic;
    int numTaskSub;
    Long id;
    Long id1;
    String name;
    String description;
    String status;

    public void manageSubTask1() {
        MenuSubTaskList.addprint();
        description = scanner.nextLine();
        status = scanner.next().toUpperCase();
        StatusTask statusTask = StatusTask.valueOf(status);
        id = scanner.nextLong();
        scanner.nextLine();
        manager.addSubTaskList(description, statusTask, id);
    }

    public void manageSubTask2() {
        MenuSubTaskList.deleteAllTask();
        name = scanner.nextLine().toUpperCase();
        if (name.equals("DELETE")) {
            manager.deleteAllSubTaskList();
        }
    }

    public void manageSubTask3() {
        MenuSubTaskList.deleteTaskById();
        id = scanner.nextLong();
        scanner.nextLine();
        manager.deleteSubTaskListById(id);
    }

    public void manageSubTask4() {
        MenuSubTaskList.changeTaskById();
        description = scanner.nextLine();
        status = scanner.next().toUpperCase();
        StatusTask statusTask = StatusTask.valueOf(status);
        id = scanner.nextLong();
        id1 = scanner.nextLong();
        manager.updateSubTaskById(description, statusTask, id, id1);
    }

    public void manageSubTask5() {
        manager.printAllSubTaskList();
    }

    public void manageSubTask6() {
        MenuSubTaskList.printTaskById();
        id = scanner.nextLong();
        scanner.nextLine();
        manager.printAllSubTaskbyIdEpicTask(id);
    }

    public void manageEpicTask1() {
        MenuEpicTaskList.addprint();
        name = scanner.nextLine();
        manager.addEpicTaskList(name);
    }

    public void manageEpicTask2() {
        MenuEpicTaskList.changeTaskById();
        name = scanner.nextLine();
        id = scanner.nextLong();
        manager.updateEpicTaskList(name, id);
    }

    public void manageEpicTask3() {
        MenuEpicTaskList.deleteTaskById();
        id = scanner.nextLong();
        manager.deleteEpicTaskListById(id);
    }

    public void manageEpicTask4() {
        MenuEpicTaskList.deleteAllTask();
        name = scanner.nextLine().toUpperCase();
        if (name.equals("DELETE")) {
            manager.deleteAllEpicTaskList();
        }
    }

    public void manageEpicTask5() {
        manager.printAllEpicTaskList();
    }

    public void manageEpicTask6() {
        MenuEpicTaskList.printTaskById();
        id = scanner.nextLong();
        scanner.nextLine();
        manager.printEpicTaskList(id);
    }

    public void manageTask1() {
        MenuTaskList.addprint();
        name = scanner.nextLine();
        description = scanner.nextLine();
        status = scanner.next().toUpperCase();
        StatusTask statusTask = StatusTask.valueOf(status);
        managerTask.addTaskList(name, description, statusTask);
    }

    public void manageTask2() {
        MenuTaskList.changeTaskById();
        name = scanner.nextLine();
        description = scanner.nextLine();
        status = scanner.next().toUpperCase();
        StatusTask statusTask = StatusTask.valueOf(status);
        id = scanner.nextLong();
        scanner.nextLine();
        managerTask.updateTaskList(name, description, statusTask, id);
    }

    public void manageTask3() {
        MenuTaskList.deleteTaskById();
        id = scanner.nextLong();
        scanner.nextLine();
        managerTask.deleteTaskListById(id);
    }

    public void manageTask4() {
        MenuTaskList.deleteAllTask();
        name = scanner.nextLine().toUpperCase();
        if (name.equals("DELETE")) {
            managerTask.deleteAllTaskList();
        }
    }

    public void manageTask5() {
        managerTask.printAllTaskList();
    }

    public void manageTask6() {
        MenuTaskList.printTaskById();
        id = scanner.nextLong();
        scanner.nextLine();
        managerTask.printTaskList(id);
    }
}
