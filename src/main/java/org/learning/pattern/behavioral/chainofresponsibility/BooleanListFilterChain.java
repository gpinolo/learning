package org.learning.pattern.behavioral.chainofresponsibility;

public class BooleanListFilterChain extends ListFilterChain {

    public BooleanListFilterChain() {
        this.predicate = Boolean.class::isInstance;
    }
}
