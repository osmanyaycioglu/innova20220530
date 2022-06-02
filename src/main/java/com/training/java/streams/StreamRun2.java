package com.training.java.streams;

import com.training.java.reflection.validation.Customer;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRun2 {
    public static void main(String[] args) {
        List<Customer> customerList = List.of(Customer.createCustomer()
                                                      .setName("osman")
                                                      .setSurname("yay"),
                                              Customer.createCustomer()
                                                      .setName("ali")
                                                      .setSurname("ulas"),
                                              Customer.createCustomer()
                                                      .setName("veli")
                                                      .setSurname("bekle"),
                                              Customer.createCustomer()
                                                      .setName("ahmet")
                                                      .setSurname("ulas"),
                                              Customer.createCustomer()
                                                      .setName("mehmet")
                                                      .setSurname("ulas"),
                                              Customer.createCustomer()
                                                      .setName("osman")
                                                      .setSurname("yay"),
                                              Customer.createCustomer()
                                                      .setName("kevser")
                                                      .setSurname("yay"),
                                              Customer.createCustomer()
                                                      .setName("ayşe")
                                                      .setSurname("yay")
        );
        customerList.stream()
                    .distinct()
                    .filter(c -> c.getName()
                                  .length() >= 4)
                    .forEach(c -> System.out.println("Name : " + c.getName() + " " + " surname : " + c.getSurname()));

        customerList.stream()
                    .distinct()
                    .filter(c -> c.getName()
                                  .length() >= 4)
                    .map(c -> c.getName() + " " + c.getSurname())
                    .map(s -> {
                        Person person = new Person();
                        person.setName(s);
                        return person;
                    })
                    .filter(p -> p.getName().length() > 12)
                    .forEach(System.out::println);

        int charCount = customerList.stream()
                                    .distinct()
                                    .filter(c -> c.getName()
                                                  .length() >= 4)
                                    .mapToInt(c -> c.getName()
                                                    .length())
                                    .sum();

    }
}
