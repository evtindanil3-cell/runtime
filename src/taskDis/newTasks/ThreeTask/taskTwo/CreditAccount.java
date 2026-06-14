package taskDis.newTasks.ThreeTask.taskTwo;

public class CreditAccount extends Account{
    public CreditAccount(int amount) {
        super(amount);
    }

    @Override
    void pay(int amount) {
        this.amount-=amount;
        System.out.println("Оплочено +"+ amount+"на карте"+ this.amount);
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Переводить нельзя");
    }

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
        int Amount = 0;
        if(this.amount>0){
            Amount = this.amount;
            System.out.println("Счет пополнен на " + amount + " Текущий баланс: " + this.amount+"Остаток возвразен на карту"+Amount);
            this.amount -=this.amount;
        }
        System.out.println("Счет пополнен на " + amount + " Текущий баланс: " + this.amount);
    }
}
