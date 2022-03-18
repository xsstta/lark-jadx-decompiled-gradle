package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.util.AbstractC68984h;
import io.reactivex.internal.util.C68987k;

/* renamed from: io.reactivex.internal.observers.k */
public abstract class AbstractC68387k<T, U, V> extends C68389m implements AbstractC68984h<U, V>, AbstractC69009q<T> {

    /* renamed from: a */
    protected final AbstractC69009q<? super V> f171706a;

    /* renamed from: b */
    public final AbstractC68372i<U> f171707b;

    /* renamed from: c */
    public volatile boolean f171708c;

    /* renamed from: d */
    protected volatile boolean f171709d;

    /* renamed from: e */
    protected Throwable f171710e;

    @Override // io.reactivex.internal.util.AbstractC68984h
    /* renamed from: a */
    public void mo238126a(AbstractC69009q<? super V> qVar, U u) {
    }

    @Override // io.reactivex.internal.util.AbstractC68984h
    /* renamed from: b */
    public final boolean mo238130b() {
        return this.f171709d;
    }

    @Override // io.reactivex.internal.util.AbstractC68984h
    /* renamed from: e */
    public final Throwable mo238133e() {
        return this.f171710e;
    }

    @Override // io.reactivex.internal.util.AbstractC68984h
    /* renamed from: a */
    public final boolean mo238128a() {
        return this.f171708c;
    }

    /* renamed from: c */
    public final boolean mo238131c() {
        if (this.f171711f.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo238132d() {
        if (this.f171711f.get() != 0 || !this.f171711f.compareAndSet(0, 1)) {
            return false;
        }
        return true;
    }

    @Override // io.reactivex.internal.util.AbstractC68984h
    /* renamed from: a */
    public final int mo238125a(int i) {
        return this.f171711f.addAndGet(i);
    }

    public AbstractC68387k(AbstractC69009q<? super V> qVar, AbstractC68372i<U> iVar) {
        this.f171706a = qVar;
        this.f171707b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo238127a(U u, boolean z, Disposable disposable) {
        AbstractC69009q<? super V> qVar = this.f171706a;
        AbstractC68372i<U> iVar = this.f171707b;
        if (this.f171711f.get() != 0 || !this.f171711f.compareAndSet(0, 1)) {
            iVar.offer(u);
            if (!mo238131c()) {
                return;
            }
        } else {
            mo238126a(qVar, u);
            if (mo238125a(-1) == 0) {
                return;
            }
        }
        C68987k.m265582a(iVar, qVar, z, disposable, this);
    }

    /* renamed from: b */
    public final void mo238129b(U u, boolean z, Disposable disposable) {
        AbstractC69009q<? super V> qVar = this.f171706a;
        AbstractC68372i<U> iVar = this.f171707b;
        if (this.f171711f.get() != 0 || !this.f171711f.compareAndSet(0, 1)) {
            iVar.offer(u);
            if (!mo238131c()) {
                return;
            }
        } else if (iVar.isEmpty()) {
            mo238126a(qVar, u);
            if (mo238125a(-1) == 0) {
                return;
            }
        } else {
            iVar.offer(u);
        }
        C68987k.m265582a(iVar, qVar, z, disposable, this);
    }
}
