package sixteen.taskFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CheckPrinterImproved printerImproved = new CheckPrinterImproved();
        String[] value = {"Пицца, 1 шт., 1552.5", "Чай, 2 шт., 566.5", "Печенье, 1 уп., 378.75"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i){
            values[i] = scanner.nextLine();
        }
        CheckPrinterImproved.printCheck(values);
    }
}
