package taskDis.newTasks.taskOne;

import appcourse.taskmangerv2.StatusTask;

public class FromAvailableStatusMover extends BookMover {

    public void moveToStatus(Book book, StatusBook statusBook){
        switch (statusBook){
            case StatusBook.ARCHIVED:
                book.setStatusBook(StatusBook.ARCHIVED);
                System.out.println("Статус изменен на ARCHIVED");
                break;
            case StatusBook.BORROWED:
                book.setStatusBook(StatusBook.BORROWED);
                System.out.println("Статус изменен на BORROWED");
                break;
            case AVAILABLE:
                System.out.println("Статус не может быть измене на тот же самый");
                break;
            case OVERDUED:
                System.out.println("Статус не может быть изменен на OVERDUED");
                break;
        }
    }
}
