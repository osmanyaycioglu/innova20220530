package com.training.java.multithread;

import java.util.concurrent.CountDownLatch;

public class ThreadRun {

    // 1 sn 1000 mili 1.000.000 micro 1.000.000.000 nano
    // 2gz 0.5 nano 2 clock 1 makina kodu 1 nanosa
    // 1 core 1 sn 1.000.000.000 makina kodu çalıştırabilir
    // 8 core 1 sn 8.000.000.000 makina kodu çalıştırabilir
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        long delta = System.currentTimeMillis();
        MyThread[] myThread = new MyThread[5];
        for (int i = 0; i < 5; i++) {
            myThread[i] = new MyThread(countDownLatch);
            myThread[i].setName("My_Thread_" + i);
            myThread[i].start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long count = 0;
        for (int i = 0; i < 5; i++) {
            count += myThread[i].getCounter();
        }
        System.out.println("Counter : " + count + " Delta : " + (System.currentTimeMillis() -delta));
    }
}
