package taskDis.newTasks.ThreeTask.taskTwo;

abstract class Account {
    int amount;
    public Account(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    abstract void pay(int amount);
   abstract void transfer(Account account, int amount);
   abstract void addMoney(int amount);

}
