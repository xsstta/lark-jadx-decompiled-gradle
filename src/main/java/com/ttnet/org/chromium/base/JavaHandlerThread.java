package com.ttnet.org.chromium.base;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.lang.Thread;

@JNINamespace("base::android")
public class JavaHandlerThread {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final HandlerThread mThread;
    public Throwable mUnhandledException;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    public native void nativeInitializeThread(long j, long j2);

    public native void nativeOnLooperStopped(long j);

    private Throwable getUncaughtExceptionIfAny() {
        return this.mUnhandledException;
    }

    private boolean isAlive() {
        return this.mThread.isAlive();
    }

    public Looper getLooper() {
        return this.mThread.getLooper();
    }

    private boolean hasStarted() {
        if (this.mThread.getState() != Thread.State.NEW) {
            return true;
        }
        return false;
    }

    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.mThread.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.mThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.C679863 */

            public void uncaughtException(Thread thread, Throwable th) {
                JavaHandlerThread.this.mUnhandledException = th;
            }
        });
    }

    public void maybeStart() {
        if (!hasStarted()) {
            this.mThread.start();
        }
    }

    private void quitThreadSafely(final long j) {
        new Handler(this.mThread.getLooper()).post(new Runnable() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.RunnableC679852 */

            public void run() {
                JavaHandlerThread.this.mThread.quit();
                JavaHandlerThread.this.nativeOnLooperStopped(j);
            }
        });
        if (Build.VERSION.SDK_INT >= 18) {
            this.mThread.getLooper().quitSafely();
        }
    }

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    public JavaHandlerThread(String str, int i) {
        this.mThread = new_android_os_HandlerThread_by_knot(str, i);
    }

    private void startAndInitialize(final long j, final long j2) {
        maybeStart();
        new Handler(this.mThread.getLooper()).post(new Runnable() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.RunnableC679841 */

            public void run() {
                JavaHandlerThread.this.nativeInitializeThread(j, j2);
            }
        });
    }
}
