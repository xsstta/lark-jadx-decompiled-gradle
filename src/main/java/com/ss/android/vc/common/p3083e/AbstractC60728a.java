package com.ss.android.vc.common.p3083e;

import io.reactivex.ObservableEmitter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.common.e.a */
public abstract class AbstractC60728a<T> {

    /* renamed from: a */
    private AtomicBoolean f151899a = new AtomicBoolean(false);

    /* renamed from: b */
    private AtomicBoolean f151900b = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo208348a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo208351b(T t) {
    }

    /* renamed from: b */
    public boolean mo208352b() {
        return this.f151899a.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo208349a(ObservableEmitter<T> observableEmitter) {
        T a;
        if (!(mo208352b() || observableEmitter == null || (a = mo208348a()) == null)) {
            observableEmitter.onNext(a);
        }
        if (observableEmitter != null) {
            observableEmitter.onComplete();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo208350a(T t) {
        if (!mo208352b() && this.f151900b.compareAndSet(false, true)) {
            mo208351b(t);
        }
    }
}
