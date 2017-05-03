package core.dima.practice.module11.task11_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class task04_vers02 {
    public static void main(String[] args) throws IOException{

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

    static int checkWord(String word) throws IOException {
        StringBuilder sbText = new StringBuilder();
        try (Stream streamFromFile = Files.lines(Paths.get("file4"))) {
            streamFromFile.forEach(line -> sbText.append(line + "\n"));
            streamFromFile.close();
        }
        String text = sbText.toString();
        return countOfWords(text, word);
    }
}