package io.reactivex.p3457e;

import io.reactivex.AbstractC69009q;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.e.e */
public final class C68300e<T> extends AbstractC68299d<T> {

    /* renamed from: a */
    final C68926b<T> f171620a;

    /* renamed from: b */
    final AtomicReference<AbstractC69009q<? super T>> f171621b;

    /* renamed from: c */
    final AtomicReference<Runnable> f171622c;

    /* renamed from: d */
    final boolean f171623d;

    /* renamed from: e */
    volatile boolean f171624e;

    /* renamed from: f */
    volatile boolean f171625f;

    /* renamed from: g */
    Throwable f171626g;

    /* renamed from: h */
    final AtomicBoolean f171627h;

    /* renamed from: i */
    final BasicIntQueueDisposable<T> f171628i;

    /* renamed from: j */
    boolean f171629j;

    /* renamed from: io.reactivex.e.e$a */
    final class C68301a extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            C68300e.this.f171620a.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return C68300e.this.f171624e;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return C68300e.this.f171620a.isEmpty();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            return C68300e.this.f171620a.poll();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!C68300e.this.f171624e) {
                C68300e.this.f171624e = true;
                C68300e.this.mo237963b();
                C68300e.this.f171621b.lazySet(null);
                if (C68300e.this.f171628i.getAndIncrement() == 0) {
                    C68300e.this.f171621b.lazySet(null);
                    C68300e.this.f171620a.clear();
                }
            }
        }

        C68301a() {
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C68300e.this.f171629j = true;
            return 2;
        }
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C68300e<T> m265058a() {
        return new C68300e<>(bufferSize(), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo237963b() {
        Runnable runnable = this.f171622c.get();
        if (runnable != null && this.f171622c.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!this.f171625f && !this.f171624e) {
            this.f171625f = true;
            mo237963b();
            mo237966d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo237966d() {
        if (this.f171628i.getAndIncrement() == 0) {
            AbstractC69009q<? super T> qVar = this.f171621b.get();
            int i = 1;
            while (qVar == null) {
                i = this.f171628i.addAndGet(-i);
                if (i != 0) {
                    qVar = this.f171621b.get();
                } else {
                    return;
                }
            }
            if (this.f171629j) {
                mo237964b(qVar);
            } else {
                mo237961a(qVar);
            }
        }
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C68300e<T> m265059a(int i) {
        return new C68300e<>(i, true);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (this.f171625f || this.f171624e) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo237965c(AbstractC69009q<? super T> qVar) {
        this.f171621b.lazySet(null);
        Throwable th = this.f171626g;
        if (th != null) {
            qVar.onError(th);
        } else {
            qVar.onComplete();
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        C68362b.m265229a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f171625f || this.f171624e) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.f171626g = th;
        this.f171625f = true;
        mo237963b();
        mo237966d();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        C68362b.m265229a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f171625f && !this.f171624e) {
            this.f171620a.offer(t);
            mo237966d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo237964b(AbstractC69009q<? super T> qVar) {
        C68926b<T> bVar = this.f171620a;
        int i = 1;
        boolean z = !this.f171623d;
        while (!this.f171624e) {
            boolean z2 = this.f171625f;
            if (!z || !z2 || !mo237962a(bVar, qVar)) {
                qVar.onNext(null);
                if (z2) {
                    mo237965c(qVar);
                    return;
                }
                i = this.f171628i.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f171621b.lazySet(null);
        bVar.clear();
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        if (this.f171627h.get() || !this.f171627h.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), qVar);
            return;
        }
        qVar.onSubscribe(this.f171628i);
        this.f171621b.lazySet(qVar);
        if (this.f171624e) {
            this.f171621b.lazySet(null);
        } else {
            mo237966d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo237961a(AbstractC69009q<? super T> qVar) {
        boolean z;
        C68926b<T> bVar = this.f171620a;
        boolean z2 = !this.f171623d;
        boolean z3 = true;
        int i = 1;
        while (!this.f171624e) {
            boolean z4 = this.f171625f;
            T poll = this.f171620a.poll();
            if (poll == null) {
                z = true;
            } else {
                z = false;
            }
            if (z4) {
                if (z2 && z3) {
                    if (!mo237962a(bVar, qVar)) {
                        z3 = false;
                    } else {
                        return;
                    }
                }
                if (z) {
                    mo237965c(qVar);
                    return;
                }
            }
            if (z) {
                i = this.f171628i.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                qVar.onNext(poll);
            }
        }
        this.f171621b.lazySet(null);
        bVar.clear();
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C68300e<T> m265060a(int i, Runnable runnable) {
        return new C68300e<>(i, runnable, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo237962a(AbstractC68373j<T> jVar, AbstractC69009q<? super T> qVar) {
        Throwable th = this.f171626g;
        if (th == null) {
            return false;
        }
        this.f171621b.lazySet(null);
        jVar.clear();
        qVar.onError(th);
        return true;
    }

    C68300e(int i, boolean z) {
        this.f171620a = new C68926b<>(C68362b.m265225a(i, "capacityHint"));
        this.f171622c = new AtomicReference<>();
        this.f171623d = z;
        this.f171621b = new AtomicReference<>();
        this.f171627h = new AtomicBoolean();
        this.f171628i = new C68301a();
    }

    C68300e(int i, Runnable runnable, boolean z) {
        this.f171620a = new C68926b<>(C68362b.m265225a(i, "capacityHint"));
        this.f171622c = new AtomicReference<>(C68362b.m265229a((Object) runnable, "onTerminate"));
        this.f171623d = z;
        this.f171621b = new AtomicReference<>();
        this.f171627h = new AtomicBoolean();
        this.f171628i = new C68301a();
    }
}
