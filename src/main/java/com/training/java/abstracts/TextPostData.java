package com.training.java.abstracts;

public class TextPostData implements IPostData {
    @Override
    public Integer postPreDoc(String str) {
        System.out.println("Text Pre doc " + str);
        return 1;
    }

    @Override
    public Integer postBody(String str) {
        System.out.println("Text Body " + str);
        return 1;
    }

    @Override
    public String getBilgi() {
        return null;
    }

}
