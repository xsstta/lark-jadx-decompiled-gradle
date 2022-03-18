package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.observers.c */
public abstract class AbstractC68379c<T> extends CountDownLatch implements Disposable, AbstractC69009q<T> {

    /* renamed from: a */
    T f171688a;

    /* renamed from: b */
    Throwable f171689b;

    /* renamed from: c */
    Disposable f171690c;

    /* renamed from: d */
    volatile boolean f171691d;

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f171691d;
    }

    @Override // io.reactivex.AbstractC69009q
    public final void onComplete() {
        countDown();
    }

    public AbstractC68379c() {
        super(1);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f171691d = true;
        Disposable disposable = this.f171690c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public final T mo238108a() {
        if (getCount() != 0) {
            try {
                C68978c.m265550a();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C68981f.m265557a(e);
            }
        }
        Throwable th = this.f171689b;
        if (th == null) {
            return this.f171688a;
        }
        throw C68981f.m265557a(th);
    }

    @Override // io.reactivex.AbstractC69009q
    public final void onSubscribe(Disposable disposable) {
        this.f171690c = disposable;
        if (this.f171691d) {
            disposable.dispose();
        }
    }
}
