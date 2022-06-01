package com.training.java.collections;

import com.training.java.reflection.validation.Customer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

public class QueueRun {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("osman1");
        stringQueue.add("osman2");
        stringQueue.add("osman3");
        stringQueue.add("osman4");
        String polled = stringQueue.poll();
        if (polled == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Poll : " + polled);
        System.out.println("-----------");
        System.out.println("Queue : " + stringQueue);

        BlockingQueue<String> stringBlockingQueue = new ArrayBlockingQueue<>(1_000);
        try {
            // String take = stringBlockingQueue.take();
            String poll = stringBlockingQueue.poll(2,
                                                   TimeUnit.SECONDS);
            System.out.println("Çalıştım");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Deque<String> stringsDequeu = new LinkedBlockingDeque<>();
        stringsDequeu.addFirst("osman1");
        stringsDequeu.addFirst("osman2");
        String s = stringsDequeu.pollLast();

        BlockingDeque<String> stringsBlockingDequeu = new LinkedBlockingDeque<>();

        PriorityQueue<Customer> stringsPriority = new PriorityQueue<>();
        DelayQueue<Customer> strings = new DelayQueue<>();
        strings.add(new Customer());

    }
}
