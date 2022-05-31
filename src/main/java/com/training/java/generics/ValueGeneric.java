package com.training.java.generics;

public class ValueGeneric<Y> {
    private Y value;

    public Y getValue() {
        return value;
    }

    public void setValue(Y value) {
        this.value = value;
    }
}
