package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.subscribers.AbstractC68967a;
import io.reactivex.internal.subscribers.AbstractC68968b;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.ab */
public final class C68524ab<T, U> extends AbstractC68522a<T, U> {

    /* renamed from: c */
    final Function<? super T, ? extends U> f171936c;

    /* renamed from: io.reactivex.internal.operators.flowable.ab$a */
    static final class C68525a<T, U> extends AbstractC68967a<T, U> {

        /* renamed from: a */
        final Function<? super T, ? extends U> f171937a;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public U poll() throws Exception {
            Object poll = this.f172966g.poll();
            if (poll != null) {
                return (U) C68362b.m265229a(this.f171937a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238688a(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: io.reactivex.internal.b.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.p3460b.AbstractC68364a
        public boolean tryOnNext(T t) {
            if (this.f172967h) {
                return false;
            }
            try {
                return this.f172964e.tryOnNext(C68362b.m265229a(this.f171937a.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo238689a(th);
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: io.reactivex.internal.b.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f172967h) {
                if (this.f172968i != 0) {
                    this.f172964e.onNext(null);
                    return;
                }
                try {
                    this.f172964e.onNext(C68362b.m265229a(this.f171937a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo238689a(th);
                }
            }
        }

        C68525a(AbstractC68364a<? super U> aVar, Function<? super T, ? extends U> function) {
            super(aVar);
            this.f171937a = function;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.ab$b */
    static final class C68526b<T, U> extends AbstractC68968b<T, U> {

        /* renamed from: a */
        final Function<? super T, ? extends U> f171938a;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public U poll() throws Exception {
            Object poll = this.f172971g.poll();
            if (poll != null) {
                return (U) C68362b.m265229a(this.f171938a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238692a(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: org.d.c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f172972h) {
                if (this.f172973i != 0) {
                    this.f172969e.onNext(null);
                    return;
                }
                try {
                    this.f172969e.onNext(C68362b.m265229a(this.f171938a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo238693a(th);
                }
            }
        }

        C68526b(AbstractC70021c<? super U> cVar, Function<? super T, ? extends U> function) {
            super(cVar);
            this.f171938a = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super U> cVar) {
        if (cVar instanceof AbstractC68364a) {
            this.f171934b.mo238000a((AbstractC68325i) new C68525a((AbstractC68364a) cVar, this.f171936c));
        } else {
            this.f171934b.mo238000a((AbstractC68325i) new C68526b(cVar, this.f171936c));
        }
    }

    public C68524ab(AbstractC68307f<T> fVar, Function<? super T, ? extends U> function) {
        super(fVar);
        this.f171936c = function;
    }
}
