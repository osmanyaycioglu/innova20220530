package com.training.java.reflection.validation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

    @ValidateStr(min = 2, max = 30)
    private String        name;
    @ValidateStr(min = 2, max = 50)
    private String        surname;
    @ValidateStr(min = 8, max = 20)
    private String        username;
    @ValidateStr(min = 6, max = 15)
    private String        password;
    @ValidateList(max = Integer.MAX_VALUE)
    private List<Account> accountList;
    private boolean       active;


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

    public static Customer createCustomer(){
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


}
