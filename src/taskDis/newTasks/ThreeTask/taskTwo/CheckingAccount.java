package taskDis.newTasks.ThreeTask.taskTwo;

public class CheckingAccount extends Account {

    public CheckingAccount(int amount) {
        super(amount);
    }

    @Override
    void pay(int amount) {
        this.amount-=amount;
        System.out.println("Оплочено +"+ amount+"на карте"+ this.amount);
    }

    @Override
    public void transfer(Account account, int amount) {
        if (this.amount - amount < 0) {
            System.out.println("Недостаточно денег для перевода!");
        } else {
            this.amount -= amount;
            account.addMoney(amount);
            System.out.println("Переведено " + amount + " у.е. Остаток: " + this.amount);
        }
    }

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
        System.out.println("Счет пополнен на " + amount + " Текущий баланс: " + this.amount);
    }
}
