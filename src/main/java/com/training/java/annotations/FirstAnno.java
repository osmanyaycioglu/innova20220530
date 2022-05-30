package com.training.java.annotations;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FirstAnno {

    String[] name();

    int index() default 0;

}
