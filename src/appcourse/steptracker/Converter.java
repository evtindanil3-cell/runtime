package appcourse.steptracker;

public class Converter {
    Converter() {

    }

    static int convertToKm(int steps) {
        int result = steps * 75;
        result = result / 100000;
        return result;
    }

    static int convertStepsToKilocalories(int steps) {
        int result = steps * 50;
        result = result / 1000;
        return result;
    }
}

