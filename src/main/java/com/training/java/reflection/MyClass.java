package com.training.java.reflection;

import com.training.java.annotations.FirstAnno;

public class MyClass {

    @FirstAnno(name = "test2", index = 20)
    private String name;
    private String surname;
    private int age;


    public String hello() {
        return "Hello " + name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
