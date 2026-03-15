package taskDis.taskfour.taskbank;

public class BankAccount {
    String owner;
    double balance;
    static int totalAccounts;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        totalAccounts++;
    }

    public static void printTotalAccount(){
        System.out.println("Всего аккаунтов:"+totalAccounts);
    }
}
