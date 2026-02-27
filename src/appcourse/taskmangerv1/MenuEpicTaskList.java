package appcourse.taskmangerv1;

public class MenuEpicTaskList {
    public static void addprint() {
        System.out.println("Введите 1.задачу");
    }

    public static void changeTaskById() {
        System.out.println("Введите 1.описание задачи,2.Статус(NEW,DONE),3.индекс под задачи,4.Индекс большой задачи");
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
        System.out.println("Введите индекс большой задачи");
    }
}
