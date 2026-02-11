package sixteen.taskThree;

public class Main {
    public static void main(String[] args){
        String[] text = {"Вероника Чехова физика — Безупречно","Анна Строкова математика — Потрясающе","Иван Петров геометрия — Безупречно"};

        GradesReversed gradesReversed = new GradesReversed();

        System.out.println(gradesReversed.serializeGrades(text));



    }
}
