package org.learning.pattern.behavioral.chainofresponsibility;

public class BooleanFilterChain extends ListFilterChain {

    public BooleanFilterChain() {
        this.predicate = Boolean.class::isInstance;
    }
}
