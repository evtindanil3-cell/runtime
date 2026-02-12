package fiveteen.taskOne;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final List<String> passengerNames = List.of(
            "Аймурат Бериков",
            "Диана Азатова",
            "Азамат Бексултанов",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        Map<String,Integer> now = new HashMap<>();
        for(int i = 0;i<passengerNames.size();i++){
            now.put(passengerNames.get(i),i+1);
        }
        return now;
    }
}