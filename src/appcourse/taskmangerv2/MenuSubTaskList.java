package appcourse.taskmangerv2;

public class MenuSubTaskList {
    public static void addprint() {
        System.out.println("Введите 1.описание,2.Статус(NEW,DONE),3.индекс большой задачи");
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

    public static void printTaskById() {
        System.out.println("Вывести под задачу по индексу большой задачи");
    }
}