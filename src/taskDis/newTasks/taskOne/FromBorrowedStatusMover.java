package taskDis.newTasks.taskOne;

public class FromBorrowedStatusMover extends BookMover {

    public void moveToStatus(Book book, StatusBook statusBook){
        switch (statusBook){
            case StatusBook.ARCHIVED:
                book.setStatusBook(StatusBook.ARCHIVED);
                System.out.println("Статус изменен на ARCHIVED");
                break;
            case StatusBook.BORROWED:
                System.out.println("Статус не может быть изменен на BORROWED");
                break;
            case AVAILABLE:
                book.setStatusBook(StatusBook.AVAILABLE);
                System.out.println("Статус не может быть изменен на AVAILABLE");
                break;
            case OVERDUED:
                book.setStatusBook(StatusBook.OVERDUED);
                System.out.println("Статус изменен на  OVERDUED");
                break;
        }
    }
}
