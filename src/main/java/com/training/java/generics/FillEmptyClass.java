package com.training.java.generics;

public class FillEmptyClass<T extends BaseCleaning & IFill & IClean> {

    String fillMe(T t,
                  String str) {
        return t.fill(str);
    }

    String cleanMe(T t,
                  String str) {
        t.cleanInfo();
        return t.clean(str);
    }

}
