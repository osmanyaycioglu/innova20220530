package com.training.java.multithread;

public class MyOtherThread extends Thread {

    private boolean shutDown = false;

    @Override
    public void run() {
        while (!shutDown) {
            try {
                if(this.isInterrupted()){
                    shutDown = true;
                    continue;
                }
                System.out.println("xyz");
            } catch (Throwable exp){
                exp.printStackTrace();
            }
        }
        System.out.println("Thread exit");
    }
}
