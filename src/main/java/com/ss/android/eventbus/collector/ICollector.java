package com.ss.android.eventbus.collector;

public interface ICollector {
    void register(Object obj);

    void unRegister(Object obj);
}
