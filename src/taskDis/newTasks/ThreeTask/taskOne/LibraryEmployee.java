package taskDis.newTasks.ThreeTask.taskOne;

class LibraryEmployee extends User implements Librarian, Administrator {

    public LibraryEmployee(String name) {
        super(name);
    }

    // Реализация методов Librarian
    @Override
    public void orderBook(Supplier supplier, String bookName) {
        System.out.println("Библиотекарь " + getName() + " заказал книгу \"" + bookName + "\" у поставщика " + supplier.getName() + ".");
    }

    // Реализация методов Administrator
    @Override
    public void findAndGiveBook(Reader reader, String bookName) {
        System.out.println("Администратор " + getName() + " нашёл и выдал книгу \"" + bookName + "\" читателю " + reader.getName() + ".");
    }

    @Override
    public void overdueNotification(Reader reader, String bookName) {
        System.out.println("Администратор " + getName() + " отправил уведомление читателю " + reader.getName() + " о просрочке возврата книги \"" + bookName + "\"!");
    }
}
