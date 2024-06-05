package org.learning.pattern.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreadSafeSingletonTests {

    @Test
    void getInstance() {
        String firstInstance = ThreadSafeSingleton.getInstance().objectStringRepresentation();
        String secondInstance = ThreadSafeSingleton.getInstance().objectStringRepresentation();
        assertEquals(firstInstance, secondInstance, "Unexpected different object for singleton");
    }
}