package io.reactivex.internal.observers;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69012t;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.observers.f */
public final class C68382f<T> extends CountDownLatch implements AbstractC68273c, AbstractC68989k<T>, AbstractC69012t<T> {

    /* renamed from: a */
    T f171692a;

    /* renamed from: b */
    Throwable f171693b;

    /* renamed from: c */
    Disposable f171694c;

    /* renamed from: d */
    volatile boolean f171695d;

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC68273c
    public void onComplete() {
        countDown();
    }

    public C68382f() {
        super(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238109a() {
        this.f171695d = true;
        Disposable disposable = this.f171694c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public T mo238110b() {
        if (getCount() != 0) {
            try {
                C68978c.m265550a();
                await();
            } catch (InterruptedException e) {
                mo238109a();
                throw C68981f.m265557a(e);
            }
        }
        Throwable th = this.f171693b;
        if (th == null) {
            return this.f171692a;
        }
        throw C68981f.m265557a(th);
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c
    public void onError(Throwable th) {
        this.f171693b = th;
        countDown();
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        this.f171692a = t;
        countDown();
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c
    public void onSubscribe(Disposable disposable) {
        this.f171694c = disposable;
        if (this.f171695d) {
            disposable.dispose();
        }
    }
}
