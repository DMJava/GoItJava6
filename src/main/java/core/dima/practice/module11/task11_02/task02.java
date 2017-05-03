package core.dima.practice.module11.task11_02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class task02 {

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("333", "444");

        System.out.println("Original text : " + readFile());
        System.out.println("Replacing words : " + map.toString());

        fileContentReplacer(map);
        System.out.println("File after reWrite : " + readFile());
    }

    static String readFile() throws IOException {
        Scanner sc = new Scanner(Paths.get("file2"));
        String data = sc.useDelimiter("file2").next();
        return data;
    }

    public static void fileContentReplacer(Map<String, String> map) throws IOException {
        Files.write(Paths.get("file2"), map.values());
    }
}
//  Создать метод, который заменяет слова в файле (File) и переписать его содержание с новыми значениями.
//  File fileContentReplacer(Map map)