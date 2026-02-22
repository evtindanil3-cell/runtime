package taskDis.taskOne;

public class Exam {
    private Student student;
    private Double grade;

    public Exam(Student student,Double grade){
        this.student = student;
        this.grade = grade;

    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void checkGrade(){
        if(this.grade>60){
            System.out.println("Студент "+student.getName()+" сдал экзамен.Курс: "+student.getCourse()+" оценка: "+this.grade);
        }else {
            System.out.println("Студент "+student.getName()+" не сдал экзамен.Курс: "+student.getCourse()+" оценка: "+this.grade);
        }
    }
}
