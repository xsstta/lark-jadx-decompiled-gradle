package com.lynx.jsbridge;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.WritableArray;
import com.lynx.tasm.base.LLog;

public final class CallbackImpl implements Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mInvoked = false;
    private long mNativePtr;

    private native void nativeInvoke(long j, WritableArray writableArray);

    private native void nativeReleaseNativePtr(long j);

    public void resetNativePtr() {
        this.mNativePtr = 0;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        nativeReleaseNativePtr(this.mNativePtr);
    }

    public CallbackImpl(long j) {
        this.mNativePtr = j;
    }

    @Override // com.lynx.react.bridge.Callback
    public void invoke(Object... objArr) {
        if (this.mInvoked) {
            LLog.m96430f("LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            LLog.m96429e("LynxModule", "callback invoke failed: mNativePtr is NULL");
            return;
        }
        nativeInvoke(j, JavaOnlyArray.of(objArr));
        this.mInvoked = true;
    }

    public void invokeCallback(Object... objArr) {
        if (this.mInvoked) {
            LLog.m96430f("LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            LLog.m96429e("LynxModule", "callback invoke failed: mNativePtr is NULL");
            return;
        }
        nativeInvoke(j, JavaOnlyArray.of(objArr));
        this.mInvoked = true;
    }
}
