package io.reactivex.disposables;

/* access modifiers changed from: package-private */
/* renamed from: io.reactivex.disposables.d */
public final class C68292d extends AbstractC68291c<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    C68292d(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    public void onDisposed(Runnable runnable) {
        runnable.run();
    }
}
