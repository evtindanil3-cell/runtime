package taskDis.newTasks.FourTask.OneTask;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.format("У игрока %d слотов с оружием (индексы от 0 до %d).%n"
                        + "Введите номер слота, чтобы выстрелить, или -1 для выхода:%n",
                player.getSlotsCount(), player.getSlotsCount() - 1
        );

        int slot;

        while (true) {
            System.out.print("Выбор оружия (или -1): ");
            slot = scanner.nextInt();

            if (slot == -1) {
                break;
            }

            player.shotWithWeapon(slot);
        }

        System.out.println("Game over! Спасибо за тестирование Half-Life 3!");
        scanner.close();
    }
}

