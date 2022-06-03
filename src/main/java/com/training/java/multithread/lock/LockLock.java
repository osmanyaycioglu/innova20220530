package com.training.java.multithread.lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockLock {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        try {
            reentrantLock.lock();
            reentrantLock.lockInterruptibly();
            System.out.println("");
        } catch (InterruptedException exp){

        } catch (Exception exp){

        } finally {
            reentrantLock.unlock();
        }

        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        readWriteLock.readLock().lock(); // Parallel
        readWriteLock.writeLock().lock(); // Single Thread


    }
}
