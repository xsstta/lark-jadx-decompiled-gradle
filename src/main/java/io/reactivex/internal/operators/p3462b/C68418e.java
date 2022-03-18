package io.reactivex.internal.operators.p3462b;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.b.e */
public final class C68418e<T> extends AbstractC68259a {

    /* renamed from: a */
    final Observable<T> f171751a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68293e> f171752b;

    /* renamed from: c */
    final boolean f171753c;

    /* renamed from: io.reactivex.internal.operators.b.e$a */
    static final class C68419a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: f */
        static final C68420a f171754f = new C68420a(null);

        /* renamed from: a */
        final AbstractC68273c f171755a;

        /* renamed from: b */
        final Function<? super T, ? extends AbstractC68293e> f171756b;

        /* renamed from: c */
        final boolean f171757c;

        /* renamed from: d */
        final AtomicThrowable f171758d = new AtomicThrowable();

        /* renamed from: e */
        final AtomicReference<C68420a> f171759e = new AtomicReference<>();

        /* renamed from: g */
        volatile boolean f171760g;

        /* renamed from: h */
        Disposable f171761h;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.b.e$a$a */
        public static final class C68420a extends AtomicReference<Disposable> implements AbstractC68273c {
            private static final long serialVersionUID = -8003404460084760287L;
            final C68419a<?> parent;

            /* access modifiers changed from: package-private */
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC68273c
            public void onComplete() {
                this.parent.mo238156a(this);
            }

            @Override // io.reactivex.AbstractC68273c
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68420a(C68419a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.AbstractC68273c
            public void onError(Throwable th) {
                this.parent.mo238157a(this, th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171761h.dispose();
            mo238155a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f171759e.get() == f171754f) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238155a() {
            AtomicReference<C68420a> atomicReference = this.f171759e;
            C68420a aVar = f171754f;
            C68420a andSet = atomicReference.getAndSet(aVar);
            if (andSet != null && andSet != aVar) {
                andSet.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f171760g = true;
            if (this.f171759e.get() == null) {
                Throwable terminate = this.f171758d.terminate();
                if (terminate == null) {
                    this.f171755a.onComplete();
                } else {
                    this.f171755a.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f171761h, disposable)) {
                this.f171761h = disposable;
                this.f171755a.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238156a(C68420a aVar) {
            if (this.f171759e.compareAndSet(aVar, null) && this.f171760g) {
                Throwable terminate = this.f171758d.terminate();
                if (terminate == null) {
                    this.f171755a.onComplete();
                } else {
                    this.f171755a.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (!this.f171758d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else if (this.f171757c) {
                onComplete();
            } else {
                mo238155a();
                Throwable terminate = this.f171758d.terminate();
                if (terminate != C68981f.f172984a) {
                    this.f171755a.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            C68420a aVar;
            try {
                AbstractC68293e eVar = (AbstractC68293e) C68362b.m265229a(this.f171756b.apply(t), "The mapper returned a null CompletableSource");
                C68420a aVar2 = new C68420a(this);
                do {
                    aVar = this.f171759e.get();
                    if (aVar == f171754f) {
                        return;
                    }
                } while (!this.f171759e.compareAndSet(aVar, aVar2));
                if (aVar != null) {
                    aVar.dispose();
                }
                eVar.mo237885a(aVar2);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f171761h.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238157a(C68420a aVar, Throwable th) {
            if (!this.f171759e.compareAndSet(aVar, null) || !this.f171758d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else if (!this.f171757c) {
                dispose();
                Throwable terminate = this.f171758d.terminate();
                if (terminate != C68981f.f172984a) {
                    this.f171755a.onError(terminate);
                }
            } else if (this.f171760g) {
                this.f171755a.onError(this.f171758d.terminate());
            }
        }

        C68419a(AbstractC68273c cVar, Function<? super T, ? extends AbstractC68293e> function, boolean z) {
            this.f171755a = cVar;
            this.f171756b = function;
            this.f171757c = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        if (!C68427h.m265273a(this.f171751a, this.f171752b, cVar)) {
            this.f171751a.subscribe(new C68419a(cVar, this.f171752b, this.f171753c));
        }
    }

    public C68418e(Observable<T> observable, Function<? super T, ? extends AbstractC68293e> function, boolean z) {
        this.f171751a = observable;
        this.f171752b = function;
        this.f171753c = z;
    }
}
