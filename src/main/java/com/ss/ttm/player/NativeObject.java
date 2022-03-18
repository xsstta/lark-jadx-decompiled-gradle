package com.ss.ttm.player;

public class NativeObject {
    protected long mNativeObj;

    private native void nativeRelease(long j);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
    }

    private long getNativeObj() {
        return this.mNativeObj;
    }

    public synchronized void release() {
        long j = this.mNativeObj;
        if (j != 0) {
            nativeRelease(j);
            this.mNativeObj = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void setNativeObj(long j) {
        this.mNativeObj = j;
    }
}
