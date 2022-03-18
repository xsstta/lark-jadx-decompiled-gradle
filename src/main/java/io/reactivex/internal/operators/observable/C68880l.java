package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.reactivex.internal.operators.observable.l */
public final class C68880l<T, U extends Collection<? super T>> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final int f172745b;

    /* renamed from: c */
    final int f172746c;

    /* renamed from: d */
    final Callable<U> f172747d;

    /* renamed from: io.reactivex.internal.operators.observable.l$a */
    static final class C68881a<T, U extends Collection<? super T>> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super U> f172748a;

        /* renamed from: b */
        final int f172749b;

        /* renamed from: c */
        final Callable<U> f172750c;

        /* renamed from: d */
        U f172751d;

        /* renamed from: e */
        int f172752e;

        /* renamed from: f */
        Disposable f172753f;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172753f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172753f.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            U u = this.f172751d;
            if (u != null) {
                this.f172751d = null;
                if (!u.isEmpty()) {
                    this.f172748a.onNext(u);
                }
                this.f172748a.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo238572a() {
            try {
                this.f172751d = (U) ((Collection) C68362b.m265229a((Object) this.f172750c.call(), "Empty buffer supplied"));
                return true;
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f172751d = null;
                Disposable disposable = this.f172753f;
                if (disposable == null) {
                    EmptyDisposable.error(th, this.f172748a);
                    return false;
                }
                disposable.dispose();
                this.f172748a.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172751d = null;
            this.f172748a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172753f, disposable)) {
                this.f172753f = disposable;
                this.f172748a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            U u = this.f172751d;
            if (u != null) {
                u.add(t);
                int i = this.f172752e + 1;
                this.f172752e = i;
                if (i >= this.f172749b) {
                    this.f172748a.onNext(u);
                    this.f172752e = 0;
                    mo238572a();
                }
            }
        }

        C68881a(AbstractC69009q<? super U> qVar, int i, Callable<U> callable) {
            this.f172748a = qVar;
            this.f172749b = i;
            this.f172750c = callable;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.l$b */
    static final class C68882b<T, U extends Collection<? super T>> extends AtomicBoolean implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final AbstractC69009q<? super U> downstream;
        long index;
        final int skip;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.util.ArrayDeque<U extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % ((long) this.skip) == 0) {
                try {
                    this.buffers.offer((Collection) C68362b.m265229a((Object) this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        C68882b(AbstractC69009q<? super U> qVar, int i, int i2, Callable<U> callable) {
            this.downstream = qVar;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        int i = this.f172746c;
        int i2 = this.f172745b;
        if (i == i2) {
            C68881a aVar = new C68881a(qVar, i2, this.f172747d);
            if (aVar.mo238572a()) {
                this.f172123a.subscribe(aVar);
                return;
            }
            return;
        }
        this.f172123a.subscribe(new C68882b(qVar, this.f172745b, this.f172746c, this.f172747d));
    }

    public C68880l(ObservableSource<T> observableSource, int i, int i2, Callable<U> callable) {
        super(observableSource);
        this.f172745b = i;
        this.f172746c = i2;
        this.f172747d = callable;
    }
}
