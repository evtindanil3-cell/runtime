package taskDis.taskfour.taskcounter;

public class Main {
    static void main(String[] args) {
        Student student = new Student("Danil",12);
        Student student1 = new Student("Artem",13);
        Student student3 = new Student("Aibar",14);
        System.out.println("Всего студентов:"+Student.counter);
    }
}
