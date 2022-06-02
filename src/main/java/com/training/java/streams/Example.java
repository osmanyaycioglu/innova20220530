package com.training.java.streams;

import com.training.java.reflection.validation.Account;
import com.training.java.reflection.validation.Customer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Customer> customerList = List.of(Customer.createCustomer()
                                                      .setName("orhan")
                                                      .setSurname("yay"),
                                              Customer.createCustomer()
                                                      .setName("osman")
                                                      .setSurname("yay")
                                                      .addAccount(Account.createAccount()
                                                                         .setName("TL")
                                                                         .setAmount(new BigDecimal(100)))
                                                      .addAccount(Account.createAccount()
                                                                         .setName("DOLAR")
                                                                         .setAmount(new BigDecimal(300))),
                                              Customer.createCustomer()
                                                      .setName("ali")
                                                      .setSurname("ulas")
                                                      .addAccount(Account.createAccount()
                                                                         .setName("TL")
                                                                         .setAmount(new BigDecimal(100)))
                                                      .addAccount(Account.createAccount()
                                                                         .setName("DOLAR")
                                                                         .setAmount(new BigDecimal(500))),
                                              Customer.createCustomer()
                                                      .setName("veli")
                                                      .setSurname("bekle")
                                                      .addAccount(Account.createAccount()
                                                                         .setName("TL")
                                                                         .setAmount(new BigDecimal(800)))
                                                      .addAccount(Account.createAccount()
                                                                         .setName("DOLAR")
                                                                         .setAmount(new BigDecimal(600)))

        );
        customerList.stream()
                    .filter(c -> c.getAccountList()
                                  .stream()
                                  .filter(a -> a.getName()
                                                .equals("DOLAR"))
                                  .anyMatch(a -> a.getAmount()
                                                  .longValue() > 400L)
                    )
                    .forEach(System.out::println);
        System.out.println("----------------------");
        List<Customer> noneAccountList = customerList.stream()
                                                     .filter(c -> c.getAccountList() == null)
                                                     .collect(Collectors.toList());
        Map<String, Customer> map = new HashMap<>();
        customerList.stream()
                    .filter(c -> c.getAccountList() == null)
                    .forEach(c -> map.put(c.getName() + c.getSurname(),
                                          c));

    }
}
