package org.learning.solid.liskovsubstitution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LiskovSubstitutionTests {

    /**
     * the following test shows a scenario where java clash with Liskov substitution
     * <a href="https://stackoverflow.com/questions/39311896/is-arrays-aslist-a-violation-of-liskov-substitution-principle">...</a>
     * This article explain that this behaviour is correct because the {@link java.util.AbstractList#add(Object)}
     * is documented as an optional operation
     */
    @Test
    void isArraysAslistAViolationOfLiskovSubstitutionPrinciple(){
        List<String> list = Arrays.asList("Uno", "Due");
        assertThrows(UnsupportedOperationException.class, () -> list.add("Tre"), "Expected exception");
    }

}