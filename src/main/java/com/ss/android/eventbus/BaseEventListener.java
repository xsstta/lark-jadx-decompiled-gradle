package com.ss.android.eventbus;

import com.ss.android.eventbus.BaseEvent;

public class BaseEventListener<T extends BaseEvent> implements IEventListener<T> {
    private volatile boolean isDestory;

    @Override // com.ss.android.eventbus.IEventListener
    public void onEvent(T t) {
    }

    public boolean isDestory() {
        return this.isDestory;
    }

    public void setDestory(boolean z) {
        this.isDestory = z;
    }
}
