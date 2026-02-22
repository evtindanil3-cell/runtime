package taskDis.taskOne;

public class Practice {
    public static void main(String[] args) {
       Student student = new Student("Danil","4");
       Student student1 = new Student("Aibar","4");
       Exam exam = new Exam(student,60.);
       Exam exam1 = new Exam(student1,61.);
       exam.checkGrade();
       exam1.checkGrade();
    }
}