package com.training.java.lambdas;

public class ExecuteImpl implements IExecute {
    @Override
    public String excute(String str,
                         Integer iVal) {
        return iVal + ".index result : " + str;
    }
}
