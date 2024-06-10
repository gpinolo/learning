package org.learning.pattern.structural.proxy;

/**
 * A proxy is a class that manage another class with same interface, in this case ExpensiveObjectImpl
 */
public class ExpensiveObjectProxy implements ExpensiveObject {

    private ExpensiveObject proxiedObject;

    @Override
    public void process() {
        if(proxiedObject == null){
            proxiedObject = new ExpensiveObjectImpl();
        }
        proxiedObject.process();
    }
}
