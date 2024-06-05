package org.learning.pattern.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    /**
     * @deprecated Double-checked locking should not be used @see <a href="https://rules.sonarsource.com/java/tag/multi-threading/RSPEC-2168/">Sonar Rule</a>
     * @return instance of current class
     */
    @Deprecated(since = "demo")
    public static ThreadSafeSingleton getInstanceJavaS2168BlockerIssue() {
        if (threadSafeSingleton == null) {
            synchronized (ThreadSafeSingleton.class){
                if (threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }

    public String objectStringRepresentation(){
        return threadSafeSingleton.toString();
    }
}
