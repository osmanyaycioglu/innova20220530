package com.training.java.multithread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyThreadPoolThread extends Thread {

    private  BlockingQueue<Runnable>  runnables ;

    public MyThreadPoolThread(BlockingQueue<Runnable>  runnables){
        this.runnables = runnables;
    }

    @Override
    public void run() {
        while (true){
            try {
                Runnable take = runnables.take();
                take.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
