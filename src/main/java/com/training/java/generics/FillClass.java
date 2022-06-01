package com.training.java.generics;

public class FillClass extends BaseCleaning implements IFill,IClean {
    @Override
    public String fill(String str) {
        return "Filled " + str;
    }

    @Override
    public String clean(String str) {
        return "cleaned " + str;
    }
}
