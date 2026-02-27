import appcourse.taskmangerv1.Manage;
import appcourse.taskmangerv1.Menu;
import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    int numMenu;
    int numTask;
    int numTaskEpic;
    int numTaskSub;

    Manage manage = new Manage();
    while (true) {
        Menu.printMenu();
        numMenu = Integer.parseInt(scanner.nextLine());
        if (numMenu == 1) {
            Menu.printTaskMenu();
            numTask = Integer.parseInt(scanner.nextLine());
            if (numTask == 1) {
                manage.manageTask1();
            } else if (numTask == 2) {
                manage.manageTask2();
            } else if (numTask == 3) {
                manage.manageTask3();
            } else if (numTask == 4) {
                manage.manageTask4();
            } else if (numTask == 5) {
                manage.manageTask5();
            } else if (numTask == 6) {
                manage.manageTask6();
            }
        } else if (numMenu == 2) {
            Menu.printEpicTaskMenu();
            numTaskEpic = Integer.parseInt(scanner.nextLine());
            if (numTaskEpic == 1) {
                manage.manageEpicTask1();
            } else if (numTaskEpic == 2) {
                manage.manageEpicTask2();
            } else if (numTaskEpic == 3) {
                manage.manageEpicTask3();
            } else if (numTaskEpic == 4) {
                manage.manageEpicTask4();
            } else if (numTaskEpic == 5) {
                manage.manageEpicTask5();
            } else if (numTaskEpic == 6) {
                manage.manageEpicTask6();
            }
        } else if (numMenu == 3) {
            Menu.printSubTaskMenu();
            numTaskSub = Integer.parseInt(scanner.nextLine());
            if (numTaskSub == 1) {
                manage.manageSubTask1();
            } else if (numTaskSub == 2) {
                manage.manageSubTask2();
            } else if (numTaskSub == 3) {
                manage.manageSubTask3();
            } else if (numTaskSub == 4) {
                manage.manageSubTask4();
            } else if (numTaskSub == 5) {
                manage.manageSubTask5();
            } else if (numTaskSub == 6) {
                manage.manageSubTask6();
            }
        } else if (numMenu == 4) {
            return;
        } else {
            System.out.println("Не правильный индекс");
        }
    }
}
