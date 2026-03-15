package taskDis.taskfour.tasktransaction;

public class TransactionValidator {
    // объявите константы
    static final int MIN_AMOUNT = 100;
    static final int MAX_AMOUNT = 100_000;
    // объявите метод isValidAmount()
    public static boolean isValidAmount(int amount){
        if(amount <MIN_AMOUNT){
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " тг. Попробуйте ещё раз!");
        } else if (amount>MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " тг. Попробуйте ещё раз!");
        }
        return false;
    }
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода



}