package taskDis.newTasks.ThreeTask.taskOne;

class PartnerAndReader extends User implements Supplier, Reader {

    public PartnerAndReader(String name) {
        super(name);
    }

    // Реализация методов Supplier
    @Override
    public void deliverBook(Librarian librarian, String bookName) {
        System.out.println("Поставщик " + getName() + " принёс книгу \"" + bookName + "\" для библиотекаря " + librarian.getName() + ".");
    }

    // Реализация методов Reader
    @Override
    public void takeBook(Administrator administrator, String bookName) {
        System.out.println("Читатель " + getName() + " взял у администратора " + administrator.getName() + " книгу \"" + bookName + "\".");
    }

    @Override
    public void returnBook(Administrator administrator, String bookName) {
        System.out.println("Читатель " + getName() + " вернул администратору " + administrator.getName() + " книгу \"" + bookName + "\".");
    }
}