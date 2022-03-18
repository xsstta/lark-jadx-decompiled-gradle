package com.ttnet.org.chromium.net.impl;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.TTNetDiagnosisRequest;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@JNINamespace("cronet")
public final class TTCronetNetExpRequest extends TTNetDiagnosisRequest {
    public static final String TAG = "TTCronetNetExpRequest";
    public final TTNetDiagnosisRequest.Callback mCallback;
    private Executor mExecutor;
    private int mNetDetectActions;
    private long mNetDiagnosisRequestAdapter;
    public final Object mNetDiagnosisRequestAdapterLock = new Object();
    private CronetUrlRequestContext mRequestContext;
    private int mRequestType;
    private boolean mStarted;
    private List<String> mTargets;
    private int mTimeoutMs;

    private native long nativeCreateRequestAdapter(long j, int i, String[] strArr, int i2, int i3);

    @NativeClassQualifiedName("TTCronetNetExpRequestAdapter")
    private native void nativeDestroy(long j);

    @NativeClassQualifiedName("TTCronetNetExpRequestAdapter")
    private native void nativeDoExtraCommand(long j, String str, String str2);

    @NativeClassQualifiedName("TTCronetNetExpRequestAdapter")
    private native void nativeStart(long j);

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public void destroyRequestAdapterLocked() {
        long j = this.mNetDiagnosisRequestAdapter;
        if (j != 0) {
            nativeDestroy(j);
            this.mNetDiagnosisRequestAdapter = 0;
        }
    }

    public boolean isDoneLocked() {
        if (!this.mStarted || this.mNetDiagnosisRequestAdapter != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest
    public void cancel() {
        synchronized (this.mNetDiagnosisRequestAdapterLock) {
            if (!isDoneLocked()) {
                if (this.mStarted) {
                    destroyRequestAdapterLocked();
                }
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest
    public void start() {
        synchronized (this.mNetDiagnosisRequestAdapterLock) {
            if (!this.mStarted) {
                long urlRequestContextAdapter = this.mRequestContext.getUrlRequestContextAdapter();
                int i = this.mRequestType;
                List<String> list = this.mTargets;
                long nativeCreateRequestAdapter = nativeCreateRequestAdapter(urlRequestContextAdapter, i, (String[]) list.toArray(new String[list.size()]), this.mNetDetectActions, this.mTimeoutMs);
                this.mNetDiagnosisRequestAdapter = nativeCreateRequestAdapter;
                if (nativeCreateRequestAdapter != 0) {
                    this.mStarted = true;
                    nativeStart(nativeCreateRequestAdapter);
                    return;
                }
                throw new NullPointerException("Create native net exp request adapter failed.");
            }
        }
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(runnable);
            } else {
                new_insert_after_java_lang_Thread_by_knot(new Thread(runnable, "NetExpCallback")).start();
            }
        } catch (RejectedExecutionException e) {
            Log.m264556e(TAG, "Exception posting task to executor", e);
        }
    }

    private void onNetExpRequestComplete(final String str, final boolean z) {
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.TTCronetNetExpRequest.RunnableC680771 */

            public void run() {
                if (!z) {
                    synchronized (TTCronetNetExpRequest.this.mNetDiagnosisRequestAdapterLock) {
                        if (!TTCronetNetExpRequest.this.isDoneLocked()) {
                            TTCronetNetExpRequest.this.destroyRequestAdapterLocked();
                        }
                    }
                }
                try {
                    TTCronetNetExpRequest.this.mCallback.onNetDiagnosisRequestComplete(TTCronetNetExpRequest.this, str);
                } catch (Exception e) {
                    Log.m264556e(TTCronetNetExpRequest.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest
    public void doExtraCommand(String str, String str2) {
        synchronized (this.mNetDiagnosisRequestAdapterLock) {
            if (!isDoneLocked()) {
                if (this.mStarted) {
                    nativeDoExtraCommand(this.mNetDiagnosisRequestAdapter, str, str2);
                }
            }
        }
    }

    public TTCronetNetExpRequest(CronetUrlRequestContext cronetUrlRequestContext, TTNetDiagnosisRequest.Callback callback, Executor executor, int i, List<String> list, int i2, int i3) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mRequestType = i;
        this.mTargets = list;
        this.mNetDetectActions = i2;
        this.mTimeoutMs = i3;
    }
}
