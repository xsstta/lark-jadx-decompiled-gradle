package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.subscribers.AbstractC68967a;
import io.reactivex.internal.subscribers.AbstractC68968b;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.q */
public final class C68613q<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final AbstractC68322n<? super T> f172070c;

    /* renamed from: io.reactivex.internal.operators.flowable.q$a */
    static final class C68614a<T> extends AbstractC68967a<T, T> {

        /* renamed from: a */
        final AbstractC68322n<? super T> f172071a;

        /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T poll() throws java.lang.Exception {
            /*
                r4 = this;
                io.reactivex.internal.b.g r0 = r4.f172966g
                io.reactivex.functions.n<? super T> r1 = r4.f172071a
            L_0x0004:
                java.lang.Object r2 = r0.poll()
                if (r2 != 0) goto L_0x000c
                r0 = 0
                return r0
            L_0x000c:
                boolean r3 = r1.test(r2)
                if (r3 == 0) goto L_0x0013
                return r2
            L_0x0013:
                int r2 = r4.f172968i
                r3 = 2
                if (r2 != r3) goto L_0x0004
                r2 = 1
                r0.request(r2)
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.C68613q.C68614a.poll():java.lang.Object");
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238688a(i);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!tryOnNext(t)) {
                this.f172965f.request(1);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68364a
        public boolean tryOnNext(T t) {
            if (this.f172967h) {
                return false;
            }
            if (this.f172968i != 0) {
                return this.f172964e.tryOnNext(null);
            }
            try {
                if (!this.f172071a.test(t) || !this.f172964e.tryOnNext(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                mo238689a(th);
                return true;
            }
        }

        C68614a(AbstractC68364a<? super T> aVar, AbstractC68322n<? super T> nVar) {
            super(aVar);
            this.f172071a = nVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.q$b */
    static final class C68615b<T> extends AbstractC68968b<T, T> implements AbstractC68364a<T> {

        /* renamed from: a */
        final AbstractC68322n<? super T> f172072a;

        /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T poll() throws java.lang.Exception {
            /*
                r4 = this;
                io.reactivex.internal.b.g r0 = r4.f172971g
                io.reactivex.functions.n<? super T> r1 = r4.f172072a
            L_0x0004:
                java.lang.Object r2 = r0.poll()
                if (r2 != 0) goto L_0x000c
                r0 = 0
                return r0
            L_0x000c:
                boolean r3 = r1.test(r2)
                if (r3 == 0) goto L_0x0013
                return r2
            L_0x0013:
                int r2 = r4.f172973i
                r3 = 2
                if (r2 != r3) goto L_0x0004
                r2 = 1
                r0.request(r2)
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.C68613q.C68615b.poll():java.lang.Object");
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238692a(i);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!tryOnNext(t)) {
                this.f172970f.request(1);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68364a
        public boolean tryOnNext(T t) {
            if (this.f172972h) {
                return false;
            }
            if (this.f172973i != 0) {
                this.f172969e.onNext(null);
                return true;
            }
            try {
                boolean test = this.f172072a.test(t);
                if (test) {
                    this.f172969e.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                mo238693a(th);
                return true;
            }
        }

        C68615b(AbstractC70021c<? super T> cVar, AbstractC68322n<? super T> nVar) {
            super(cVar);
            this.f172072a = nVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        if (cVar instanceof AbstractC68364a) {
            this.f171934b.mo238000a((AbstractC68325i) new C68614a((AbstractC68364a) cVar, this.f172070c));
        } else {
            this.f171934b.mo238000a((AbstractC68325i) new C68615b(cVar, this.f172070c));
        }
    }

    public C68613q(AbstractC68307f<T> fVar, AbstractC68322n<? super T> nVar) {
        super(fVar);
        this.f172070c = nVar;
    }
}
