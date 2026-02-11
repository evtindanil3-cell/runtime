package sixteen.taskThree;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        StringBuilder sb = new StringBuilder();
        for(String students:grades){
            String[] items = students.split(" ");
            String name = items[0];
            String lastName = items[1];
            String subject = items[2];
            String grade = gradeStringToInt(items[4]);

            sb.append(name).append(",");
            sb.append(lastName).append(",");
            sb.append(subject).append(",");
            sb.append(grade).append(";");
        }
        return sb.toString();
    }
    //Решение из презы
    /**public String serializeGrades(String[] grades) {
        for (int i = 0; i < grades.length; i++) {
            String[] info = grades[i].split(" ");

            String grade = gradeStringToInt(info[4]);
            grades[i] = String.join(",", info[0].toLowerCase(), info[1].toLowerCase(), info[2].toLowerCase(), grade);
        }
        return String.join(";", grades);
    }*/
}