package sixteen.taskTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        String[] students = grades.split(";");

        StringBuilder sb = new StringBuilder();
        for (String student : students) {
            String[] items = student.split(",");

            String name = capitalize(items[0]);
            String lastname = capitalize(items[1]);
            String subject = items[2].toLowerCase();
            String grade = gradeToString(items[3]);

            sb.append(name).append(" ");
            sb.append(lastname).append(" ");
            sb.append(subject).append(" - ");
            sb.append(grade).append("\n");
        }
        System.out.println(sb);
    }
}