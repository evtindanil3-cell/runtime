package Dis.Temperature;

import java.util.ArrayList;
import java.util.List;

public class temperature {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<>(List.of(15, 20, 25, 21, 16, 10, 20, 30, 18, 20, 26, 32, 20, 21, 23, 28));
        temp(temperatures);
        diff(temperatures);
        middle(temperatures);
    }
    public static void temp(ArrayList<Integer> temp) {
        ArrayList<Integer> tempp = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > 25) {
                tempp.add(i);
            } else {
                if (tempp.size() > result.size()) {
                    result.clear();
                    result.addAll(tempp);
                }
                tempp.clear();
            }
        }
        if (tempp.size() > result.size()) {
            result.clear();
            result.addAll(tempp);
        }
        for (Integer k : result) {
            System.out.println("День:" + (k + 1) + "Температура:" + temp.get(k));
        }
    }
    public static void diff(ArrayList<Integer> temp) {
        int result = 0;
        for (int i = 0; i < temp.size() - 1; i++) {
            if (temp.get(i) - temp.get(i + 1) >= 10 || temp.get(i) - temp.get(i + 1) <= -10) {
                result += 1;
            }
        }
        System.out.println(result);
    }
    public static void middle(ArrayList<Integer> temp) {
        int result = 0;
        for (Integer k : temp) {
            result += k;
        }
        result = result / temp.size();
        System.out.println("Middler Temperature.temperature:"+result);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > result) {

                System.out.println("Day:" + (i + 1) + " Temperature:" + temp.get(i));
            }
        }
    }
}
