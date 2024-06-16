package org.learning.logic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BracketCheckerTests {

    @Test
    void isValid() {
        assertTrue(BracketChecker.isValid("{([])}"), "Unexpected result");
    }

    @Test
    void isNotValidMissingClose() {
        assertFalse(BracketChecker.isValid("("), "Unexpected result");
    }

    @Test
    void isNotValidMissingOpen() {
        assertFalse(BracketChecker.isValid(")"), "Unexpected result");
    }

    @Test
    void isNotValidUnorderedToManyClose() {
        assertFalse(BracketChecker.isValid("())"), "Unexpected result");
    }

    @Test
    void isNotValidUnorderedToManyOpen() {
        assertFalse(BracketChecker.isValid("(()"), "Unexpected result");
    }

    @Test
    void isNotValidUnorderedSequence() {
        assertFalse(BracketChecker.isValid("{)(}"), "Unexpected result");
    }
}
