package taskDis.taskThree;

import javax.accessibility.AccessibleAction;

public class Transaction {
    private Account account;
    private Double sumOper;

    public Transaction(Account account,Double sumOper) {
        this.account = account;
        this.sumOper = sumOper;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getSumOper() {
        return sumOper;
    }

    public void setSumOper(Double sumOper) {
        this.sumOper = sumOper;
    }

    public void changeBalance() {
        Double temp = 0.;
        if (this.sumOper>0) {
            temp = account.getBalance() + this.sumOper;
            account.setBalance(temp);
        } else {
            temp = account.getBalance() - this.sumOper;
            account.setBalance(temp);
        }
    }
}
