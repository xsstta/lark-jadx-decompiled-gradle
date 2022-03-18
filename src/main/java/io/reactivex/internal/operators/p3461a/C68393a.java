package io.reactivex.internal.operators.p3461a;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.a.a */
public final class C68393a extends AbstractC68259a {

    /* renamed from: a */
    final AbstractC68293e[] f171716a;

    /* renamed from: io.reactivex.internal.operators.a.a$a */
    static final class C68394a extends AtomicInteger implements AbstractC68273c {
        private static final long serialVersionUID = -7965400327305809232L;
        final AbstractC68273c downstream;
        int index;
        final SequentialDisposable sd = new SequentialDisposable();
        final AbstractC68293e[] sources;

        @Override // io.reactivex.AbstractC68273c
        public void onComplete() {
            next();
        }

        /* access modifiers changed from: package-private */
        public void next() {
            if (!this.sd.isDisposed() && getAndIncrement() == 0) {
                AbstractC68293e[] eVarArr = this.sources;
                while (!this.sd.isDisposed()) {
                    int i = this.index;
                    this.index = i + 1;
                    if (i == eVarArr.length) {
                        this.downstream.onComplete();
                        return;
                    }
                    eVarArr[i].mo237885a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.AbstractC68273c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC68273c
        public void onSubscribe(Disposable disposable) {
            this.sd.replace(disposable);
        }

        C68394a(AbstractC68273c cVar, AbstractC68293e[] eVarArr) {
            this.downstream = cVar;
            this.sources = eVarArr;
        }
    }

    public C68393a(AbstractC68293e[] eVarArr) {
        this.f171716a = eVarArr;
    }

    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        C68394a aVar = new C68394a(cVar, this.f171716a);
        cVar.onSubscribe(aVar.sd);
        aVar.next();
    }
}
