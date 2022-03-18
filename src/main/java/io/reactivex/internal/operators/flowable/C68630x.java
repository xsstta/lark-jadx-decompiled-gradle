package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.x */
public final class C68630x<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    private final Observable<T> f172088b;

    /* renamed from: io.reactivex.internal.operators.flowable.x$a */
    static final class C68631a<T> implements AbstractC69009q<T>, AbstractC70022d {

        /* renamed from: a */
        final AbstractC70021c<? super T> f172089a;

        /* renamed from: b */
        Disposable f172090b;

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.f172090b.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172089a.onComplete();
        }

        C68631a(AbstractC70021c<? super T> cVar) {
            this.f172089a = cVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172089a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172089a.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172090b = disposable;
            this.f172089a.onSubscribe(this);
        }
    }

    public C68630x(Observable<T> observable) {
        this.f172088b = observable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f172088b.subscribe(new C68631a(cVar));
    }
}
