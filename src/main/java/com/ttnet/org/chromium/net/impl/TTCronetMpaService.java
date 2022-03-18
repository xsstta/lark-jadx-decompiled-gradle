package com.ttnet.org.chromium.net.impl;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.TTMpaService;
import java.util.List;

@JNINamespace("cronet")
public final class TTCronetMpaService extends TTMpaService {
    public static final String TAG = "TTCronetMpaService";
    public TTMpaService.ICallback mAccAddressCallback;
    public TTMpaService.ICallback mInitCallback;
    private long mMpaServiceAdapter;
    private final Object mMpaServiceAdapterLock = new Object();
    private CronetUrlRequestContext mRequestContext;

    @NativeClassQualifiedName("TTCronetMpaServiceAdapter")
    private native void nativeCommand(long j, String str, String str2);

    private native long nativeCreateMpaServiceAdapter(long j);

    @NativeClassQualifiedName("TTCronetMpaServiceAdapter")
    private native void nativeInit(long j);

    @NativeClassQualifiedName("TTCronetMpaServiceAdapter")
    private native void nativeSetAccAddress(long j, String[] strArr);

    @NativeClassQualifiedName("TTCronetMpaServiceAdapter")
    private native void nativeStart(long j);

    @NativeClassQualifiedName("TTCronetMpaServiceAdapter")
    private native void nativeStop(long j);

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // com.ttnet.org.chromium.net.TTMpaService
    public void start() {
        synchronized (this.mMpaServiceAdapterLock) {
            long j = this.mMpaServiceAdapter;
            if (j != 0) {
                nativeStart(j);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.TTMpaService
    public void stop() {
        synchronized (this.mMpaServiceAdapterLock) {
            long j = this.mMpaServiceAdapter;
            if (j != 0) {
                nativeStop(j);
            }
        }
    }

    public TTCronetMpaService(CronetUrlRequestContext cronetUrlRequestContext) {
        this.mRequestContext = cronetUrlRequestContext;
    }

    private void postToSubThread(Runnable runnable) {
        Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(runnable));
        new_insert_after_java_lang_Thread_by_knot.setName("TTCronetMpaService_Thread");
        new_insert_after_java_lang_Thread_by_knot.start();
    }

    @Override // com.ttnet.org.chromium.net.TTMpaService
    public void init(TTMpaService.ICallback iCallback) {
        synchronized (this.mMpaServiceAdapterLock) {
            if (this.mMpaServiceAdapter == 0) {
                this.mMpaServiceAdapter = nativeCreateMpaServiceAdapter(this.mRequestContext.getUrlRequestContextAdapter());
            }
            this.mInitCallback = iCallback;
            nativeInit(this.mMpaServiceAdapter);
        }
    }

    private void onInitFinish(final boolean z, final String str) {
        postToSubThread(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.TTCronetMpaService.RunnableC680751 */

            public void run() {
                try {
                    TTCronetMpaService.this.mInitCallback.onFinish(z, str);
                } catch (Exception e) {
                    Log.m264556e(TTCronetMpaService.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onSetAccAddressFinish(final boolean z, final String str) {
        postToSubThread(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.TTCronetMpaService.RunnableC680762 */

            public void run() {
                try {
                    TTCronetMpaService.this.mAccAddressCallback.onFinish(z, str);
                } catch (Exception e) {
                    Log.m264556e(TTCronetMpaService.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.TTMpaService
    public void command(String str, String str2) {
        synchronized (this.mMpaServiceAdapterLock) {
            long j = this.mMpaServiceAdapter;
            if (j != 0) {
                nativeCommand(j, str, str2);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.TTMpaService
    public void setAccAddress(List<String> list, TTMpaService.ICallback iCallback) {
        synchronized (this.mMpaServiceAdapterLock) {
            long j = this.mMpaServiceAdapter;
            if (j != 0) {
                this.mAccAddressCallback = iCallback;
                nativeSetAccAddress(j, (String[]) list.toArray(new String[list.size()]));
            }
        }
    }
}
