package com.training.java.abstracts;

public class BinaryPostData extends AbstractPostData {

    public BinaryPostData() {
        super("Binary footer");
    }

    @Override
    public Integer postPreDoc(String str) {
        System.out.println("Binary Pre doc " + str);
        return 1;
    }

    @Override
    public Integer postBody(String str) {
        System.out.println("Binary Body " + str);
        return 1;
    }

    @Override
    public String getBilgi() {
        return null;
    }

    public void method(){

    }
    public void method1(){

    }

}
