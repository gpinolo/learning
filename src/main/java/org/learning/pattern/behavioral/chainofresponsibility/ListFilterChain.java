package org.learning.pattern.behavioral.chainofresponsibility;


import java.util.List;
import java.util.function.Predicate;

public abstract class ListFilterChain {
    private ListFilterChain next;
    protected Predicate<? super Object> predicate;

    public void doListFilter(List<Object> list){
        listFilter(list);
        if(next!=null){
            next.doListFilter(list);
        }
    }

    private void listFilter(List<Object> list){
        list.removeIf(predicate);
    }

    public void setNext(ListFilterChain next) {
        this.next = next;
    }
}
