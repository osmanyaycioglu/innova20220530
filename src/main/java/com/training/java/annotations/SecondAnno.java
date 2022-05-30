package com.training.java.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SecondAnno {
    String value();
    long time() default 100L;
}
