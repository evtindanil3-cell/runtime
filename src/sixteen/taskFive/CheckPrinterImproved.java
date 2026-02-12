package sixteen.taskFive;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        int n = items.length;

        String[] names = new String[n];
        String[] counts = new String[n];
        String[] costs = new String[n];

        for (int i = 0; i < n; i++) {
            String[] words = items[i].split(",");

            if (words.length >= 3) {
                names[i] = words[0];
                counts[i] = words[1].trim();
                costs[i] = words[2].trim();
            }
        }

        int maxProduct = findMaxLength(names);
        int maxNum = findMaxLength(counts);
        int maxCost = findMaxLength(costs);

        for (int i = 0; i < n; i++) {
            System.out.printf("%-" + maxProduct + "s %-" + maxNum + "s %-" + maxCost + "s%n", names[i], counts[i], costs[i]);
        }
    }
}