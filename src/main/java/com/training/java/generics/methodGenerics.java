package com.training.java.generics;

import com.training.java.reflection.validation.Customer;

import java.lang.reflect.Constructor;

public class methodGenerics {

    public static <T extends Number> String doSomething(T number){
        return "sonuç " + number.intValue();
    }

    public static <T extends Number,V extends CharSequence,Z extends BaseCleaning> String doSomething(T number,V str,Z option){
        return "sonuç " + number.intValue() + " " + str + " " + option.cleanInfo();
    }

    public static String doSomething(Long number){
        return "sonuç " + number.intValue();
    }

    public static String doSomething(Integer number){
        return "sonuç " + number.intValue();
    }

    public static String doSomething2(Number number){
        return "sonuç " + number.intValue();
    }

    public static <T extends Number,V extends CharSequence> T doSomething3(V v,Class<T> clazz){
        try {
            Constructor<T> constructor = clazz.getConstructor(Integer.class);
            constructor.newInstance(Integer.parseInt(v.toString()));
            return constructor.newInstance(Integer.parseInt(v.toString()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        Long aLong = doSomething3("100",
//                                  Long.class);
        String str = doSomething(100);
        String operation = doSomething(100,
                                       "operation",
                                       new BaseCleaning());
    }

}
