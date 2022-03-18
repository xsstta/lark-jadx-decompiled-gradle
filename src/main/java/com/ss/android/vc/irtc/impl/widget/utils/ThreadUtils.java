package com.ss.android.vc.irtc.impl.widget.utils;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.vc.irtc.C61064p;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class ThreadUtils {

    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() {
            /* class com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils.C610461 */

            @Override // com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void checkIsOnMainThreadSafely(String str) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        if (!EnvUtils.isApkInDebug()) {
            C61064p.m237487c(str, "Not on main thread!");
            return;
        }
        throw new IllegalStateException("Not on main thread!");
    }

    static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[(stackTraceElementArr.length + stackTraceElementArr2.length)];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() {
            /* class com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils.CallableC610483 */

            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            final AnonymousClass1Result r0 = new Object() {
                /* class com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils.AnonymousClass1Result */
                public V value;
            };
            final AnonymousClass1CaughtException r1 = new Object() {
                /* class com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils.AnonymousClass1CaughtException */

                /* renamed from: e */
                Exception f152918e;
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new Runnable() {
                /* class com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils.RunnableC610472 */

                public void run() {
                    try {
                        r0.value = (V) callable.call();
                    } catch (Exception e) {
                        r1.f152918e = e;
                    }
                    countDownLatch.countDown();
                }
            });
            awaitUninterruptibly(countDownLatch);
            if (r1.f152918e == null) {
                return r0.value;
            }
            RuntimeException runtimeException = new RuntimeException(r1.f152918e);
            runtimeException.setStackTrace(concatStackTraces(r1.f152918e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }
}
