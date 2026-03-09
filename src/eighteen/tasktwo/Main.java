package eighteen.tasktwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();
        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);
        // читайте файл построчно и сразу обновляйте frequencyMap.
        while (br.ready()) {
            String line = br.readLine();
            if (frequencyMap.containsKey(line)) {
                int currentCount = frequencyMap.get(line);
                frequencyMap.put(line, currentCount + 1);
            } else {
                frequencyMap.put(line, 1);
            }
        }
        br.close();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Буква" + entry.getKey() + ",колличество" + entry.getValue());
        }
        // выведите результат в формате "<буква>: <количество>"

    }

}
