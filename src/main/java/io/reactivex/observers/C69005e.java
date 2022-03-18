package io.reactivex.observers;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68368e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.observers.e */
public class C69005e<T> extends BaseTestConsumer<T, C69005e<T>> implements AbstractC68273c, Disposable, AbstractC68989k<T>, AbstractC69009q<T>, AbstractC69012t<T> {

    /* renamed from: i */
    private final AbstractC69009q<? super T> f173011i;

    /* renamed from: j */
    private final AtomicReference<Disposable> f173012j;

    /* renamed from: k */
    private AbstractC68368e<T> f173013k;

    /* renamed from: io.reactivex.observers.e$a */
    enum EnumC69006a implements AbstractC69009q<Object> {
        INSTANCE;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
        }
    }

    /* renamed from: a */
    public final void mo238790a() {
        dispose();
    }

    public C69005e() {
        this(EnumC69006a.INSTANCE);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.f173012j);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f173012j.get());
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!this.f172997f) {
            this.f172997f = true;
            if (this.f173012j.get() == null) {
                this.f172994c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f172996e = Thread.currentThread();
            this.f172995d++;
            this.f173011i.onComplete();
        } finally {
            this.f172992a.countDown();
        }
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }

    public C69005e(AbstractC69009q<? super T> qVar) {
        this.f173012j = new AtomicReference<>();
        this.f173011i = qVar;
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        if (!this.f172997f) {
            this.f172997f = true;
            if (this.f173012j.get() == null) {
                this.f172994c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f172996e = Thread.currentThread();
            if (th == null) {
                this.f172994c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f172994c.add(th);
            }
            this.f173011i.onError(th);
        } finally {
            this.f172992a.countDown();
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (!this.f172997f) {
            this.f172997f = true;
            if (this.f173012j.get() == null) {
                this.f172994c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f172996e = Thread.currentThread();
        if (this.f172999h == 2) {
            while (true) {
                try {
                    T poll = this.f173013k.poll();
                    if (poll != null) {
                        this.f172993b.add(poll);
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    this.f172994c.add(th);
                    this.f173013k.dispose();
                    return;
                }
            }
        } else {
            this.f172993b.add(t);
            if (t == null) {
                this.f172994c.add(new NullPointerException("onNext received a null value"));
            }
            this.f173011i.onNext(t);
        }
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        this.f172996e = Thread.currentThread();
        if (disposable == null) {
            this.f172994c.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.f173012j.compareAndSet(null, disposable)) {
            disposable.dispose();
            if (this.f173012j.get() != DisposableHelper.DISPOSED) {
                this.f172994c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
            }
        } else {
            if (this.f172998g != 0 && (disposable instanceof AbstractC68368e)) {
                AbstractC68368e<T> eVar = (AbstractC68368e) disposable;
                this.f173013k = eVar;
                int requestFusion = eVar.requestFusion(this.f172998g);
                this.f172999h = requestFusion;
                if (requestFusion == 1) {
                    this.f172997f = true;
                    this.f172996e = Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.f173013k.poll();
                            if (poll != null) {
                                this.f172993b.add(poll);
                            } else {
                                this.f172995d++;
                                this.f173012j.lazySet(DisposableHelper.DISPOSED);
                                return;
                            }
                        } catch (Throwable th) {
                            this.f172994c.add(th);
                            return;
                        }
                    }
                }
            }
            this.f173011i.onSubscribe(disposable);
        }
    }
}
