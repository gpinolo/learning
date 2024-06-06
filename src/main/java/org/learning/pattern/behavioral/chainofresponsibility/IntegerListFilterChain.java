package org.learning.pattern.behavioral.chainofresponsibility;


public class IntegerListFilterChain extends ListFilterChain {

    public IntegerListFilterChain() {
        this.predicate = Integer.class::isInstance;
    }
}
