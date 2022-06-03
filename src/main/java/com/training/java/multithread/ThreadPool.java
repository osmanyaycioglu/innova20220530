package com.training.java.multithread;

import com.training.java.multithread.threadpool.MyThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);
        MyCode myCode = new MyCode();
        executor.execute(myCode);

        MyThreadPool myThreadPool = new MyThreadPool(10);
        myThreadPool.exec(myCode);

    }

    public static class MyCode implements Runnable {
        @Override
        public void run() {
            System.out.println("My task");
        }
    }
}
