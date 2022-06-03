package com.training.java.multithread.lock;

import java.util.concurrent.Semaphore;

public class SemaphoreLock {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        try {
            semaphore.acquire();
            System.out.println("after acquire");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
