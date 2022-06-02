package com.training.java.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("osman",
                                          "osman",
                                          "mehmet",
                                          "ali",
                                          "ali",
                                          "veli",
                                          "mehmet");
        Set<String> stringSet = new TreeSet<>();
        for (String asd : stringList) {
            stringSet.add(asd);
        }
        List<String> resultList = new ArrayList<>();
        for (String asd : stringSet) {
            if (asd.length() >= 4) {
                resultList.add(asd);
            }
        }
        System.out.println(resultList);
        System.out.println("----------------------------");
        // Stream lerle yaparsak
        stringList.stream()
                  .peek(s -> System.out.println("Before Distinct : " + s + " Thread : " + Thread.currentThread().getName()))
                  .distinct()
                  .peek(s -> System.out.println("Before Filter : " + s + " Thread : " + Thread.currentThread().getName()))
                  .filter(s -> s.length() >= 4)
//                  .peek(s -> System.out.println("Before Sorted : " + s))
//                  .sorted()
                  .peek(s -> System.out.println("Before Foreach : " + s + " Thread : " + Thread.currentThread().getName()))
                  .forEach(System.out::println);
    }
}
