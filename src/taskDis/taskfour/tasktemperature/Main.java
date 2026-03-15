package taskDis.taskfour.tasktemperature;

public class Main {
    static void main(String[] args) {
        System.out.println("Цельсия в фаренгейты:"+TemperatureConverter.celsiusToFahrenheit(37));
        System.out.println("Фаренгейты в цельсия:"+TemperatureConverter.fahrenheitToCelsius(120));
    }
}
