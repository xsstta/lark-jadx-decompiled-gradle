package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.subscribers.AbstractC68967a;
import io.reactivex.internal.subscribers.AbstractC68968b;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.m */
public final class C68606m<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final Consumer<? super T> f172048c;

    /* renamed from: d */
    final Consumer<? super Throwable> f172049d;

    /* renamed from: e */
    final AbstractC68309a f172050e;

    /* renamed from: f */
    final AbstractC68309a f172051f;

    /* renamed from: io.reactivex.internal.operators.flowable.m$a */
    static final class C68607a<T> extends AbstractC68967a<T, T> {

        /* renamed from: a */
        final Consumer<? super T> f172052a;

        /* renamed from: b */
        final Consumer<? super Throwable> f172053b;

        /* renamed from: c */
        final AbstractC68309a f172054c;

        /* renamed from: d */
        final AbstractC68309a f172055d;

        @Override // org.p3511d.AbstractC70021c, io.reactivex.internal.subscribers.AbstractC68967a
        public void onComplete() {
            if (!this.f172967h) {
                try {
                    this.f172054c.run();
                    this.f172967h = true;
                    this.f172964e.onComplete();
                    try {
                        this.f172055d.run();
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        RxJavaPlugins.onError(th);
                    }
                } catch (Throwable th2) {
                    mo238689a(th2);
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            try {
                T t = (T) this.f172966g.poll();
                if (t != null) {
                    try {
                        this.f172052a.accept(t);
                        this.f172055d.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f172968i == 1) {
                    this.f172054c.run();
                    this.f172055d.run();
                }
                return t;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238688a(i);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f172967h) {
                if (this.f172968i != 0) {
                    this.f172964e.onNext(null);
                    return;
                }
                try {
                    this.f172052a.accept(t);
                    this.f172964e.onNext(t);
                } catch (Throwable th) {
                    mo238689a(th);
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68364a
        public boolean tryOnNext(T t) {
            if (this.f172967h) {
                return false;
            }
            try {
                this.f172052a.accept(t);
                return this.f172964e.tryOnNext(t);
            } catch (Throwable th) {
                mo238689a(th);
                return false;
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.internal.subscribers.AbstractC68967a
        public void onError(Throwable th) {
            if (this.f172967h) {
                RxJavaPlugins.onError(th);
                return;
            }
            boolean z = true;
            this.f172967h = true;
            try {
                this.f172053b.accept(th);
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.f172964e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f172964e.onError(th);
            }
            try {
                this.f172055d.run();
            } catch (Throwable th3) {
                C68306a.m265071b(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        C68607a(AbstractC68364a<? super T> aVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar2, AbstractC68309a aVar3) {
            super(aVar);
            this.f172052a = consumer;
            this.f172053b = consumer2;
            this.f172054c = aVar2;
            this.f172055d = aVar3;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.m$b */
    static final class C68608b<T> extends AbstractC68968b<T, T> {

        /* renamed from: a */
        final Consumer<? super T> f172056a;

        /* renamed from: b */
        final Consumer<? super Throwable> f172057b;

        /* renamed from: c */
        final AbstractC68309a f172058c;

        /* renamed from: d */
        final AbstractC68309a f172059d;

        @Override // org.p3511d.AbstractC70021c, io.reactivex.internal.subscribers.AbstractC68968b
        public void onComplete() {
            if (!this.f172972h) {
                try {
                    this.f172058c.run();
                    this.f172972h = true;
                    this.f172969e.onComplete();
                    try {
                        this.f172059d.run();
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        RxJavaPlugins.onError(th);
                    }
                } catch (Throwable th2) {
                    mo238693a(th2);
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            try {
                T t = (T) this.f172971g.poll();
                if (t != null) {
                    try {
                        this.f172056a.accept(t);
                        this.f172059d.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f172973i == 1) {
                    this.f172058c.run();
                    this.f172059d.run();
                }
                return t;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238692a(i);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f172972h) {
                if (this.f172973i != 0) {
                    this.f172969e.onNext(null);
                    return;
                }
                try {
                    this.f172056a.accept(t);
                    this.f172969e.onNext(t);
                } catch (Throwable th) {
                    mo238693a(th);
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.internal.subscribers.AbstractC68968b
        public void onError(Throwable th) {
            if (this.f172972h) {
                RxJavaPlugins.onError(th);
                return;
            }
            boolean z = true;
            this.f172972h = true;
            try {
                this.f172057b.accept(th);
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.f172969e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f172969e.onError(th);
            }
            try {
                this.f172059d.run();
            } catch (Throwable th3) {
                C68306a.m265071b(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        C68608b(AbstractC70021c<? super T> cVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2) {
            super(cVar);
            this.f172056a = consumer;
            this.f172057b = consumer2;
            this.f172058c = aVar;
            this.f172059d = aVar2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        if (cVar instanceof AbstractC68364a) {
            this.f171934b.mo238000a((AbstractC68325i) new C68607a((AbstractC68364a) cVar, this.f172048c, this.f172049d, this.f172050e, this.f172051f));
        } else {
            this.f171934b.mo238000a((AbstractC68325i) new C68608b(cVar, this.f172048c, this.f172049d, this.f172050e, this.f172051f));
        }
    }

    public C68606m(AbstractC68307f<T> fVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2) {
        super(fVar);
        this.f172048c = consumer;
        this.f172049d = consumer2;
        this.f172050e = aVar;
        this.f172051f = aVar2;
    }
}
