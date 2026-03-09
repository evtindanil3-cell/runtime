package eighteen.taskthree;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество участников: ");
        int playersNumber = scanner.nextInt();

        List<String> words = readWordsFromFile("words.txt");
        if(words.size()<playersNumber){
            System.out.println("Недостаточно слов в файле. Добавьте слова и обновите файл.");
            return;
        }
        // Если слов меньше, чем участников, то выведите сообщение:
        // "Недостаточно слов в файле. Добавьте слова и обновите файл."
        // и завершите выполнение программы

        // воспользуйтесь статическим методом Collections.shuffle(List<?> list),
        // чтобы поменять порядок слов случайным образом
        Collections.shuffle(words);
        int wordsNumber = words.size() / playersNumber;

        for (int i = 0; i < playersNumber; i++) {
            String filename = String.format("player%s.txt", i + 1);
            List<String> subList = words.subList(i * wordsNumber, (i + 1) * wordsNumber);

            writeListToFile(subList, filename);
        }

        System.out.println("Карточки готовы!");
    }

    private static List<String> readWordsFromFile(String filename) throws IOException {
        List<String> st = new ArrayList<>();
        try(FileReader reader = new FileReader(filename); BufferedReader br = new BufferedReader(reader)){
            while(br.ready()){
                String line = br.readLine();
                st.add(line);
            }
            br.close();
            return st;
        }catch (IOException e){
            System.err.println("Произошла ошибка во время чтения файла.");
            e.printStackTrace();
        }
        return st;
        // добавьте построчное чтение из файла с помощью BufferedReader
        // в случае ошибки выведите сообщение: "Произошла ошибка во время чтения файла."
    }

    private static void writeListToFile(List<String> list, String filename) throws IOException {
        // добавьте запись слов в файл с помощью FileWriter
        // в случае ошибки выведите сообщение: "Произошла ошибка во время записи файла."
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for(String line: list){
                writer.write(line);
                writer.newLine();
            }
        }catch (IOException e){
            System.err.println("Произошла ошибка во время записи файла.");
            e.printStackTrace();
        }

    }
}