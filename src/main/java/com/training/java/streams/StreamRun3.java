package com.training.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun3 {
    public static void main(String[] args) {
        List<String> stringList = List.of("osman",
                                          "osman",
                                          "mehmet",
                                          "ali",
                                          "ali",
                                          "veli",
                                          "mehmet",
                                          "abdurrahman",
                                          "ahmed");
        boolean allMatch = stringList.stream()
                                     .filter(s -> s.length() > 4)
                                     .allMatch(s -> s.contains("a"));
        boolean anyMatch = stringList.stream()
                                     .filter(s -> s.length() > 4)
                                     .anyMatch(s -> s.contains("a"));
        stringList.stream()
                  .limit(10)
                  .filter(s -> s.length() > 4)
                  .forEach(System.out::println);
        System.out.println("------------------");
        stringList.stream()
                  .skip(2)
                  .filter(s -> s.length() > 4)
                  .forEach(System.out::println);

        List<String> stringList1 = stringList.stream()
                                             .filter(s -> s.length() > 4)
                                             .collect(Collectors.toList());

        Map<String, Person> stringPersonMap = stringList.stream()
                                                        .filter(s -> s.length() > 4)
                                                        .distinct()
                                                        .collect(Collectors.toMap(s -> s,
                                                                                  s -> new Person().setName(s)));
        String collect = stringList.stream()
                                   .filter(s -> s.length() > 4)
                                   .collect(Collectors.joining(" "));
        Integer reducedInteger = stringList.stream()
                                           .filter(s -> s.length() > 4)
                                           .reduce(0,
                                                   (i, s) -> i + s.length(),
                                                   (i1, i2) -> i1 + i2);
        ArrayList<String> reduce = stringList.stream()
                                             .filter(s -> s.length() > 4)
                                             .reduce(new ArrayList<String>(),
                                                     (al, s) -> {
                                                         al.add(s);
                                                         return al;
                                                     },
                                                     (al1, al2) -> {
                                                         al1.addAll(al2);
                                                         return al1;
                                                     }
                                             );


        Topla collect1 = stringList.stream()
                                   .filter(s -> s.length() > 4)
                                   .collect(() -> new Topla(),
                                            (t, s) -> t.add(s.length()),
                                            (t1, t2) -> t1.add(t2.getInteger()));

        List<Character> collect2 = stringList.stream()
                                             .filter(s -> s.length() > 4)
                                             .map(s -> {
                                                 Character[] characters = new Character[s.length()];
                                                 for (int i = 0; i < s.length(); i++) {
                                                     characters[i] = s.charAt(i);
                                                 }
                                                 return characters;
                                             })
                                             .flatMap(ca -> Stream.of(ca))
                                             .distinct()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println(collect2);

        Stream<Character> characterStream = stringList.stream()
                                                      .filter(s -> s.length() > 4)
                                                      .map(s -> {
                                                          Character[] characters = new Character[s.length()];
                                                          for (int i = 0; i < s.length(); i++) {
                                                              characters[i] = s.charAt(i);
                                                          }
                                                          return characters;
                                                      })
                                                      .flatMap(ca -> Stream.of(ca));

        Stream<Stream<Character>> streamStream = stringList.stream()
                                                           .filter(s -> s.length() > 4)
                                                           .map(s -> {
                                                               Character[] characters = new Character[s.length()];
                                                               for (int i = 0; i < s.length(); i++) {
                                                                   characters[i] = s.charAt(i);
                                                               }
                                                               return characters;
                                                           })
                                                           .map(ca -> Stream.of(ca));


    }
}
