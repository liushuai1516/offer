package com.sliu.offer.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author: sliu
 * @date: 2020/4/12 0012 19:54
 **/
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Tread1 tread1 = new Tread1();
        tread1.join();
        tread1.start();
        System.out.println("main");
        System.out.println("main");
        Lock lock = new ReentrantLock();
    }

    static class Tread1 extends Thread {

        @Override
        public void run() {
            System.out.println("runnable");
        }
    }
}
