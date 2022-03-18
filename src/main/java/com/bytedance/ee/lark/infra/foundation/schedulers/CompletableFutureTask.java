package com.bytedance.ee.lark.infra.foundation.schedulers;

import java.util.Objects;
import java.util.concurrent.Callable;

public abstract class CompletableFutureTask<V> implements Runnable {
    private Callable<V> callable;
    private volatile int state = 0;

    /* access modifiers changed from: protected */
    public abstract void onError(Throwable th);

    /* access modifiers changed from: protected */
    public abstract void onResult(V v);

    public boolean cancel() {
        if (this.state != 0 && this.state != 4) {
            return false;
        }
        this.state = 4;
        return true;
    }

    public boolean isCancelled() {
        if (this.state >= 4) {
            return true;
        }
        return false;
    }

    public boolean isUnSubscribe() {
        if (this.state >= 2) {
            return true;
        }
        return false;
    }

    public void run() {
        if (this.state == 0) {
            this.state = 1;
            try {
                onResult(this.callable.call());
                this.state = 2;
            } catch (Throwable th) {
                onError(th);
                this.state = 3;
            }
        }
    }

    public CompletableFutureTask(Callable<V> callable2) {
        Objects.requireNonNull(callable2, "callable should not null");
        this.callable = callable2;
    }
}
