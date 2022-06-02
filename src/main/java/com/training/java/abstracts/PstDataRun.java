package com.training.java.abstracts;

public class PstDataRun {
    public static void main(String[] args) {
        IPostData postData = new BinaryPostData();
        postData.postPreDoc("osman");
        postData.postBody("Document body");
        postData.postFooter("Document footer");



    }
}
