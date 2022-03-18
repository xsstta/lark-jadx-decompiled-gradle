package com.bytedance.bae.base;

import java.util.concurrent.atomic.AtomicInteger;

class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    @Override // com.bytedance.bae.base.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }

    @Override // com.bytedance.bae.base.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() == 0 && (runnable = this.releaseCallback) != null) {
            runnable.run();
        }
    }

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
