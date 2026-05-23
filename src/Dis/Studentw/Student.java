package Dis.Studentw;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades;

    public Student(String name,ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

