package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class cg extends Observable<Integer> {

    /* renamed from: a */
    private final int f172399a;

    /* renamed from: b */
    private final long f172400b;

    /* renamed from: io.reactivex.internal.operators.observable.cg$a */
    static final class C68752a extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final AbstractC69009q<? super Integer> downstream;
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
        public Integer poll() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.fused) {
                AbstractC69009q<? super Integer> qVar = this.downstream;
                long j = this.end;
                for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                    qVar.onNext(Integer.valueOf((int) j2));
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

        C68752a(AbstractC69009q<? super Integer> qVar, long j, long j2) {
            this.downstream = qVar;
            this.index = j;
            this.end = j2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Integer> qVar) {
        C68752a aVar = new C68752a(qVar, (long) this.f172399a, this.f172400b);
        qVar.onSubscribe(aVar);
        aVar.run();
    }

    public cg(int i, int i2) {
        this.f172399a = i;
        this.f172400b = ((long) i) + ((long) i2);
    }
}
