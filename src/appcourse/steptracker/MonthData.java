package appcourse.steptracker;

public class MonthData {
    int num;

    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + "день:" + "шагов-" + days[i]);
        }
    }

    int sumStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            num += days[i];

        }
        return num;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries += 1;
                finalSeries = Math.max(finalSeries, currentSeries);
            } else {

                currentSeries = 0;
            }
        }
        return finalSeries;
    }

    int avgSteps(int step) {
        int result = step / days.length;
        System.out.println(days.length);
        return result;
    }
}
