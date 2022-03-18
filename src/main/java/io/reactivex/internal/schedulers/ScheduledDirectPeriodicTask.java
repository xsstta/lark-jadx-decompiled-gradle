package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

public final class ScheduledDirectPeriodicTask extends AbstractC68928a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // io.reactivex.internal.schedulers.AbstractC68928a
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(FINISHED);
            RxJavaPlugins.onError(th);
        }
    }

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }
}
