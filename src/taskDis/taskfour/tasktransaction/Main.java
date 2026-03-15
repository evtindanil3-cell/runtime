package taskDis.taskfour.tasktransaction;

import java.util.Scanner;



public class Main {
    static void main(String[] args) {
        TransactionValidator transactionValidator = new TransactionValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в тенге.");
        // считайте сумму перевода
        int Sum = scanner.nextInt();

        boolean isValid = transactionValidator.isValidAmount(Sum); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + Sum + " тг. успешно выполнен.");
    }
}
