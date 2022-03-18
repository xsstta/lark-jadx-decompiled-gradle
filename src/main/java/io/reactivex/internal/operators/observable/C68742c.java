package io.reactivex.internal.operators.observable;

import io.reactivex.C68991m;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import io.reactivex.observers.AbstractC69002b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.c */
public final class C68742c<T> implements Iterable<T> {

    /* renamed from: a */
    final ObservableSource<T> f172366a;

    /* renamed from: io.reactivex.internal.operators.observable.c$a */
    static final class C68743a<T> extends AbstractC69002b<C68991m<T>> implements Iterator<T> {

        /* renamed from: a */
        C68991m<T> f172367a;

        /* renamed from: b */
        final Semaphore f172368b = new Semaphore(0);

        /* renamed from: c */
        final AtomicReference<C68991m<T>> f172369c = new AtomicReference<>();

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
        }

        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        C68743a() {
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T d = this.f172367a.mo238777d();
                this.f172367a = null;
                return d;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            C68991m<T> mVar = this.f172367a;
            if (mVar == null || !mVar.mo238775b()) {
                if (this.f172367a == null) {
                    try {
                        C68978c.m265550a();
                        this.f172368b.acquire();
                        C68991m<T> andSet = this.f172369c.getAndSet(null);
                        this.f172367a = andSet;
                        if (andSet.mo238775b()) {
                            throw C68981f.m265557a(andSet.mo238778e());
                        }
                    } catch (InterruptedException e) {
                        dispose();
                        this.f172367a = C68991m.m265592a((Throwable) e);
                        throw C68981f.m265557a(e);
                    }
                }
                return this.f172367a.mo238776c();
            }
            throw C68981f.m265557a(this.f172367a.mo238778e());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            RxJavaPlugins.onError(th);
        }

        /* renamed from: a */
        public void onNext(C68991m<T> mVar) {
            boolean z;
            if (this.f172369c.getAndSet(mVar) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f172368b.release();
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C68743a aVar = new C68743a();
        Observable.wrap(this.f172366a).materialize().subscribe(aVar);
        return aVar;
    }

    public C68742c(ObservableSource<T> observableSource) {
        this.f172366a = observableSource;
    }
}
