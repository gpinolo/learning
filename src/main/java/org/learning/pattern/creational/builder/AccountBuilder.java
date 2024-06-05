package org.learning.pattern.creational.builder;

public class AccountBuilder {
    private String firstName;
    private String lastName;
    private Sex sex;
    private int age;

    public AccountBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AccountBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AccountBuilder setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public AccountBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Account createAccount() {
        //Validate object creation in builder instead object class itself
        if(firstName==null){
            throw new IllegalArgumentException("First name is mandatory");
        }

        if(lastName==null){
            throw new IllegalArgumentException("Last name is mandatory");
        }
        return new Account(firstName, lastName, sex, age);
    }
}