package com.training.java.multithread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyThreadPool {

    private final BlockingQueue<Runnable>  runnables = new ArrayBlockingQueue<>(1000);
    private final MyThreadPoolThread[] myThreadPoolThreads;
    private int threadCount;

    public MyThreadPool(int threadCount) {
        this.threadCount = threadCount;
        myThreadPoolThreads = new MyThreadPoolThread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            myThreadPoolThreads[i] = new MyThreadPoolThread(runnables);
            myThreadPoolThreads[i].start();
        }
    }

    public void exec(Runnable runnable){
        runnables.add(runnable);
    }
}
