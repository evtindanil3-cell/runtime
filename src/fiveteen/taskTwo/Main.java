package fiveteen.taskTwo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Main pizzeria = new Main();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        int counts = 1;
        if (orders.containsKey(clientName)) {
            counts++;
            orders.put(clientName, counts);
        } else {
            orders.put(clientName, counts);
        }
    }

    private void printStatistics() {
        int item;
        int result = 0;
        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            item = entry.getValue();
            result += item;
            System.out.println("Заказов от " + entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("Всего заказов:" + result);

    }
    /*
    Альтернативное решение
    private void printStatistics() {
        int ordersCount = 0;
        for (String clientName : orders.keySet()) {
            System.out.println("Заказов от " + clientName + ": " + orders.get(clientName));
            ordersCount += orders.get(clientName);
        }
        System.out.println("Всего заказов: " + ordersCount);
    }
    */
}