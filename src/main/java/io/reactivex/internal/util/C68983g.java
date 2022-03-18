package io.reactivex.internal.util;

import io.reactivex.AbstractC69009q;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.util.g */
public final class C68983g {
    /* renamed from: a */
    public static void m265564a(AbstractC69009q<?> qVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                qVar.onError(terminate);
            } else {
                qVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static void m265567a(AbstractC70021c<?> cVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                cVar.onError(terminate);
            } else {
                cVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static void m265563a(AbstractC69009q<?> qVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            RxJavaPlugins.onError(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            qVar.onError(atomicThrowable.terminate());
        }
    }

    /* renamed from: a */
    public static <T> void m265562a(AbstractC69009q<? super T> qVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            qVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    qVar.onError(terminate);
                } else {
                    qVar.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> void m265565a(AbstractC70021c<? super T> cVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    cVar.onError(terminate);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m265566a(AbstractC70021c<?> cVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            RxJavaPlugins.onError(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(atomicThrowable.terminate());
        }
    }
}
