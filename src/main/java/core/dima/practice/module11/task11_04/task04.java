package core.dima.practice.module11.task11_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class task04 {
    public static void main(String[] args) {

        String s = "JAVA";

        System.out.println("Word " + s + " count in file: " + checkWord(s));
    }

    public static int countOfWords(String text, String word) {
        int s;
        String line[] = text.split(word);
        s = line.length - 1;
        if (text.endsWith(word)) {
            s++;
        }
        return s;
    }
    static int checkWord(String word) {
        StringBuilder sbText = new StringBuilder();
        try {
            Stream streamFromFile = Files.lines(Paths.get("file4"));
            streamFromFile.forEach(line -> sbText.append(line + "\n"));
            streamFromFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = sbText.toString();
        return countOfWords(text, word);
    }
}

//  Проверить, содержит ли файл конкретное слово. Вывести 0, если нет.
//  Вывести номер n, который эквивалентен числу появлений этого слова в файле.
//  int checkWord(String word)

//  Написать это задание с обычным try и try-with-resources(две версии).
