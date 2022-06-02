package com.training.java.lambdas;

@FunctionalInterface
public interface IFunction<R, P> {
    public static final String field2 = "osman";
    String field1 = "osman";

    R execute(P p);


    public static String test(String str) {
        return "OK";
    }

    default String getDescription(P p) {
        return "desc : " + execute(p);
    }

    default String getOtherDescription(P p) {
        return "other desc : " + execute(p);
    }
}
