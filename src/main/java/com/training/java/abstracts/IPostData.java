package com.training.java.abstracts;

public interface IPostData {

    Integer postPreDoc(String str);

    Integer postBody(String str);

    String getBilgi();

    default Integer postFooter(String str) {
        System.out.println(getBilgi() + " "  + str);
        return 1;
    }

}
