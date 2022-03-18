package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.internal.observers.AbstractC68378b;
import io.reactivex.internal.p3459a.C68362b;

public final class bb<T> extends Observable<T> {

    /* renamed from: a */
    final T[] f172257a;

    /* renamed from: io.reactivex.internal.operators.observable.bb$a */
    static final class C68699a<T> extends AbstractC68378b<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172258a;

        /* renamed from: b */
        final T[] f172259b;

        /* renamed from: c */
        int f172260c;

        /* renamed from: d */
        boolean f172261d;

        /* renamed from: e */
        volatile boolean f172262e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172262e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172262e;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.f172260c = this.f172259b.length;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            if (this.f172260c == this.f172259b.length) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() {
            int i = this.f172260c;
            T[] tArr = this.f172259b;
            if (i == tArr.length) {
                return null;
            }
            this.f172260c = i + 1;
            return (T) C68362b.m265229a((Object) tArr[i], "The array element is null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238361a() {
            T[] tArr = this.f172259b;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    AbstractC69009q<? super T> qVar = this.f172258a;
                    qVar.onError(new NullPointerException("The " + i + "th element is null"));
                    return;
                }
                this.f172258a.onNext(t);
            }
            if (!isDisposed()) {
                this.f172258a.onComplete();
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f172261d = true;
            return 1;
        }

        C68699a(AbstractC69009q<? super T> qVar, T[] tArr) {
            this.f172258a = qVar;
            this.f172259b = tArr;
        }
    }

    public bb(T[] tArr) {
        this.f172257a = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68699a aVar = new C68699a(qVar, this.f172257a);
        qVar.onSubscribe(aVar);
        if (!aVar.f172261d) {
            aVar.mo238361a();
        }
    }
}
