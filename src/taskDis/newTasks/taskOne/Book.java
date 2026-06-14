package taskDis.newTasks.taskOne;

import appcourse.taskmangerv2.StatusTask;

public class Book {
    String title;
    StatusBook statusBook;
    public Book(String title){
        this.title = title;
        this.statusBook = StatusBook.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StatusBook getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(StatusBook statusBook) {
        this.statusBook = statusBook;
    }
}
