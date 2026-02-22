package taskDis.taskThree;

public class Practice {
    static void main(String[] args) {
        Account account = new Account("Danil",1000.);
        Account account1 = new Account("Aibara",10.);
        Transaction transaction = new Transaction(account,100.);
        Transaction transaction1 = new Transaction(account1,200.);
        System.out.println(account.getBalance());
        System.out.println(account1.getBalance());
        transaction.changeBalance();
        transaction1.changeBalance();
        System.out.println(account.getBalance());
        System.out.println(account1.getBalance());

    }
}
