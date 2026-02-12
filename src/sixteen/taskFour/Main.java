package sixteen.taskFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckPrinter checkPrinter = new CheckPrinter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i){
            values[i] = scanner.nextLine();
        }
        checkPrinter.printCheck(values);
    }
}
