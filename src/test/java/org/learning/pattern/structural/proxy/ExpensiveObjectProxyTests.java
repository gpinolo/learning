package org.learning.pattern.structural.proxy;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpensiveObjectProxyTests {

    @Test
    void process() {
        StopWatch stopWatch = new StopWatch();

        //Real Object instantiation
        stopWatch.start();
        ExpensiveObject expensiveObjectImpl = new ExpensiveObjectImpl();
        stopWatch.stop();
        long instantiationElapsedTime = stopWatch.getTime();

        //Proxy Object instantiation
        stopWatch.reset();
        stopWatch.start();
        ExpensiveObject expensiveObjectProxy = new ExpensiveObjectProxy();
        stopWatch.stop();
        long proxyInstantiationElapsedTime = stopWatch.getTime();

        //The real object instantiation would be more expensive than proxied one because proxy delays instantiation when the real object will be used
        assertTrue(instantiationElapsedTime > proxyInstantiationElapsedTime, "initialization time of proxy greater than real object!");

        //Real object process invocation
        stopWatch.reset();
        stopWatch.start();
        expensiveObjectImpl.process();
        stopWatch.stop();
        long processElapsedTime = stopWatch.getTime();

        //Proxy object process invocation
        stopWatch.reset();
        stopWatch.start();
        expensiveObjectProxy.process();
        stopWatch.stop();
        long proxyProcessElapsedTime = stopWatch.getTime();

        //The real process elapsed time would be less than proxied one due to the second need to instantiate the object before to proceed
        assertTrue(processElapsedTime < proxyProcessElapsedTime, "process time of real object greater than proxy!");

    }
}
