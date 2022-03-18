package com.ss.android.usssendengine;

import com.C1711a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UssSend {
    private long mNativeRecvListenerPointer;
    private AbstractC60634a mRecvListener;

    @Retention(RetentionPolicy.SOURCE)
    public @interface UssRecvCode {
    }

    /* renamed from: com.ss.android.usssendengine.UssSend$a */
    public interface AbstractC60634a {
        /* renamed from: a */
        void mo208127a(int i, String str);
    }

    private native long bindRecvListener();

    private native boolean startUssRecv(int i, long j);

    private native void stopUssRecvNative(long j);

    public native void enableDebug(boolean z);

    public native void startUssSend(String str);

    public native void stopUssSend();

    public native void tickUssSend();

    public native void updateUssSend(String str);

    static {
        C1711a.m7628a("usssend");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        stopUssRecv();
        super.finalize();
    }

    public void stopUssRecv() {
        this.mRecvListener = null;
        stopUssRecvNative(this.mNativeRecvListenerPointer);
        this.mNativeRecvListenerPointer = 0;
    }

    public void onRecvData(int i, String str) {
        AbstractC60634a aVar = this.mRecvListener;
        if (aVar != null) {
            aVar.mo208127a(i, str);
        }
    }

    public void startUssRecv(int i, AbstractC60634a aVar) {
        if (this.mRecvListener == null) {
            this.mRecvListener = aVar;
            long bindRecvListener = bindRecvListener();
            this.mNativeRecvListenerPointer = bindRecvListener;
            if (!startUssRecv(i, bindRecvListener)) {
                this.mRecvListener.mo208127a(1, "");
            }
        }
    }
}
