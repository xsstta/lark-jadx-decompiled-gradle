package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.subscribers.AbstractC68971e;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68977b;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.g */
public final class C68582g<T, R> extends AbstractC68522a<T, R> {

    /* renamed from: c */
    final Function<? super T, ? extends AbstractC70020b<? extends R>> f172018c;

    /* renamed from: d */
    final int f172019d;

    /* renamed from: e */
    final int f172020e;

    /* renamed from: f */
    final ErrorMode f172021f;

    /* renamed from: io.reactivex.internal.operators.flowable.g$a */
    static final class C68583a<T, R> extends AtomicInteger implements AbstractC68325i<T>, AbstractC68971e<R>, AbstractC70022d {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final AbstractC70021c<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends AbstractC70020b<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final AtomicLong requested = new AtomicLong();
        final C68926b<InnerQueuedSubscriber<R>> subscribers;
        AbstractC70022d upstream;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public void cancelAll() {
            while (true) {
                InnerQueuedSubscriber<R> poll = this.subscribers.poll();
                if (poll != null) {
                    poll.cancel();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drainAndCancel() {
            if (getAndIncrement() == 0) {
                do {
                    cancelAll();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                drainAndCancel();
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC68971e
        public void drain() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber;
            int i;
            long j;
            boolean z;
            AbstractC68373j<R> queue;
            int i2;
            boolean z2;
            if (getAndIncrement() == 0) {
                InnerQueuedSubscriber<R> innerQueuedSubscriber2 = this.current;
                AbstractC70021c<? super R> cVar = this.downstream;
                ErrorMode errorMode2 = this.errorMode;
                int i3 = 1;
                while (true) {
                    long j2 = this.requested.get();
                    if (innerQueuedSubscriber2 != null) {
                        innerQueuedSubscriber = innerQueuedSubscriber2;
                    } else if (errorMode2 == ErrorMode.END || ((Throwable) this.errors.get()) == null) {
                        boolean z3 = this.done;
                        innerQueuedSubscriber = this.subscribers.poll();
                        if (z3 && innerQueuedSubscriber == null) {
                            Throwable terminate = this.errors.terminate();
                            if (terminate != null) {
                                cVar.onError(terminate);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        } else if (innerQueuedSubscriber != null) {
                            this.current = innerQueuedSubscriber;
                        }
                    } else {
                        cancelAll();
                        cVar.onError(this.errors.terminate());
                        return;
                    }
                    if (innerQueuedSubscriber == null || (queue = innerQueuedSubscriber.queue()) == null) {
                        i = i3;
                        j = 0;
                        z = false;
                    } else {
                        i = i3;
                        j = 0;
                        while (true) {
                            i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                            if (i2 == 0) {
                                break;
                            } else if (this.cancelled) {
                                cancelAll();
                                return;
                            } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.errors.get()) == null) {
                                boolean isDone = innerQueuedSubscriber.isDone();
                                try {
                                    R poll = queue.poll();
                                    if (poll == null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (isDone && z2) {
                                        this.current = null;
                                        this.upstream.request(1);
                                        innerQueuedSubscriber = null;
                                        z = true;
                                        break;
                                    } else if (z2) {
                                        break;
                                    } else {
                                        cVar.onNext(poll);
                                        j++;
                                        innerQueuedSubscriber.requestOne();
                                    }
                                } catch (Throwable th) {
                                    C68306a.m265071b(th);
                                    this.current = null;
                                    innerQueuedSubscriber.cancel();
                                    cancelAll();
                                    cVar.onError(th);
                                    return;
                                }
                            } else {
                                this.current = null;
                                innerQueuedSubscriber.cancel();
                                cancelAll();
                                cVar.onError(this.errors.terminate());
                                return;
                            }
                        }
                        z = false;
                        if (i2 == 0) {
                            if (this.cancelled) {
                                cancelAll();
                                return;
                            } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.errors.get()) == null) {
                                boolean isDone2 = innerQueuedSubscriber.isDone();
                                boolean isEmpty = queue.isEmpty();
                                if (isDone2 && isEmpty) {
                                    this.current = null;
                                    this.upstream.request(1);
                                    innerQueuedSubscriber = null;
                                    z = true;
                                }
                            } else {
                                this.current = null;
                                innerQueuedSubscriber.cancel();
                                cancelAll();
                                cVar.onError(this.errors.terminate());
                                return;
                            }
                        }
                    }
                    if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                        this.requested.addAndGet(-j);
                    }
                    if (z) {
                        innerQueuedSubscriber2 = innerQueuedSubscriber;
                        i3 = i;
                    } else {
                        i3 = addAndGet(-i);
                        if (i3 != 0) {
                            innerQueuedSubscriber2 = innerQueuedSubscriber;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC68971e
        public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            try {
                AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null Publisher");
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.prefetch);
                if (!this.cancelled) {
                    this.subscribers.offer(innerQueuedSubscriber);
                    bVar.subscribe(innerQueuedSubscriber);
                    if (this.cancelled) {
                        innerQueuedSubscriber.cancel();
                        drainAndCancel();
                    }
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            long j;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    j = Long.MAX_VALUE;
                } else {
                    j = (long) i;
                }
                dVar.request(j);
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC68971e
        public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (this.errors.addThrowable(th)) {
                innerQueuedSubscriber.setDone();
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.AbstractC68971e
        public void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
            if (innerQueuedSubscriber.queue().offer(r)) {
                drain();
                return;
            }
            innerQueuedSubscriber.cancel();
            innerError(innerQueuedSubscriber, new MissingBackpressureException());
        }

        C68583a(AbstractC70021c<? super R> cVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i, int i2, ErrorMode errorMode2) {
            this.downstream = cVar;
            this.mapper = function;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode2;
            this.subscribers = new C68926b<>(Math.min(i2, i));
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super R> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68583a(cVar, this.f172018c, this.f172019d, this.f172020e, this.f172021f));
    }

    public C68582g(AbstractC68307f<T> fVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i, int i2, ErrorMode errorMode) {
        super(fVar);
        this.f172018c = function;
        this.f172019d = i;
        this.f172020e = i2;
        this.f172021f = errorMode;
    }
}
