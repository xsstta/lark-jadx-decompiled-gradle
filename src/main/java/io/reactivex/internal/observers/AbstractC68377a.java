package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.observers.a */
public abstract class AbstractC68377a<T, R> implements AbstractC68368e<R>, AbstractC69009q<T> {

    /* renamed from: a */
    protected final AbstractC69009q<? super R> f171683a;

    /* renamed from: b */
    protected Disposable f171684b;

    /* renamed from: c */
    protected AbstractC68368e<T> f171685c;

    /* renamed from: d */
    protected boolean f171686d;

    /* renamed from: e */
    protected int f171687e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo238106a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo238107b() {
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
        this.f171685c.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f171684b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f171684b.isDisposed();
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        return this.f171685c.isEmpty();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!this.f171686d) {
            this.f171686d = true;
            this.f171683a.onComplete();
        }
    }

    public AbstractC68377a(AbstractC69009q<? super R> qVar) {
        this.f171683a = qVar;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo238105a(Throwable th) {
        C68306a.m265071b(th);
        this.f171684b.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo238104a(int i) {
        AbstractC68368e<T> eVar = this.f171685c;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = eVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f171687e = requestFusion;
        }
        return requestFusion;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        if (this.f171686d) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.f171686d = true;
        this.f171683a.onError(th);
    }

    @Override // io.reactivex.AbstractC69009q
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f171684b, disposable)) {
            this.f171684b = disposable;
            if (disposable instanceof AbstractC68368e) {
                this.f171685c = (AbstractC68368e) disposable;
            }
            if (mo238106a()) {
                this.f171683a.onSubscribe(this);
                mo238107b();
            }
        }
    }
}
