package appcourse.steptracker;

import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    int goalByStepsPerDay;
    MonthData[] month = new MonthData[12];

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
        this.goalByStepsPerDay = 10_000;
        for (int i = 0; i < month.length; i++) {
            month[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца от 1 до 12");
        int numMonths = scanner.nextInt();
        System.out.println("Введите день от 1 до 30 (включительно)");
        int numDay = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int step = scanner.nextInt();
        if ((numMonths < 1 || numMonths > 12) || (numDay < 1 || numDay > 30) || step < 0) {
            System.out.println("Неправильные данные ошибка");
        } else {
            MonthData monthData = month[numMonths - 1];
            monthData.days[numDay - 1] = step;

        }
    }

    public void changeStepGoal() {
        while (true) {
            System.out.println("Нынешняя цель по шагам:" + goalByStepsPerDay);
            System.out.println("Введите цель по шагам");
            int numStep = scanner.nextInt();
            if (numStep <= 0) {
                System.out.println("Ошибка измените внесенные значения");

            } else {
                goalByStepsPerDay = numStep;
                System.out.println("Новая цель по шагам:" + goalByStepsPerDay);
                break;
            }
        }

    }

    public void printStatistic() {
        System.out.println("Введите число месяца");
        int numMonths = scanner.nextInt();
        MonthData monthData = month[numMonths - 1];
        int resultMontStep = monthData.sumStepsFromMonth();
        int maxStepsInMont = monthData.maxSteps();
        int stepsInKm = Converter.convertToKm(resultMontStep);
        int stepsInCalor = Converter.convertStepsToKilocalories(resultMontStep);
        int bestSteps = monthData.bestSeries(goalByStepsPerDay);
        int avgStep = monthData.avgSteps(resultMontStep);
        System.out.println("количество пройденных шагов по дням:");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("общее количество шагов за месяц-" + resultMontStep);
        System.out.println("максимальное пройденное количество шагов в месяце-" + maxStepsInMont);
        System.out.println("среднее количество шагов-" + avgStep);
        System.out.println("пройденная дистанция (в км)-" + stepsInKm);
        System.out.println("количество сожжённых килокалорий-" + stepsInCalor);
        System.out.println("лучшая серия: максимальное количество подряд идущих дней-в течение которых количество шагов за день было равно или выше целевого-" + bestSteps);
    }
}
