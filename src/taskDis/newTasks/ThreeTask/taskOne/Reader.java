package taskDis.newTasks.ThreeTask.taskOne;

interface Reader {
    void takeBook(Administrator administrator, String bookName);
    void returnBook(Administrator administrator, String bookName);
    String getName();
}