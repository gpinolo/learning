package org.learning.pattern.behavioral.chainofresponsibility;

public class StringListFilterChain extends ListFilterChain {

    public StringListFilterChain() {
        this.predicate = String.class::isInstance;
    }
}
