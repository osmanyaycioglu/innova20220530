package com.training.java.reflection;

import com.training.java.annotations.FirstAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassInformation {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        // 1.yol class dan static olarak al
        Class<MyClass> myClassClass = MyClass.class;
        // 2.yol referansdan .getClass() ile al
        Class<? extends MyClass> myClassClass1 = myClass.getClass();
        try {
            // 3.yol Class.forName ile full path class ismi ile al
            Class<MyClass> myClassClass2 = (Class<MyClass>) Class.forName("com.training.java.reflection.MyClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Method[] declaredMethods = myClassClass.getDeclaredMethods();
        Constructor<?>[] constructors = myClassClass.getConstructors();
        Field[] declaredFields = myClassClass.getDeclaredFields();
        for (Field field : declaredFields) {
            Class<?> type = field.getType();
            Annotation[] annotations = field.getAnnotations();
            if (annotations != null) {
                System.out.println(field.getName() + " " + annotations.getClass()
                                                                      .getName() + " Type : " + type.getSimpleName());
            }
            FirstAnno annotation = field.getAnnotation(FirstAnno.class);
            if (annotation != null) {
                String[] nameParam = annotation.name();
                System.out.println(field.getName()
                                           + " üstünden FirstAnno var ve name : "
                                           + nameParam[0]
                                           + " index : "
                                           + annotation.index());
            }
        }
    }

}
