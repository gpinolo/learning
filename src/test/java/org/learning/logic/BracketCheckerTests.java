package org.learning.logic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BracketCheckerTests {

    @Test
    void isValidOK() {
        assertTrue(BracketChecker.isValid("{([])}"), "Unexpected result");
    }

    @Test
    void isValidKO() {
        assertFalse(BracketChecker.isValid("{)(}"), "Unexpected result");
    }
}
