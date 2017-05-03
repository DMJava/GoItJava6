package core.dima.practice.module11.task11_03;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class task_03 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "9999");
        map.put("Amigo", "7777");

        System.out.println("Original file text : " + readFile());
        System.out.println("Add text : " + map.toString());

        fileContentMerger(map);

        System.out.println("File after reWrite : " + readFile());
    }

    private static String readFile() throws IOException {
        Scanner sc = new Scanner(Paths.get("file1"));
        String map = sc.useDelimiter("file1").next();
        return map;
    }

    private static void fileContentMerger(Map<String, String> map) throws IOException {
        File file = new File("file1");
        FileWriter fr = null;
        fr = new FileWriter(file, true);
        fr.write(String.valueOf(map));
    }
}

//  Создать метод, который заменяет слова в файле (File), и вывести результат в существующий контент файла.
//  File fileContentMerger(Map<String, String> map)
