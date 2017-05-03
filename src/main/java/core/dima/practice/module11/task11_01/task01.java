package core.dima.practice.module11.task11_01;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class task01 {

    public static File replacer (Map<String, String> map) throws IOException {

        StringBuilder sb = new StringBuilder();
        File file = new File("file1");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();

        String string = sb.toString();
        for (Map.Entry<String, String> sSE : map.entrySet()) {
            string = string.replaceAll(sSE.getKey(), sSE.getValue());
        }
        return null;
    }

    public static void main(String[] args) throws IOException {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("file1"))){
            String text = "888";
            bw.write(text);
        }
        Map<String,String> map = new HashMap<>();
        replacer(map);
    }
}

//Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
//String replacer(Map map)