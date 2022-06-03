package com.training.java.multithread;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    public long counter = 0;
    private CountDownLatch countDownLatch;

    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public synchronized void increase() {
        counter++;
    }

    @Override
    public void run() {
        for (long i = 0; i < 1_000_000_000L; i++) {
            increase();
        }
        countDownLatch.countDown();
    }
    public long getCounter() {
        return counter;
    }

}
