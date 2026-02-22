package taskDis.taskTwo;

public class Practice {
    static void main(String[] args) {
        Client client = new Client("Evtindail3@gmail.com", "Danil");
        Client client1 = new Client("Aibar3@gmail.com", "Aibar");
        Order order = new Order(client, 1233.12);
        Order order1 = new Order(client1, 1000.1000);
        order.printReceipt();
        order1.printReceipt();
    }
}
