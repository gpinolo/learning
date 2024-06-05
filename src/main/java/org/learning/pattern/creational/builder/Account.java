package org.learning.pattern.creational.builder;

public class Account {

    private final String firstName;
    private final String lastName;
    private final Sex sex;
    private final int age;

    public Account(String firstName, String lastName, Sex sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
