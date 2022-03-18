package com.facebook.yoga.jni;

public class HybridData {
    private long mNativePointer;

    public native void resetNative();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        resetNative();
        super.finalize();
    }

    public boolean isValid() {
        if (this.mNativePointer != 0) {
            return true;
        }
        return false;
    }
}
