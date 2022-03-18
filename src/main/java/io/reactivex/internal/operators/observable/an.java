package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class an<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Consumer<? super T> f172195b;

    /* renamed from: c */
    final Consumer<? super Throwable> f172196c;

    /* renamed from: d */
    final AbstractC68309a f172197d;

    /* renamed from: e */
    final AbstractC68309a f172198e;

    /* renamed from: io.reactivex.internal.operators.observable.an$a */
    static final class C68680a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172199a;

        /* renamed from: b */
        final Consumer<? super T> f172200b;

        /* renamed from: c */
        final Consumer<? super Throwable> f172201c;

        /* renamed from: d */
        final AbstractC68309a f172202d;

        /* renamed from: e */
        final AbstractC68309a f172203e;

        /* renamed from: f */
        Disposable f172204f;

        /* renamed from: g */
        boolean f172205g;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172204f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172204f.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172205g) {
                try {
                    this.f172202d.run();
                    this.f172205g = true;
                    this.f172199a.onComplete();
                    try {
                        this.f172203e.run();
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        RxJavaPlugins.onError(th);
                    }
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172204f, disposable)) {
                this.f172204f = disposable;
                this.f172199a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172205g) {
                try {
                    this.f172200b.accept(t);
                    this.f172199a.onNext(t);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172204f.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172205g) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172205g = true;
            try {
                this.f172201c.accept(th);
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                th = new CompositeException(th, th2);
            }
            this.f172199a.onError(th);
            try {
                this.f172203e.run();
            } catch (Throwable th3) {
                C68306a.m265071b(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        C68680a(AbstractC69009q<? super T> qVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2) {
            this.f172199a = qVar;
            this.f172200b = consumer;
            this.f172201c = consumer2;
            this.f172202d = aVar;
            this.f172203e = aVar2;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68680a(qVar, this.f172195b, this.f172196c, this.f172197d, this.f172198e));
    }

    public an(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2) {
        super(observableSource);
        this.f172195b = consumer;
        this.f172196c = consumer2;
        this.f172197d = aVar;
        this.f172198e = aVar2;
    }
}
