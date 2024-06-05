package org.learning.pattern.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountBuilderTests {

    @Test
    void createMissingFirstLastNameAccount() {
        AccountBuilder accountBuilder = new AccountBuilder();
        assertThrows(IllegalArgumentException.class, accountBuilder::createAccount, "Exception expected for missing required field");
    }

    @Test
    void createMissingFirstNameAccount() {
        AccountBuilder accountBuilder = new AccountBuilder();
        accountBuilder.setLastName("Born");
        assertThrows(IllegalArgumentException.class, accountBuilder::createAccount, "Exception expected for missing required field");
    }

    @Test
    void createMissingLastNameAccount() {
        AccountBuilder accountBuilder = new AccountBuilder();
        accountBuilder.setFirstName("Jason");
        assertThrows(IllegalArgumentException.class, accountBuilder::createAccount, "Exception expected for missing required field");
    }

    @Test
    void createTwinsAccounts() {
        AccountBuilder accountBuilder = new AccountBuilder();
        //Common values
        String lastName = "Born";
        int age = 47;
        //Create mister account
        String misterName = "Jason";
        accountBuilder
                .setFirstName(misterName)
                .setLastName(lastName)
                .setAge(age)
                .setSex(Sex.M);
        Account misterAccount = accountBuilder.createAccount();
        assertEquals(misterName, misterAccount.getFirstName(), "Unexpected first name value");
        assertEquals(lastName, misterAccount.getLastName(), "Unexpected last name value");
        assertEquals(age, misterAccount.getAge(), "Unexpected age value");
        assertEquals(Sex.M, misterAccount.getSex(), "Unexpected sex value");

        //Create misses account: reuse builder to create a new account is an advantage of builder pattern
        String missesName = "Jasmina";
        accountBuilder
                .setFirstName(missesName)
                .setSex(Sex.F);
        Account missesAccount = accountBuilder.createAccount();
        assertEquals(missesName, missesAccount.getFirstName(), "Unexpected first name value");
        assertEquals(lastName, missesAccount.getLastName(), "Unexpected last name value");
        assertEquals(age, missesAccount.getAge(), "Unexpected age value");
        assertEquals(Sex.F, missesAccount.getSex(), "Unexpected sex value");

    }
}