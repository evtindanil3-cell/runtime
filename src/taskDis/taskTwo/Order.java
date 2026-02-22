package taskDis.taskTwo;

public class Order {
    private Client client;
    private Double amount;

    public Order(Client client, Double amount) {
        this.client = client;
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public void printReceipt() {
        System.out.println("Заказ оформлен клиентом:" + client.getName());
        System.out.println("Сумма заказа:" + this.amount);
    }
}
