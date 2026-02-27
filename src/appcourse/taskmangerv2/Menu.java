package appcourse.taskmangerv2;

public class Menu {

    public static void printMenu() {
        System.out.println("Для работы с обычными задачами введите 1");
        System.out.println("-------");
        System.out.println("Для работы с большими задачами введите 2");
        System.out.println("-------");
        System.out.println("Для работы с под задачами введите 3");
        System.out.println("-------");
        System.out.println("Посмотреть историю просмотров задач нажмите 4");
        System.out.println("-------");
        System.out.println("Для выхода из приложения введите 5");
        ;
    }

    public static void printTaskMenu() {
        System.out.println("Добавить задачу введите 1");
        System.out.println("-------");
        System.out.println("Изменить задачу по индексу введите 2");
        System.out.println("-------");
        System.out.println("Удалить задачу по индексу введите 3");
        System.out.println("-------");
        System.out.println("Удалить все задачи введите 4");
        System.out.println("-------");
        System.out.println("Вывести все задачи введите 5");
        System.out.println("-------");
        System.out.println("Вывести задачу по индексу введите 6");
    }

    public static void printEpicTaskMenu() {
        System.out.println("Добавить большую задачу введите 1");
        System.out.println("-------");
        System.out.println("Удалить все большие задачи введите 2");
        System.out.println("-------");
        System.out.println("Удалить  большую задачу по индексу введите 3");
        System.out.println("-------");
        System.out.println("Изменить большую задачу по индексу введите 4");
        System.out.println("-------");
        System.out.println("Вывести все большие задачи 2введите 5");
        System.out.println("-------");
        System.out.println("Вывести задачу по индексу введите 6");
    }

    public static void printSubTaskMenu() {
        System.out.println("Добавить под задачу введите 1");
        System.out.println("-------");
        System.out.println("Удалить все под задачи введите 2");
        System.out.println("-------");
        System.out.println("Удалить под задачу по индексу введите 3");
        System.out.println("-------");
        System.out.println("Изменить под задачу по индексу введите 4");
        System.out.println("-------");
        System.out.println("Вывести все под задачи введите 5");
        System.out.println("-------");
        System.out.println("Вывести под задачу по индексу введите 6");
    }
}