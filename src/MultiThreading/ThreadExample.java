package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample implements Runnable{
    public static ThreadLocal<Integer> threadExampleThreadLocal = ThreadLocal.withInitial(() -> 4);

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();


//        Thread t1 = new Thread(threadExample,"thread 1 ");
//        Thread t2 = new Thread(threadExample,"thread 2 ");
//
//
//        t1.start();
//        t2.start();

        int corecount = Runtime.getRuntime().availableProcessors();
        System.out.println("core count " + corecount);

        ExecutorService executorService = Executors.newFixedThreadPool(corecount);

    }

    @Override
    public void run() {
        System.out.println("multi threading " + Thread.currentThread().getName() + " " + (ThreadExample.threadExampleThreadLocal.get() + 1));
    }
}
