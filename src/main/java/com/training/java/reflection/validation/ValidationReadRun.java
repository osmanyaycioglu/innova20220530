package com.training.java.reflection.validation;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ValidationReadRun {

    public static void main(final String[] args) {
        ValidationEngine validationEngine = new ValidationEngine();
        Customer customer = Customer.createCustomer()
                                    .setName("osman")
                                    .setSurname("yaycıoğlu")
                                    .setUsername("osmany349")
                                    .setPassword("wesdjkfls1212")
                                    .setActive(true)
                                    .addAccount(Account.createAccount()
                                                       .setAmount(new BigDecimal(1_000))
                                                       .setName("TL"))
                                    .addAccount(Account.createAccount()
                                                       .setAmount(new BigDecimal(1_000))
                                                       .setName("USD"))
                                    .addAccount(Account.createAccount()
                                                       .setAmount(new BigDecimal(1_000))
                                                       .setName("EURO"));
        ValidateResult validate = validationEngine.validate(customer);
        System.out.println(validate.toString());

    }
}
