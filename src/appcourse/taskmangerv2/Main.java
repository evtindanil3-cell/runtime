package appcourse.taskmangerv2;

class Main {
    static void main(String[] args) {

        InMemoryTaskManager manager = Managers.getDefault();

        Task task = new Task("dsada", "dasda", StatusTask.NEW);
        manager.addTaskList(task);
        manager.printAllTaskList();
        manager.updateTaskList("dsdadasd", "adadadd", StatusTask.DONE, 0L);
        manager.printAllTaskList();
        System.out.println(manager.getHistory());

    }
}
