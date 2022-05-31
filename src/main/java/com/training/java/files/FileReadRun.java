package com.training.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRun {
    public static void main(String[] args) {
        Path path = Paths.get("person.txt");
        try {
            List<String> stringList = Files.readAllLines(path);
            System.out.println(stringList);
            String str = "ahmet,ulas,70,160";
            String[] split = str.split(",");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
