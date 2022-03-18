package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.p3452a.AbstractC68261b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class FlowableGroupBy<T, K, V> extends AbstractC68522a<T, AbstractC68261b<K, V>> {

    /* renamed from: c */
    final Function<? super T, ? extends K> f171927c;

    /* renamed from: d */
    final Function<? super T, ? extends V> f171928d;

    /* renamed from: e */
    final int f171929e;

    /* renamed from: f */
    final boolean f171930f;

    /* renamed from: g */
    final Function<? super Consumer<Object>, ? extends Map<K, Object>> f171931g;

    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<AbstractC68261b<K, V>> implements AbstractC68325i<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        boolean done;
        final AbstractC70021c<? super AbstractC68261b<K, V>> downstream;
        Throwable error;
        final Queue<C68520b<K, V>> evictedGroups;
        volatile boolean finished;
        final AtomicInteger groupCount = new AtomicInteger(1);
        final Map<Object, C68520b<K, V>> groups;
        final Function<? super T, ? extends K> keySelector;
        boolean outputFused;
        final C68926b<AbstractC68261b<K, V>> queue;
        final AtomicLong requested = new AtomicLong();
        AbstractC70022d upstream;
        final Function<? super T, ? extends V> valueSelector;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public AbstractC68261b<K, V> poll() {
            return this.queue.poll();
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i = 0;
                while (true) {
                    C68520b<K, V> poll = this.evictedGroups.poll();
                    if (poll == null) {
                        break;
                    }
                    poll.mo238206l();
                    i++;
                }
                if (i != 0) {
                    this.groupCount.addAndGet(-i);
                }
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                if (this.outputFused) {
                    drainFused();
                } else {
                    drainNormal();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drainFused() {
            Throwable th;
            C68926b<AbstractC68261b<K, V>> bVar = this.queue;
            AbstractC70021c<? super AbstractC68261b<K, V>> cVar = this.downstream;
            int i = 1;
            while (!this.cancelled.get()) {
                boolean z = this.finished;
                if (!z || this.delayError || (th = this.error) == null) {
                    cVar.onNext(null);
                    if (z) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            cVar.onError(th2);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    bVar.clear();
                    cVar.onError(th);
                    return;
                }
            }
            bVar.clear();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.done) {
                for (C68520b<K, V> bVar : this.groups.values()) {
                    bVar.mo238206l();
                }
                this.groups.clear();
                Queue<C68520b<K, V>> queue2 = this.evictedGroups;
                if (queue2 != null) {
                    queue2.clear();
                }
                this.done = true;
                this.finished = true;
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public void drainNormal() {
            int i;
            boolean z;
            C68926b<AbstractC68261b<K, V>> bVar = this.queue;
            AbstractC70021c<? super AbstractC68261b<K, V>> cVar = this.downstream;
            int i2 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.finished;
                    AbstractC68261b<K, V> poll = bVar.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!checkTerminated(z2, z, cVar, bVar)) {
                        if (z) {
                            break;
                        }
                        cVar.onNext(poll);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.finished, bVar.isEmpty(), cVar, bVar)) {
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                        this.upstream.request(j2);
                    }
                    i2 = addAndGet(-i2);
                } else {
                    return;
                }
            } while (i2 != 0);
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
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

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request((long) this.bufferSize);
            }
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) NULL_KEY;
            }
            this.groups.remove(k);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            for (C68520b<K, V> bVar : this.groups.values()) {
                bVar.mo238204b(th);
            }
            this.groups.clear();
            Queue<C68520b<K, V>> queue2 = this.evictedGroups;
            if (queue2 != null) {
                queue2.clear();
            }
            this.error = th;
            this.finished = true;
            drain();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: io.reactivex.internal.operators.flowable.FlowableGroupBy$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            Object obj;
            if (!this.done) {
                C68926b<AbstractC68261b<K, V>> bVar = this.queue;
                try {
                    Object apply = this.keySelector.apply(t);
                    boolean z = false;
                    if (apply != null) {
                        obj = apply;
                    } else {
                        obj = NULL_KEY;
                    }
                    C68520b<K, V> bVar2 = this.groups.get(obj);
                    if (bVar2 == null) {
                        if (!this.cancelled.get()) {
                            bVar2 = C68520b.m265291a(apply, this.bufferSize, this, this.delayError);
                            this.groups.put(obj, bVar2);
                            this.groupCount.getAndIncrement();
                            z = true;
                        } else {
                            return;
                        }
                    }
                    try {
                        bVar2.mo238205c(C68362b.m265229a(this.valueSelector.apply(t), "The valueSelector returned null"));
                        completeEvictions();
                        if (z) {
                            bVar.offer(bVar2);
                            drain();
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.upstream.cancel();
                        onError(th);
                    }
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminated(boolean z, boolean z2, AbstractC70021c<?> cVar, C68926b<?> bVar) {
            if (this.cancelled.get()) {
                bVar.clear();
                return true;
            } else if (this.delayError) {
                if (!z || !z2) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th2 = this.error;
                if (th2 != null) {
                    bVar.clear();
                    cVar.onError(th2);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    cVar.onComplete();
                    return true;
                }
            }
        }

        public GroupBySubscriber(AbstractC70021c<? super AbstractC68261b<K, V>> cVar, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i, boolean z, Map<Object, C68520b<K, V>> map, Queue<C68520b<K, V>> queue2) {
            this.downstream = cVar;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i;
            this.delayError = z;
            this.groups = map;
            this.evictedGroups = queue2;
            this.queue = new C68926b<>(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$b */
    public static final class C68520b<K, T> extends AbstractC68261b<K, T> {

        /* renamed from: c */
        final C68521c<T, K> f171933c;

        /* renamed from: l */
        public void mo238206l() {
            this.f171933c.onComplete();
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.AbstractC68307f
        /* renamed from: a */
        public void mo237905a(AbstractC70021c<? super T> cVar) {
            this.f171933c.subscribe(cVar);
        }

        /* renamed from: b */
        public void mo238204b(Throwable th) {
            this.f171933c.onError(th);
        }

        /* renamed from: c */
        public void mo238205c(T t) {
            this.f171933c.onNext(t);
        }

        protected C68520b(K k, C68521c<T, K> cVar) {
            super(k);
            this.f171933c = cVar;
        }

        /* renamed from: a */
        public static <T, K> C68520b<K, T> m265291a(K k, int i, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
            return new C68520b<>(k, new C68521c(i, groupBySubscriber, k, z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$c */
    public static final class C68521c<T, K> extends BasicIntQueueSubscription<T> implements AbstractC70020b<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final AtomicReference<AbstractC70021c<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final AtomicBoolean once = new AtomicBoolean();
        boolean outputFused;
        final GroupBySubscriber<?, K, T> parent;
        int produced;
        final C68926b<T> queue;
        final AtomicLong requested = new AtomicLong();

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                this.parent.cancel(this.key);
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                if (this.outputFused) {
                    drainFused();
                } else {
                    drainNormal();
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() {
            T poll = this.queue.poll();
            if (poll != null) {
                this.produced++;
                return poll;
            }
            int i = this.produced;
            if (i == 0) {
                return null;
            }
            this.produced = 0;
            this.parent.upstream.request((long) i);
            return null;
        }

        /* access modifiers changed from: package-private */
        public void drainFused() {
            Throwable th;
            C68926b<T> bVar = this.queue;
            AbstractC70021c<? super T> cVar = this.actual.get();
            int i = 1;
            while (true) {
                if (cVar != null) {
                    if (this.cancelled.get()) {
                        bVar.clear();
                        return;
                    }
                    boolean z = this.done;
                    if (!z || this.delayError || (th = this.error) == null) {
                        cVar.onNext(null);
                        if (z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                cVar.onError(th2);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        }
                    } else {
                        bVar.clear();
                        cVar.onError(th);
                        return;
                    }
                }
                i = addAndGet(-i);
                if (i != 0) {
                    if (cVar == null) {
                        cVar = this.actual.get();
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drainNormal() {
            int i;
            boolean z;
            C68926b<T> bVar = this.queue;
            boolean z2 = this.delayError;
            AbstractC70021c<? super T> cVar = this.actual.get();
            int i2 = 1;
            while (true) {
                if (cVar != null) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z3 = this.done;
                        T poll = bVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z3, z, cVar, z2)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i == 0 && checkTerminated(this.done, bVar.isEmpty(), cVar, z2)) {
                        return;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                        this.parent.upstream.request(j2);
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 != 0) {
                    if (cVar == null) {
                        cVar = this.actual.get();
                    }
                } else {
                    return;
                }
            }
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
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

        @Override // org.p3511d.AbstractC70020b
        public void subscribe(AbstractC70021c<? super T> cVar) {
            if (this.once.compareAndSet(false, true)) {
                cVar.onSubscribe(this);
                this.actual.lazySet(cVar);
                drain();
                return;
            }
            EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), cVar);
        }

        C68521c(int i, GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.queue = new C68926b<>(i);
            this.parent = groupBySubscriber;
            this.key = k;
            this.delayError = z;
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminated(boolean z, boolean z2, AbstractC70021c<? super T> cVar, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$a */
    static final class C68519a<K, V> implements Consumer<C68520b<K, V>> {

        /* renamed from: a */
        final Queue<C68520b<K, V>> f171932a;

        C68519a(Queue<C68520b<K, V>> queue) {
            this.f171932a = queue;
        }

        /* renamed from: a */
        public void accept(C68520b<K, V> bVar) {
            this.f171932a.offer(bVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super AbstractC68261b<K, V>> cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map map;
        try {
            if (this.f171931g == null) {
                concurrentLinkedQueue = null;
                map = new ConcurrentHashMap();
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                map = (Map) this.f171931g.apply(new C68519a(concurrentLinkedQueue));
            }
            this.f171934b.mo238000a((AbstractC68325i) new GroupBySubscriber(cVar, this.f171927c, this.f171928d, this.f171929e, this.f171930f, map, concurrentLinkedQueue));
        } catch (Exception e) {
            C68306a.m265071b(e);
            cVar.onSubscribe(EmptyComponent.INSTANCE);
            cVar.onError(e);
        }
    }
}
