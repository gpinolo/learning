package org.learning.pattern.structural.proxy;

import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject {

    private static final Logger LOGGER = Logger.getLogger(ExpensiveObjectImpl.class.getName());

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        LOGGER.info("Process completed");
    }

    private void heavyInitialConfiguration() {
        LOGGER.info("Loading heavy configuration...");
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
