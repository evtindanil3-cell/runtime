import appcourse.steptracker.StepTracker;

import java.util.Scanner;


public static void main(String[] args) {
    StepTracker stepTracker = new StepTracker(new Scanner(System.in));

    while (true) {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        if (command == 1) {
            stepTracker.addNewNumberStepsPerDay();
        } else if (command == 2) {
            stepTracker.changeStepGoal();
        } else if (command == 3) {
            stepTracker.printStatistic();
        } else if (command == 4) {
            break;
        } else {
            System.out.println("Введен не правильный индекс");
        }
    }
}

public static void printMenu() {
    System.out.println("1-ввести количество шагов за определённый день:");
    System.out.println("2-изменить цель по количеству шагов в день:");
    System.out.println("3-напечатать статистику за определённый месяц:");
    System.out.println("4-выйти из приложения.");
}


