package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.p3459a.C68362b;
import java.util.Iterator;

/* renamed from: io.reactivex.internal.operators.c.z */
public final class C68517z<T, R> extends Observable<R> {

    /* renamed from: a */
    final AbstractC69015w<T> f171925a;

    /* renamed from: b */
    final Function<? super T, ? extends Iterable<? extends R>> f171926b;

    /* renamed from: io.reactivex.internal.operators.c.z$a */
    static final class C68518a<T, R> extends BasicIntQueueDisposable<R> implements AbstractC69012t<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final AbstractC69009q<? super R> downstream;
        volatile Iterator<? extends R> it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        Disposable upstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.it = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            if (this.it == null) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public R poll() throws Exception {
            Iterator<? extends R> it2 = this.it;
            if (it2 == null) {
                return null;
            }
            R r = (R) C68362b.m265229a(it2.next(), "The iterator returned a null value");
            if (!it2.hasNext()) {
                this.it = null;
            }
            return r;
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            AbstractC69009q<? super R> qVar = this.downstream;
            try {
                Iterator<T> it2 = ((Iterable) this.mapper.apply(t)).iterator();
                if (!it2.hasNext()) {
                    qVar.onComplete();
                } else if (this.outputFused) {
                    this.it = it2;
                    qVar.onNext(null);
                    qVar.onComplete();
                } else {
                    while (!this.cancelled) {
                        try {
                            qVar.onNext(it2.next());
                            if (!this.cancelled) {
                                try {
                                    if (!it2.hasNext()) {
                                        qVar.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C68306a.m265071b(th);
                                    qVar.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C68306a.m265071b(th2);
                            qVar.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                C68306a.m265071b(th3);
                this.downstream.onError(th3);
            }
        }

        C68518a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = qVar;
            this.mapper = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        this.f171925a.subscribe(new C68518a(qVar, this.f171926b));
    }

    public C68517z(AbstractC69015w<T> wVar, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f171925a = wVar;
        this.f171926b = function;
    }
}
