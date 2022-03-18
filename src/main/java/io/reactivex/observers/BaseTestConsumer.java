package io.reactivex.observers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {

    /* renamed from: a */
    protected final CountDownLatch f172992a = new CountDownLatch(1);

    /* renamed from: b */
    protected final List<T> f172993b = new VolatileSizeArrayList();

    /* renamed from: c */
    protected final List<Throwable> f172994c = new VolatileSizeArrayList();

    /* renamed from: d */
    protected long f172995d;

    /* renamed from: e */
    protected Thread f172996e;

    /* renamed from: f */
    protected boolean f172997f;

    /* renamed from: g */
    protected int f172998g;

    /* renamed from: h */
    protected int f172999h;

    public enum TestWaitStrategy implements Runnable {
        SPIN {
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy
            public void run() {
            }
        },
        YIELD {
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS {
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy
            public void run() {
                sleep(1);
            }
        },
        SLEEP_10MS {
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy
            public void run() {
                sleep(10);
            }
        },
        SLEEP_100MS {
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy
            public void run() {
                sleep(100);
            }
        },
        SLEEP_1000MS {
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy
            public void run() {
                sleep(1000);
            }
        };

        public abstract void run();

        static void sleep(int i) {
            try {
                Thread.sleep((long) i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
