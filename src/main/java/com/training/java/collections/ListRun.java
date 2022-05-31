package com.training.java.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListRun {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(); // Multithread ortamda kullanma
        // List<String> stringList = new Vector<>(); // ThreadSafe
        // List<String> stringList = Collections.synchronizedList(new ArrayList<>()); // ThreadSafe
        // List<String> stringList2 = new CopyOnWriteArrayList<>(); ConcurrentModificationException çözümü
        stringList.add("osman");
        stringList.add("mehmet");
        stringList.add("ali");

        String str = stringList.get(1);

        for (String s1 : stringList) {
            System.out.println(s1);
        }
        System.out.println("----------------------------------------");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("----------------------------------------");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        String remove = stringList.remove(1);

        if (stringList.contains("osman")) {
            System.out.println("Evet var");
        }
        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            stringList.add("osman");
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));
        delta = System.currentTimeMillis();
        String s5;
        for (String sd :
                stringList) {
            s5 = sd;
        }
//        for (int i = 0; i < stringList.size(); i++) {
//            String s = stringList.get(i);
//        }
        System.out.println("Query Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            stringList.remove(5000);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));
    }



    public void method() {
        List<String> stringList = new ArrayList<>();
        stringList.add("sdfjksdhf1");
        stringList.add("sdfjksdhf2");
        stringList.add("sdfjksdhf3");

    }

}
