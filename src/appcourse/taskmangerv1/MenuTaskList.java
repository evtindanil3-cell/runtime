package appcourse.taskmangerv1;

public class MenuTaskList {
    public static void addprint() {
        System.out.println("Введите 1.задачу,2.описаник,3.статус задачи");
    }

    public static void changeTaskById() {
        System.out.println("Введите 1.задачу,2.описаник,3.статус задачи,4.индекс");
    }

    public static void deleteTaskById() {
        System.out.println("Введите индекс задачи для удаления");
    }

    public static void deleteAllTask() {
        System.out.println("Введите delete для удаления всех задач");
    }

    public static void printAllTask() {
        System.out.println("Вывести все задачи");
    }

    public static void printTaskById() {
        System.out.println("Вывести задачу по индексу");
    }
}