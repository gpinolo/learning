package org.learning.logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.learning.logic.ListUtils.*;
import static org.learning.logic.ListUtils.isListOrderedStreamVersion;

class ListUtilsTests {

    /**
     * {@link ListUtils#isListOrdered(List)} tests
     */

    @Test
    void isEmptyListOrdered() {
        assertTrue(isListOrdered(Collections.emptyList()), "Empty list is ordered by api specification");
    }

    @Test
    void isNullListOrdered() {
        assertTrue(isListOrdered(null), "Null list is ordered by api specification");
    }

    @Test
    void isOneElementListListOrdered() {
        assertTrue(isListOrdered(List.of(2)), "Null list is ordered by api specification");
    }

    @Test
    void isOrderedElementListOrdered() {
        assertTrue(isListOrdered(List.of(2, 4, 7, 10)), "Unexpected return for ordered element list");
    }

    @Test
    void isOrderedWithNullElementListOrdered() {
        assertTrue(isListOrdered(Arrays.asList(2, null, 4, 7, 10)), "Unexpected return for ordered with null element list");
    }

    @Test
    void isUnorderedElementListOrdered() {
        assertFalse(isListOrdered(Arrays.asList(2, null, 34, 7, 10)), "Unexpected return for unordered element list");
    }

    /**
     * {@link ListUtils#isListOrderedStreamVersion(List)} tests
     */

    @Test
    void isEmptyListOrderedStreamVersion() {
        assertTrue(isListOrderedStreamVersion(Collections.emptyList()), "Empt y list is ordered by api specification");
    }

    @Test
    void isNullListOrderedStreamVersion() {
        assertTrue(isListOrderedStreamVersion(null), "Null list is ordered by api specification");
    }

    @Test
    void isOneElementListListOrderedStreamVersion() {
        assertTrue(isListOrderedStreamVersion(List.of(2)), "Null list is ordered by api specification");
    }

    @Test
    void isOrderedElementListOrderedStreamVersion() {
        assertTrue(isListOrderedStreamVersion(List.of(2, 4, 7, 10)), "Unexpected return for ordered element list");
    }

    @Test
    void isOrderedWithNullElementListOrderedStreamVersion() {
        assertTrue(isListOrderedStreamVersion(Arrays.asList(2, null, 4, 7, 10)), "Unexpected return for ordered with null element list");
    }

    @Test
    void isUnorderedElementListOrderedStreamVersion() {
        assertFalse(isListOrderedStreamVersion(Arrays.asList(2, null, 34, 7, 10)), "Unexpected return for unordered element list");
    }

    /**
     * {@link ListUtils#sortListJDKVersion(List)} tests
     */
    @Test
    void sortUnorderedListJDKVersion(){
        List<Integer> list = Arrays.asList(5, 1, 6);
        sortListJDKVersion(list);
        assertTrue(isListOrderedStreamVersion(list));
    }
}