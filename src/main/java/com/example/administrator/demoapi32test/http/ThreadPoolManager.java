package com.example.administrator.demoapi32test.http;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 整体的处理中心
 */
public class ThreadPoolManager {
    //单例
    public static final ThreadPoolManager instance = new ThreadPoolManager();


    public static ThreadPoolManager getInstance() {
        return instance;
    }

    //1.把调用层传入的HTTPTASK放到一个请求队列中
    // 容量应该是无限大的，插入动作很多，阻塞的功能
    private LinkedBlockingDeque<Runnable> queue = new LinkedBlockingDeque<>();

    public void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                queue.put(runnable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //2.把队列中的人物放到线程池进行执行
    private ThreadPoolExecutor threadPoolExecutor;

    private ThreadPoolManager() {
        threadPoolExecutor = new ThreadPoolExecutor(4, 20, 15, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(4), rejectedExecutionHandler);
        threadPoolExecutor.execute(runnable);
    }

    private RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            //Runnable r 被丢出来的任务
            try {
                queue.put(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    //3.让1和2无限运行下去
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            while (true) {
                Runnable httptask = null;
                try {
                    httptask = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (httptask != null) {
                    threadPoolExecutor.execute(httptask);
                }
            }
        }
    };
}
