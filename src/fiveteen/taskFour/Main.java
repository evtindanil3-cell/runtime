package fiveteen.taskFour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final Map<Long, User> users = new HashMap<>();

    public static void main(String[] args) {
        for (long i = 1; i <= 1_000_000L; i++) {
            users.put(i,new User(i, "Имя " + i));
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static User findUser(Long userId) {
            return users.get(userId);
    }
}