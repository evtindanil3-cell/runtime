package taskDis.newTasks.ThreeTask.taskOne;

public class Main {
    static void main(String[] args) {
        LibraryEmployee vasya = new LibraryEmployee("Вася");
        PartnerAndReader petya = new PartnerAndReader("Петя");

        System.out.println("Закупка книг");
        vasya.orderBook(petya, "Игра Престолов");
        petya.deliverBook(vasya, "Игра Престолов");

        System.out.println("\nОбслуживание в библиотеке");

        petya.takeBook(vasya, "Игра Престолов");
        vasya.findAndGiveBook(petya, "Игра Престолов");

        System.out.println("\nСЦЕНАРИЙ 3: Проблемы с возвратом ");

        vasya.overdueNotification(petya, "Игра Престолов");
        petya.returnBook(vasya, "Игра Престолов");
    }
}
