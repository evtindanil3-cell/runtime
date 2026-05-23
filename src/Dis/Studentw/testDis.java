package Dis.Studentw;

import java.util.ArrayList;

public class testDis {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>(5);
        grades.add(90);
        grades.add(80);
        grades.add(90);
        grades.add(90);
        grades.add(95);
        ArrayList<Integer> grades1 = new ArrayList<>(5);
        grades1.add(100);
        grades1.add(70);
        grades1.add(75);
        grades1.add(90);
        grades1.add(80);
        ArrayList<Integer> grades2 = new ArrayList<>(5);
        grades2.add(60);
        grades2.add(50);
        grades2.add(65);
        grades2.add(50);
        grades2.add(50);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Danil", grades));
        students.add(new Student("Artem", grades1));
        students.add(new Student("Artem", grades2));
        System.out.println(middle(students));
        top(students);
        bot(students);
    }

    public static ArrayList<Integer> middle(ArrayList<Student> students) {
        ArrayList<Integer> grades = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            int result = 0;
            for (int k = 0; k < students.get(i).grades.size(); k++) {
                result += students.get(i).grades.get(k);
            }
            result = result / students.get(i).grades.size();
            grades.add(result);
        }
        return grades;
    }

    public static void top(ArrayList<Student> students) {
        ArrayList<Integer> g = middle(students);
        int res = 0;
        for (int i = 0; i < g.size() - 1; i++) {
            if (g.get(i) > g.get(i + 1)) {
                res = g.get(i);
            }
        }
        for (int k = 0; k < g.size(); k++) {
            if (g.get(k).equals(res)) {
                System.out.println("Имя студента:" + students.get(k).name + " Самая высоая средняя оценка:" + g.get(k));
            }
        }
    }

    public static void bot(ArrayList<Student> students) {
        ArrayList<Integer> g = middle(students);
        int res = 0;
        for (int i = 0; i < g.size(); i++) {
            if (g.get(i) < 70) {
                res = g.get(i);
                for (int k = 0; k < g.size(); k++) {
                    if (g.get(k).equals(res)) {
                        System.out.println("Имя студента:" + students.get(k).name + " Cредняя оценка меньше 70:" + g.get(k));
                    }
                }
            }
        }
    }
}
