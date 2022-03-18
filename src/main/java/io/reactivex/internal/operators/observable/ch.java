package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class ch extends Observable<Long> {

    /* renamed from: a */
    private final long f172401a;

    /* renamed from: b */
    private final long f172402b;

    /* renamed from: io.reactivex.internal.operators.observable.ch$a */
    static final class C68753a extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final AbstractC69009q<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            if (this.index == this.end) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public Long poll() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.fused) {
                AbstractC69009q<? super Long> qVar = this.downstream;
                long j = this.end;
                for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                    qVar.onNext(Long.valueOf(j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    qVar.onComplete();
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        C68753a(AbstractC69009q<? super Long> qVar, long j, long j2) {
            this.downstream = qVar;
            this.index = j;
            this.end = j2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Long> qVar) {
        long j = this.f172401a;
        C68753a aVar = new C68753a(qVar, j, j + this.f172402b);
        qVar.onSubscribe(aVar);
        aVar.run();
    }

    public ch(long j, long j2) {
        this.f172401a = j;
        this.f172402b = j2;
    }
}
