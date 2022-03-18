package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.AbstractC68313e;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68977b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.i */
public final class C68585i<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final AbstractC68324h<T> f172026b;

    /* renamed from: c */
    final BackpressureStrategy f172027c;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.i$a */
    public static abstract class AbstractC68587a<T> extends AtomicLong implements AbstractC68323g<T>, AbstractC70022d {
        private static final long serialVersionUID = 7326289992464377023L;
        final AbstractC70021c<? super T> downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        /* access modifiers changed from: package-private */
        public void onRequested() {
        }

        /* access modifiers changed from: package-private */
        public void onUnsubscribed() {
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.AbstractC68323g
        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }

        public final long requested() {
            return get();
        }

        public final AbstractC68323g<T> serialize() {
            return new C68594h(this);
        }

        @Override // org.p3511d.AbstractC70022d
        public final void cancel() {
            this.serial.dispose();
            onUnsubscribed();
        }

        /* access modifiers changed from: protected */
        public void complete() {
            if (!isCancelled()) {
                try {
                    this.downstream.onComplete();
                } finally {
                    this.serial.dispose();
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        public final void setDisposable(Disposable disposable) {
            this.serial.update(disposable);
        }

        public boolean tryOnError(Throwable th) {
            return error(th);
        }

        AbstractC68587a(AbstractC70021c<? super T> cVar) {
            this.downstream = cVar;
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this, j);
                onRequested();
            }
        }

        @Override // io.reactivex.AbstractC68323g
        public final void setCancellable(AbstractC68313e eVar) {
            setDisposable(new CancellableDisposable(eVar));
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public boolean error(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                this.serial.dispose();
                return true;
            } catch (Throwable th2) {
                this.serial.dispose();
                throw th2;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$b */
    static final class C68588b<T> extends AbstractC68587a<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final C68926b<T> queue;
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public void onRequested() {
            drain();
        }

        @Override // io.reactivex.Emitter, io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public void onComplete() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            int i;
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                AbstractC70021c cVar = this.downstream;
                C68926b<T> bVar = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            bVar.clear();
                            return;
                        } else {
                            boolean z2 = this.done;
                            T poll = bVar.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                Throwable th = this.error;
                                if (th != null) {
                                    error(th);
                                    return;
                                } else {
                                    complete();
                                    return;
                                }
                            } else if (z) {
                                break;
                            } else {
                                cVar.onNext(poll);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            bVar.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = bVar.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                error(th2);
                                return;
                            } else {
                                complete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C68977b.m265549b(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.offer(t);
                drain();
            }
        }

        C68588b(AbstractC70021c<? super T> cVar, int i) {
            super(cVar);
            this.queue = new C68926b<>(i);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$e */
    static final class C68591e<T> extends AbstractC68587a<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public void onRequested() {
            drain();
        }

        @Override // io.reactivex.Emitter, io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public void onComplete() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            int i;
            boolean z2;
            if (this.wip.getAndIncrement() == 0) {
                AbstractC70021c cVar = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z3 = this.done;
                            T andSet = atomicReference.getAndSet(null);
                            if (andSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z3 && z2) {
                                Throwable th = this.error;
                                if (th != null) {
                                    error(th);
                                    return;
                                } else {
                                    complete();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                cVar.onNext(andSet);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                error(th2);
                                return;
                            } else {
                                complete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C68977b.m265549b(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        C68591e(AbstractC70021c<? super T> cVar) {
            super(cVar);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.set(t);
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68587a
        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$h */
    static final class C68594h<T> extends AtomicInteger implements AbstractC68323g<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final AbstractC68587a<T> emitter;
        final AtomicThrowable error = new AtomicThrowable();
        final AbstractC68372i<T> queue = new C68926b(16);

        public AbstractC68323g<T> serialize() {
            return this;
        }

        @Override // io.reactivex.AbstractC68323g
        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }

        public long requested() {
            return this.emitter.requested();
        }

        public String toString() {
            return this.emitter.toString();
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (!this.emitter.isCancelled() && !this.done) {
                this.done = true;
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public void drainLoop() {
            boolean z;
            AbstractC68587a<T> aVar = this.emitter;
            AbstractC68372i<T> iVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int i = 1;
            while (!aVar.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    iVar.clear();
                    aVar.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z2 = this.done;
                T poll = iVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    aVar.onComplete();
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    aVar.onNext(poll);
                }
            }
            iVar.clear();
        }

        @Override // io.reactivex.AbstractC68323g
        public void setCancellable(AbstractC68313e eVar) {
            this.emitter.setCancellable(eVar);
        }

        public void setDisposable(Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                RxJavaPlugins.onError(th);
            }
        }

        C68594h(AbstractC68587a<T> aVar) {
            this.emitter = aVar;
        }

        public boolean tryOnError(Throwable th) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    AbstractC68372i<T> iVar = this.queue;
                    synchronized (iVar) {
                        iVar.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.emitter.onNext(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$d */
    static final class C68590d<T> extends AbstractC68593g<T> {
        private static final long serialVersionUID = 338953216916120960L;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68593g
        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }

        C68590d(AbstractC70021c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$1 */
    static /* synthetic */ class C685861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f172028a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.flowable.C68585i.C685861.f172028a = r0
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = io.reactivex.internal.operators.flowable.C68585i.C685861.f172028a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = io.reactivex.internal.operators.flowable.C68585i.C685861.f172028a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = io.reactivex.internal.operators.flowable.C68585i.C685861.f172028a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.C68585i.C685861.<clinit>():void");
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$c */
    static final class C68589c<T> extends AbstractC68593g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68585i.AbstractC68593g
        public void onOverflow() {
        }

        C68589c(AbstractC70021c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$f */
    static final class C68592f<T> extends AbstractC68587a<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        C68592f(AbstractC70021c<? super T> cVar) {
            super(cVar);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            long j;
            if (!isCancelled()) {
                if (t != null) {
                    this.downstream.onNext(t);
                    do {
                        j = get();
                        if (j == 0) {
                            return;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$g */
    static abstract class AbstractC68593g<T> extends AbstractC68587a<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        /* access modifiers changed from: package-private */
        public abstract void onOverflow();

        AbstractC68593g(AbstractC70021c<? super T> cVar) {
            super(cVar);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.downstream.onNext(t);
                    C68977b.m265549b(this, 1);
                } else {
                    onOverflow();
                }
            }
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        AbstractC68587a aVar;
        int i = C685861.f172028a[this.f172027c.ordinal()];
        if (i == 1) {
            aVar = new C68592f(cVar);
        } else if (i == 2) {
            aVar = new C68590d(cVar);
        } else if (i == 3) {
            aVar = new C68589c(cVar);
        } else if (i != 4) {
            aVar = new C68588b(cVar, m265072a());
        } else {
            aVar = new C68591e(cVar);
        }
        cVar.onSubscribe(aVar);
        try {
            this.f172026b.subscribe(aVar);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            aVar.onError(th);
        }
    }

    public C68585i(AbstractC68324h<T> hVar, BackpressureStrategy backpressureStrategy) {
        this.f172026b = hVar;
        this.f172027c = backpressureStrategy;
    }
}
