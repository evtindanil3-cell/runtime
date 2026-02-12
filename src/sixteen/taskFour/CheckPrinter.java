package sixteen.taskFour;

import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item : items) {
            String[] words = item.split(",");
            System.out.printf("%-10s %-7s %-7s\n", words[0], words[1], words[2]);
        }
    }
}