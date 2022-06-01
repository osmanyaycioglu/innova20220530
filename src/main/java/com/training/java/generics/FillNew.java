package com.training.java.generics;

public class FillNew extends BaseCleaning implements IFill,IClean {
    @Override
    public String fill(String str) {
        return "Filled " + str;
    }

    @Override
    public String clean(String str) {
        return "cleaned new " + str;
    }
}
