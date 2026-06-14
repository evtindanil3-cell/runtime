package taskDis.newTasks.ThreeTask.taskTwo;

public class SavingsAccount extends Account{

    public SavingsAccount(int amount) {
        super(amount);
    }

    @Override
    void pay(int amount) {
        System.out.println("Оплата не доступна");

    }

    @Override
    public void transfer(Account account, int amount) {
        if (this.amount - amount < 0) {
            System.out.println("Недостаточно денег для перевода!");
        } else {
            this.amount -= amount;
            account.addMoney(amount);
            System.out.println("Переведено " + amount + "Остаток: " + this.amount);
        }
    }

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
        System.out.println("Счет пополнен на " + amount + " Текущий баланс: " + this.amount);
    }
}
