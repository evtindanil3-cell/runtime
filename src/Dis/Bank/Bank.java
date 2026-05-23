package Dis.Bank;

import java.util.LinkedList;

public class Bank {
    LinkedList<Client> queue = new LinkedList<>();

    public void Add(Client client) {
        if (client.isVip()) {
            int index = 0;
            while (index < queue.size() && (queue.get(index).vip || queue.get(index).pos > 10)) {
                index++;
            }
            queue.add(index, client);
            ageAndPromoteClients(index+1);
        } else {
            queue.addLast(client);
        }
    }

    private void ageAndPromoteClients(int startIndex) {
        for (int i = startIndex; i < queue.size(); i++) {
            Client client = queue.get(i);
            if (!client.vip) {
                client.pos++;
                if (client.pos > 10) {
                    queue.remove(i);
                    int promoIndex = 0;
                    while (promoIndex < queue.size() && queue.get(promoIndex).vip) {
                        promoIndex++;
                    }
                    queue.add(promoIndex, client);
                    i--;
                }
            }
        }
    }

    public Client serveClient() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.pollFirst();
    }

    public void printQueue() {
        System.out.println("Текущая очередь: " + queue);
    }
}

