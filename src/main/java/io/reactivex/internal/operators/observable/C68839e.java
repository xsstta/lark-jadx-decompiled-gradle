package io.reactivex.internal.operators.observable;

import io.reactivex.C68991m;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import io.reactivex.observers.AbstractC69002b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.observable.e */
public final class C68839e<T> implements Iterable<T> {

    /* renamed from: a */
    final ObservableSource<T> f172607a;

    /* renamed from: io.reactivex.internal.operators.observable.e$a */
    static final class C68840a<T> implements Iterator<T> {

        /* renamed from: a */
        private final C68841b<T> f172608a;

        /* renamed from: b */
        private final ObservableSource<T> f172609b;

        /* renamed from: c */
        private T f172610c;

        /* renamed from: d */
        private boolean f172611d = true;

        /* renamed from: e */
        private boolean f172612e = true;

        /* renamed from: f */
        private Throwable f172613f;

        /* renamed from: g */
        private boolean f172614g;

        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }

        public boolean hasNext() {
            Throwable th = this.f172613f;
            if (th != null) {
                throw C68981f.m265557a(th);
            } else if (!this.f172611d) {
                return false;
            } else {
                if (!this.f172612e || m265426a()) {
                    return true;
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f172613f;
            if (th != null) {
                throw C68981f.m265557a(th);
            } else if (hasNext()) {
                this.f172612e = true;
                return this.f172610c;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        /* renamed from: a */
        private boolean m265426a() {
            if (!this.f172614g) {
                this.f172614g = true;
                this.f172608a.mo238522b();
                new bw(this.f172609b).subscribe(this.f172608a);
            }
            try {
                C68991m<T> a = this.f172608a.mo238520a();
                if (a.mo238776c()) {
                    this.f172612e = false;
                    this.f172610c = a.mo238777d();
                    return true;
                }
                this.f172611d = false;
                if (a.mo238774a()) {
                    return false;
                }
                Throwable e = a.mo238778e();
                this.f172613f = e;
                throw C68981f.m265557a(e);
            } catch (InterruptedException e2) {
                this.f172608a.dispose();
                this.f172613f = e2;
                throw C68981f.m265557a(e2);
            }
        }

        C68840a(ObservableSource<T> observableSource, C68841b<T> bVar) {
            this.f172609b = observableSource;
            this.f172608a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.e$b */
    public static final class C68841b<T> extends AbstractC69002b<C68991m<T>> {

        /* renamed from: a */
        final AtomicInteger f172615a = new AtomicInteger();

        /* renamed from: b */
        private final BlockingQueue<C68991m<T>> f172616b = new ArrayBlockingQueue(1);

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo238522b() {
            this.f172615a.set(1);
        }

        /* renamed from: a */
        public C68991m<T> mo238520a() throws InterruptedException {
            mo238522b();
            C68978c.m265550a();
            return this.f172616b.take();
        }

        C68841b() {
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            RxJavaPlugins.onError(th);
        }

        /* renamed from: a */
        public void onNext(C68991m<T> mVar) {
            if (this.f172615a.getAndSet(0) == 1 || !mVar.mo238776c()) {
                while (!this.f172616b.offer(mVar)) {
                    C68991m<T> poll = this.f172616b.poll();
                    if (poll != null && !poll.mo238776c()) {
                        mVar = poll;
                    }
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C68840a(this.f172607a, new C68841b());
    }

    public C68839e(ObservableSource<T> observableSource) {
        this.f172607a = observableSource;
    }
}
