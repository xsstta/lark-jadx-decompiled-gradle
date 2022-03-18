package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.reactivex.android.a */
public abstract class AbstractC68262a implements Disposable {

    /* renamed from: a */
    private final AtomicBoolean f171553a = new AtomicBoolean();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28971a();

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f171553a.get();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (!this.f171553a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo28971a();
        } else {
            AndroidSchedulers.mainThread().scheduleDirect(new Runnable() {
                /* class io.reactivex.android.AbstractC68262a.RunnableC682631 */

                public void run() {
                    AbstractC68262a.this.mo28971a();
                }
            });
        }
    }
}
