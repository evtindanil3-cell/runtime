package Dis.Bank;

public class testBanlk {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client("Risa",false);
        Client client1 = new Client("danil",true);
        Client client2 = new Client("artem",false);
        bank.Add(client);
        bank.Add(client1);
        bank.Add(client2);
        bank.printQueue();
        bank.serveClient();
        bank.printQueue();
        bank.serveClient();
        bank.printQueue();
    }
}
