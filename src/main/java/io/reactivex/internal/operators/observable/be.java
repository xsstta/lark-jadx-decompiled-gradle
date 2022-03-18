package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.AbstractC68378b;
import io.reactivex.internal.p3459a.C68362b;
import java.util.Iterator;

public final class be<T> extends Observable<T> {

    /* renamed from: a */
    final Iterable<? extends T> f172267a;

    /* renamed from: io.reactivex.internal.operators.observable.be$a */
    static final class C68700a<T> extends AbstractC68378b<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172268a;

        /* renamed from: b */
        final Iterator<? extends T> f172269b;

        /* renamed from: c */
        volatile boolean f172270c;

        /* renamed from: d */
        boolean f172271d;

        /* renamed from: e */
        boolean f172272e;

        /* renamed from: f */
        boolean f172273f;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.f172272e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172270c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172270c;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.f172272e;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() {
            if (this.f172272e) {
                return null;
            }
            if (!this.f172273f) {
                this.f172273f = true;
            } else if (!this.f172269b.hasNext()) {
                this.f172272e = true;
                return null;
            }
            return (T) C68362b.m265229a(this.f172269b.next(), "The iterator returned a null value");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238363a() {
            while (!isDisposed()) {
                try {
                    this.f172268a.onNext(C68362b.m265229a(this.f172269b.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f172269b.hasNext()) {
                                if (!isDisposed()) {
                                    this.f172268a.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C68306a.m265071b(th);
                            this.f172268a.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    this.f172268a.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f172271d = true;
            return 1;
        }

        C68700a(AbstractC69009q<? super T> qVar, Iterator<? extends T> it) {
            this.f172268a = qVar;
            this.f172269b = it;
        }
    }

    public be(Iterable<? extends T> iterable) {
        this.f172267a = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        try {
            Iterator<? extends T> it = this.f172267a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(qVar);
                    return;
                }
                C68700a aVar = new C68700a(qVar, it);
                qVar.onSubscribe(aVar);
                if (!aVar.f172271d) {
                    aVar.mo238363a();
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                EmptyDisposable.error(th, qVar);
            }
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            EmptyDisposable.error(th2, qVar);
        }
    }
}
