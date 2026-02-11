package sixteen.taskTwo;

public class Main {
    public static void main(String[] args){
        Grades grades = new Grades();
        String text = "вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";
        grades.gradeBeautifier(text);
    }
}
