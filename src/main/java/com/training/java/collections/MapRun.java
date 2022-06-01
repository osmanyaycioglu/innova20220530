package com.training.java.collections;

import com.training.java.reflection.validation.Account;
import com.training.java.reflection.validation.Customer;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapRun {

    public static void main(String[] args) {
        Map<String, Customer> customerMapThreadSafe = new Hashtable<>();
        Map<String, Customer> customerMapThreadSafeNew = new ConcurrentHashMap<>(1_000_000,
                                                                                 0.9F,
                                                                                 1_000);
        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("osman",
                        Customer.createCustomer()
                                .setName("osman")
                                .setSurname("yaycıoğlu")
                                .setUsername("osmany349")
                                .setPassword("wesdjkfls1212")
                                .setActive(true)
                                .addAccount(Account.createAccount()
                                                   .setAmount(new BigDecimal(1_000))
                                                   .setName("EURO")));
        customerMap.put("osman",
                        Customer.createCustomer()
                                .setName("osman1")
                                .setSurname("yaycıoğlu")
                                .setUsername("osmany349")
                                .setPassword("wesdjkfls1212")
                                .setActive(true)
                                .addAccount(Account.createAccount()
                                                   .setAmount(new BigDecimal(1_000))
                                                   .setName("EURO")));
        Customer customer = customerMap.get("osman");
        System.out.println(customer);

        Map<String, Set<Customer>> nCustomerMap = new HashMap<>();
        Set<Customer> customerSet = new HashSet<>();
        nCustomerMap.put("osman",
                         customerSet);
        customerSet.add(Customer.createCustomer()
                                .setName("osman")
                                .setSurname("yaycıoğlu")
                                .setUsername("osmany349")
                                .setPassword("wesdjkfls1212")
                                .setActive(true)
                                .addAccount(Account.createAccount()
                                                   .setAmount(new BigDecimal(1_000))
                                                   .setName("EURO")));
        customerSet.add(Customer.createCustomer()
                                .setName("osman1")
                                .setSurname("yaycıoğlu")
                                .setUsername("osmany349")
                                .setPassword("wesdjkfls1212")
                                .setActive(true)
                                .addAccount(Account.createAccount()
                                                   .setAmount(new BigDecimal(1_000))
                                                   .setName("EURO")));

        Set<Customer> osmanCustomers = nCustomerMap.get("osman");

        Map<String, SetHolder<Customer>> nCustomerMap2 = new HashMap<>();
        nCustomerMap2.put("osman",
                          new SetHolder<Customer>().add(Customer.createCustomer()
                                                                .setName("osman")
                                                                .setSurname("yaycıoğlu")
                                                                .setUsername("osmany349")
                                                                .setPassword("wesdjkfls1212")
                                                                .setActive(true)
                                                                .addAccount(Account.createAccount()
                                                                                   .setAmount(new BigDecimal(1_000))
                                                                                   .setName("EURO")))
                                                   .add(Customer.createCustomer()
                                                                .setName("osman1")
                                                                .setSurname("yaycıoğlu")
                                                                .setUsername("osmany349")
                                                                .setPassword("wesdjkfls1212")
                                                                .setActive(true)
                                                                .addAccount(Account.createAccount()
                                                                                   .setAmount(new BigDecimal(1_000))
                                                                                   .setName("EURO"))));

        SetHolder<Customer> osmanSH = nCustomerMap2.get("osman");
        if (osmanSH == null) {
            osmanSH = new SetHolder<>();
            nCustomerMap2.put("osman",
                              osmanSH);
        }
        osmanSH.add(Customer.createCustomer()
                            .setName("osman2")
                            .setSurname("yaycıoğlu")
                            .setUsername("osmany349")
                            .setPassword("wesdjkfls1212")
                            .setActive(true)
                            .addAccount(Account.createAccount()
                                               .setAmount(new BigDecimal(1_000))
                                               .setName("EURO")));

        SetHolder<Customer> osmanSet = nCustomerMap2.get("osman");
        for (Customer c : osmanSet) {
            System.out.println(c);
        }

        MapHolder<Customer> customerMapHolder = new MapHolder<>();
        customerMapHolder.add("osman",
                              Customer.createCustomer()
                                      .setName("osman")
                                      .setSurname("yaycıoğlu")
                                      .setUsername("osmany349")
                                      .setPassword("wesdjkfls1212")
                                      .setActive(true)
                                      .addAccount(Account.createAccount()
                                                         .setAmount(new BigDecimal(1_000))
                                                         .setName("EURO")))
                         .add(Customer.createCustomer()
                                      .setName("osman1")
                                      .setSurname("yaycıoğlu")
                                      .setUsername("osmany349")
                                      .setPassword("wesdjkfls1212")
                                      .setActive(true)
                                      .addAccount(Account.createAccount()
                                                         .setAmount(new BigDecimal(1_000))
                                                         .setName("EURO")))
                         .add(Customer.createCustomer()
                                      .setName("osman2")
                                      .setSurname("yaycıoğlu")
                                      .setUsername("osmany349")
                                      .setPassword("wesdjkfls1212")
                                      .setActive(true)
                                      .addAccount(Account.createAccount()
                                                         .setAmount(new BigDecimal(1_000))
                                                         .setName("EURO")))

        ;
    }

}
