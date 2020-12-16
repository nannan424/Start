package com.example.myapplication.factory3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建线程池对象的工厂类
 */
public class ThreadPoolFactory {
    public static final int CACHE_THREADPOOL = 0;
    public static final int FIXED_THREADPOOL = 1;
    public static final int SINGLE_THREADPOOL = 2;
    public static final int SCHDULE_THREADPOOL = 3;

    public static ThreadPoolInterface getExcutor(int type) {
        switch (type) {
            case CACHE_THREADPOOL:
                return new CacheThreadPool();
            case FIXED_THREADPOOL:
                return new FixedThreadPool();
            case SINGLE_THREADPOOL:
                return new SingleThreadPool();
            case SCHDULE_THREADPOOL:
                return new SchduleTheadPool();
        }
        return null;
    }


}