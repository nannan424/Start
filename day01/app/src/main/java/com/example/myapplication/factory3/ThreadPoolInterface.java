package com.example.myapplication.factory3;

public interface ThreadPoolInterface {
    void executeTask(Runnable runnable);
    void removeTask();
}
