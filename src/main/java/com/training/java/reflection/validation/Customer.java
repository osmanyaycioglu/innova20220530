package com.training.java.reflection.validation;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Customer implements Delayed {

    @ValidateStr(min = 2, max = 30)
    private String name;
    @ValidateStr(min = 2, max = 50)
    private String surname;
    @ValidateStr(min = 8, max = 20)
    private String username;
    @ValidateStr(min = 6, max = 15)
    private String password;
    @ValidateList(max = Integer.MAX_VALUE)
    private List<Account> accountList;
    private boolean active;


    public Customer() {
    }


    public Customer(final String nameParam,
                    final String surnameParam,
                    final String usernameParam,
                    final String passwordParam,
                    final List<Account> accountListParam,
                    final boolean activeParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.username = usernameParam;
        this.password = passwordParam;
        this.accountList = accountListParam;
        this.active = activeParam;
    }

    public static Customer createCustomer() {
        return new Customer();
    }

    public String getName() {
        return this.name;
    }

    public Customer setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Customer setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public Customer setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public Customer setPassword(final String passwordParam) {
        this.password = passwordParam;
        return this;
    }

    public List<Account> getAccountList() {
        return this.accountList;
    }

    public Iterator<Account> getAccountListIterator() {
        return this.accountList.iterator();
    }

    public Customer addAccount(final Account accountParam) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        this.accountList.add(accountParam);
        return this;
    }

    public boolean isActive() {
        return this.active;
    }

    public Customer setActive(final boolean activeParam) {
        this.active = activeParam;
        return this;
    }


    @Override
    public String toString() {
        return "Customer [name="
                + this.name
                + ", surname="
                + this.surname
                + ", username="
                + this.username
                + ", password="
                + this.password
                + ", accountList="
                + this.accountList
                + ", active="
                + this.active
                + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return active == customer.active && name.equals(customer.name) && surname.equals(customer.surname)
                && username.equals(customer.username) && password.equals(customer.password)
                && accountList.equals(customer.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                            surname,
                            username,
                            password,
                            accountList,
                            active);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(Duration.ofSeconds(1));

    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
