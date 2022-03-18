package io.reactivex.internal.observers;

import io.reactivex.AbstractC68273c;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.observers.p */
public final class C68392p<T> implements AbstractC68273c, AbstractC70022d {

    /* renamed from: a */
    final AbstractC70021c<? super T> f171714a;

    /* renamed from: b */
    Disposable f171715b;

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
    }

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        this.f171715b.dispose();
    }

    @Override // io.reactivex.AbstractC68273c
    public void onComplete() {
        this.f171714a.onComplete();
    }

    public C68392p(AbstractC70021c<? super T> cVar) {
        this.f171714a = cVar;
    }

    @Override // io.reactivex.AbstractC68273c
    public void onError(Throwable th) {
        this.f171714a.onError(th);
    }

    @Override // io.reactivex.AbstractC68273c
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f171715b, disposable)) {
            this.f171715b = disposable;
            this.f171714a.onSubscribe(this);
        }
    }
}
