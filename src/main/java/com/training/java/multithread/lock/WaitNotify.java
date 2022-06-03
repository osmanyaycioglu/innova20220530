package com.training.java.multithread.lock;

public class WaitNotify {
    private Object object = new Object();

    public void waiting() {
        synchronized (object) {
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void notifyLock() {
        synchronized (object) {
            object.notifyAll();
        }
    }

}
