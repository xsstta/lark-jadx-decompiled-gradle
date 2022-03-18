package com.ss.video.rtc.engine.mediaio;

import java.util.concurrent.atomic.AtomicInteger;

public class RefObject {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public boolean hasReleaseCallback() {
        if (this.releaseCallback != null) {
            return true;
        }
        return false;
    }

    public void retain() {
        this.refCount.incrementAndGet();
    }

    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() == 0 && (runnable = this.releaseCallback) != null) {
            runnable.run();
        }
    }

    public RefObject(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
