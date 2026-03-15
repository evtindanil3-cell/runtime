package taskDis.taskfour.taskcounter;

import java.util.List;

public class Student {
    private String name;
    private int age;
    public static int counter;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;


        counter++;
        System.out.println("Создан струдент:"+name);
    }

}
