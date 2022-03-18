package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.schedulers.AbstractC68947i;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.util.c */
public final class C68978c {
    /* renamed from: a */
    public static void m265550a() {
        if (!RxJavaPlugins.isFailOnNonBlockingScheduler()) {
            return;
        }
        if ((Thread.currentThread() instanceof AbstractC68947i) || RxJavaPlugins.onBeforeBlocking()) {
            throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
        }
    }

    /* renamed from: a */
    public static void m265551a(CountDownLatch countDownLatch, Disposable disposable) {
        if (countDownLatch.getCount() != 0) {
            try {
                m265550a();
                countDownLatch.await();
            } catch (InterruptedException e) {
                disposable.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }
}
