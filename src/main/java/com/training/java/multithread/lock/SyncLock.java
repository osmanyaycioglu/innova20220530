package com.training.java.multithread.lock;

import java.util.concurrent.atomic.AtomicLong;

public class SyncLock {

    public static long counter = 0;
    public long localCounter = 0;
    public final Object localObject = new Object();
    public static AtomicLong atomicLong = new AtomicLong(0);

    public static synchronized void doSomething() {
        counter++;
    }

    public static void doSomething2() {
        synchronized (SyncLock.class) {
            counter++;
        }
    }

    public synchronized void doSomethingLocal() {
        counter++;
    }

    public void doSomethingLocal2() {
        synchronized (this) {
            counter++;
        }
    }

    public void doSomethingLocal3() {
        synchronized (localObject) {
            counter++;
        }
    }

    public void increase() {
        atomicLong.incrementAndGet();
    }

}
