package com.training.java.generics;

import com.training.java.reflection.validation.Account;
import com.training.java.reflection.validation.Customer;

import java.math.BigDecimal;

public class GernericRun {
    public static void main(String[] args) {
        ValueInteger valueInteger = new ValueInteger();
        valueInteger.setValue(100);
        System.out.println(valueInteger.getValue());
        ValueString valueString = new ValueString();
        valueString.setValue("osman");
        System.out.println(valueString.getValue());

        ValueObject valueObject = new ValueObject();
        valueObject.setValue(100);
        Object value = valueObject.getValue();
        if (value instanceof Integer){
            Integer integer = (Integer) value;
            System.out.println(integer);
        } else if (value instanceof Customer){
            Customer cust = (Customer) value;
            System.out.println(cust);
        }

        ValueGeneric<String> strVal = new ValueGeneric<>();
        strVal.setValue("mehmet");
        String value1 = strVal.getValue();
        ValueGeneric<Integer> intVal = new ValueGeneric<>();
        intVal.setValue(100);
        Integer value2 = intVal.getValue();
        ValueGeneric<Long> longVal = new ValueGeneric<>();
        longVal.setValue(300L);
        Long value3 = longVal.getValue();
        ValueGeneric<Customer> customerVal = new ValueGeneric<>();

        MyVal<Long,String,Long> val = new MyVal<>();
    }
}
