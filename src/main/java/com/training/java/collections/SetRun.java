package com.training.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRun {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("osman");
        stringSet.add("ali");
        stringSet.add("veli");
        stringSet.add("veli");
        stringSet.add("veli");
        stringSet.add("veli");
        stringSet.add("veli");
        stringSet.add("veli");
        stringSet.add("veli");
        System.out.println(stringSet);
        System.out.println(stringSet.size());
        if (stringSet.contains("osman")){
            System.out.println("var");
        }
        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("osman");
        stringSet2.add("ali");
        stringSet2.add("mehmet");

        Set<String> stringSet3 = new HashSet<>(stringSet);
        stringSet3.removeAll(stringSet2);
        System.out.println("Farkı : " + stringSet3);

        Set<String> stringSet4 = new HashSet<>(stringSet);
        stringSet4.retainAll(stringSet2);
        System.out.println("Kesişim : " + stringSet4);

        Set<String> stringSet5 = new HashSet<>(stringSet);
        stringSet5.addAll(stringSet2);
        System.out.println("Birleşimi : " + stringSet5);

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            stringSet.add("osman" + i);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        String s5;
        for (String sd :
                stringSet) {
            s5 = sd;
        }
        System.out.println("Query Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            stringSet.remove("veli");
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

    }
}
