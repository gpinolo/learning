package org.learning.pattern.behavioral.chainofresponsibility;

public class StringFilterChain extends ListFilterChain {

    public StringFilterChain() {
        this.predicate = String.class::isInstance;
    }
}
