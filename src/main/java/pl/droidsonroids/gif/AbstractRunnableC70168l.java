package pl.droidsonroids.gif;

import java.lang.Thread;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.l */
public abstract class AbstractRunnableC70168l implements Runnable {

    /* renamed from: c */
    final C70149c f175285c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo247310a();

    public final void run() {
        try {
            if (!this.f175285c.mo247273b()) {
                mo247310a();
            }
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }

    AbstractRunnableC70168l(C70149c cVar) {
        this.f175285c = cVar;
    }
}
