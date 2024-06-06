package org.learning.pattern.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListFilterChainTests {

    @Test
    void enrichMessage() {
        ListFilterChain listFilterChain = createListFilterChain();
        double doubleValue = 1.9;
        List<Object> list = new ArrayList<>(Arrays.asList(true, 1, "ciao", doubleValue));
        listFilterChain.doListFilter(list);
        assertEquals(1, list.size(), "Unexpected list size");
        assertEquals(doubleValue, list.get(0), "Unexpected list content");
    }

    private ListFilterChain createListFilterChain() {
        ListFilterChain integerListFilterChain = new IntegerListFilterChain();

        ListFilterChain stringListFilterChain = new StringListFilterChain();
        integerListFilterChain.setNext(stringListFilterChain);

        ListFilterChain booleanListFilterChain = new BooleanListFilterChain();
        stringListFilterChain.setNext(booleanListFilterChain);

        return integerListFilterChain;
    }
}