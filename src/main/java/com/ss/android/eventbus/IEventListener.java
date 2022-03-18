package com.ss.android.eventbus;

import com.ss.android.eventbus.BaseEvent;

public interface IEventListener<T extends BaseEvent> {
    void onEvent(T t) throws Exception;
}
