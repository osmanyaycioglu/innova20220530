package com.training.java.abstracts;

public abstract class AbstractPostData implements IPostData {
    protected String footer;

    public AbstractPostData(String footer) {
        this.footer = footer;
    }


    @Override
    public Integer postFooter(String str) {
        System.out.println(footer + " " + str);
        return 1;
    }

}
