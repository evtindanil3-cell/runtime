package taskDis.newTasks.ThreeTask.taskTwo;

public class Main {

    static void main(String[] args) {
        Account savings = new SavingsAccount(5000);
        Account checking = new CheckingAccount(2000);
        Account credit = new CreditAccount(-1000); // долг 1000

        System.out.println("Проверка начального баланса");
        System.out.println("Сберегательный: " + savings.getAmount());
        System.out.println("Расчетный: " + checking.getAmount());
        System.out.println("Кредитный: " + credit.getAmount());

        System.out.println("\n Попытка оплаты со сберегательного ");
        savings.pay(500);

        System.out.println("\n Перевод со сберегательного на расчетный ");

        savings.transfer(checking, 2000);

        System.out.println("\n Перевод с расчетного на кредитный");

        checking.transfer(credit, 1000);

        System.out.println("\nИТОГОВОЕ СОСТОЯНИЕ СЧЕТОВ");
        System.out.println("Сберегательный (осталось 3000): " + savings.getAmount());
        System.out.println("Расчетный : " + checking.getAmount());
        System.out.println("Кредитный : " + credit.getAmount());
    }
}
