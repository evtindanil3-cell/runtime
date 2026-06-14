package taskDis.newTasks.ThreeTask.taskOne;

interface Administrator {
    void findAndGiveBook(Reader reader, String bookName);
    void overdueNotification(Reader reader, String bookName);
    String getName();
}
