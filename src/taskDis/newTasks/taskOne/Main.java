package taskDis.newTasks.taskOne;

public class Main {
    static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, StatusBook.BORROWED);
        System.out.println(book.getStatusBook());
        fromAvailableStatusMover.moveToStatus(book, StatusBook.ARCHIVED);
        System.out.println(book.getStatusBook());
        fromAvailableStatusMover.moveToStatus(book, StatusBook.OVERDUED);
        System.out.println(book.getStatusBook());
        fromAvailableStatusMover.moveToStatus(book, StatusBook.BORROWED);
        System.out.println(book.getStatusBook());
    }
}
