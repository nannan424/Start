package com.example.myapplication.factory3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool implements ThreadPoolInterface {
    private ExecutorService executorService;

    public CacheThreadPool() {
        executorService = Executors.newCachedThreadPool();
    }


    @Override
    public void executeTask(Runnable runnable) {
        if (executorService == null) {
            return;
        }
        executorService.execute(runnable);
    }




    @Override
    public void removeTask() {
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }
}