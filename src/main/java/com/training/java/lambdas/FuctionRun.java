package com.training.java.lambdas;

import com.training.java.reflection.validation.Customer;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class FuctionRun {
    public static void main(String[] args) {
        IFunction<String, Integer> function = i -> "girilen değer " + i;
        IFunction<Customer, String> function2 = s -> Customer.createCustomer()
                                                             .setName(s);
        // Java Functional Interface 1
        Function<Integer, String> javaFunction = i -> "girilen değer " + i;
        System.out.println(javaFunction.apply(100));
        System.out.println(IFunction.field1);
        // Java Functional Interface 2
        Consumer<String> consumeMe = o -> System.out.println(o.concat(" deneme"));
        List<String> stringList = List.of("osman",
                                          "mehmet",
                                          "nida",
                                          "ayşe");
        // Eski
        for (String str : stringList) {
            System.out.println(str);
        }
        // yeni
        stringList.forEach(z -> System.out.println(z));
        stringList.forEach(System.out::println);
        // Java Functional Interface 3
        Predicate<String> stringPredicate = str -> str.length() > 5;
        // Java Functional Interface 4
        String hh = "Hela Henson";
        Supplier<String> stringSupplier = () -> "osman" + hh;
        for (int i = 0; i < 100; i++) {
            doSomething("osman " + hh + " mont");
        }
        for (int i = 0; i < 100; i++) {
            doSomething2(() -> "osman " + hh + " mont");
        }
        // Java Functional Interface 1 variant 1
        BiFunction<String,String,Integer> biFunction = (s1,s2) -> s1.length() + s2.length();
        // Java Functional Interface 2 variant 1
        BiConsumer<String,String> biConsumer = (l,k) -> System.out.println(l + " " + k);
        // Java Functional Interface 3 variant 1
        BiPredicate<String,String> biPredicate = (p,o) -> p.equals(o);
        // Java Functional Interface 1 variant 2
        IntFunction<String> intFunction = i -> "girilen data " + i;
        LongFunction<String> longFunction = l -> "girilen data " + l;
        DoubleFunction<String> doubleFunction = l -> "girilen data " + l;
        // Java Functional Interface 1 variant 3
        IntToDoubleFunction intToDoubleFunction = int1 -> Math.acos(int1);
        //
        Function<Integer,String> intFunction2 = i -> "girilen data " + i;
        //
        UnaryOperator<String> stringUnaryOperator  = s -> s + " deneme";
        Function<String,String> stringStringFunction = s -> s + " deneme";
        BinaryOperator<String> stringBinaryOperator = (s1,s2) -> s1 + " " + s2;
        BiFunction<String,String,String> stringBiFunction = (s1,s2) -> s1 + " " + s2;
        //
    }

    static int debugLevel = 3;

    public static void doSomething(String str) {
        if (debugLevel > 4) {
            System.out.println("Something is done : " + str);
        }
    }

    public static void doSomething2(Supplier<String> str) {
        if (debugLevel > 4) {
            System.out.println("Something is done : " + str.get());
        }
    }
}
