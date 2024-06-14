package org.learning.logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.learning.logic.ListUtils.*;
import static org.learning.logic.ListUtils.isListAscendingOrderStreamVersion;

class ListUtilsTests {

    /**
     * {@link ListUtils#isListAscendingOrder(List)} tests
     */

    @Test
    void isEmptyListAscendingOrdered() {
        assertTrue(isListAscendingOrder(Collections.emptyList()), "Empty list is ordered by api specification");
    }

    @Test
    void isNullListAscendingOrdered() {
        assertTrue(isListAscendingOrder(null), "Null list is ordered by api specification");
    }

    @Test
    void isOneElementListListAscendingOrdered() {
        assertTrue(isListAscendingOrder(List.of(2)), "Null list is ordered by api specification");
    }

    @Test
    void isOrderedElementListAscendingOrdered() {
        assertTrue(isListAscendingOrder(List.of(2, 4, 7, 10)), "Unexpected return for ordered element list");
    }

    @Test
    void isOrderedWithNullElementListAscendingOrdered() {
        assertTrue(isListAscendingOrder(Arrays.asList(2, null, 4, 7, 10)), "Unexpected return for ordered with null element list");
    }

    @Test
    void isUnorderedElementListAscendingOrdered() {
        assertFalse(isListAscendingOrder(Arrays.asList(2, null, 34, 7, 10)), "Unexpected return for unordered element list");
    }

    /**
     * {@link ListUtils#isListAscendingOrderStreamVersion(List)} tests
     */

    @Test
    void isEmptyListAscendingOrderedStreamVersion() {
        assertTrue(isListAscendingOrderStreamVersion(Collections.emptyList()), "Empt y list is ordered by api specification");
    }

    @Test
    void isNullListAscendingOrderedStreamVersion() {
        assertTrue(isListAscendingOrderStreamVersion(null), "Null list is ordered by api specification");
    }

    @Test
    void isOneElementListListAscendingOrderedStreamVersion() {
        assertTrue(isListAscendingOrderStreamVersion(List.of(2)), "Null list is ordered by api specification");
    }

    @Test
    void isOrderedElementListAscendingOrderedStreamVersion() {
        assertTrue(isListAscendingOrderStreamVersion(List.of(2, 4, 7, 10)), "Unexpected return for ordered element list");
    }

    @Test
    void isOrderedWithNullElementListAscendingOrderedStreamVersion() {
        assertTrue(isListAscendingOrderStreamVersion(Arrays.asList(2, null, 4, 7, 10)), "Unexpected return for ordered with null element list");
    }

    @Test
    void isUnorderedElementListAscendingOrderedStreamVersion() {
        assertFalse(isListAscendingOrderStreamVersion(Arrays.asList(2, null, 34, 7, 10)), "Unexpected return for unordered element list");
    }

    /**
     * {@link ListUtils#isListOrderedStreamVersion(List)} (List)} tests
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
        assertTrue(isListOrderedStreamVersion(Arrays.asList(10, null, 8, 6, 4)), "Unexpected return for ordered with null element list");
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
        assertTrue(isListAscendingOrderStreamVersion(list));
    }
}
