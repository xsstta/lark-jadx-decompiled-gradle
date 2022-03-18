package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.AbstractC68376c;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.C68981f;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.p3454b.AbstractC68271a;
import io.reactivex.p3456d.C68288b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class cp<T> extends AbstractC68271a<T> implements AbstractC68376c {

    /* renamed from: e */
    static final AbstractC68763b f172429e = new C68776o();

    /* renamed from: a */
    final ObservableSource<T> f172430a;

    /* renamed from: b */
    final AtomicReference<C68771j<T>> f172431b;

    /* renamed from: c */
    final AbstractC68763b<T> f172432c;

    /* renamed from: d */
    final ObservableSource<T> f172433d;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$b */
    public interface AbstractC68763b<T> {
        /* renamed from: a */
        AbstractC68769h<T> mo238454a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$h */
    public interface AbstractC68769h<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(C68765d<T> dVar);
    }

    /* renamed from: io.reactivex.internal.operators.observable.cp$a */
    static abstract class AbstractC68762a<T> extends AtomicReference<C68767f> implements AbstractC68769h<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        C68767f tail;

        /* access modifiers changed from: package-private */
        public Object enterTransform(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public Object leaveTransform(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public abstract void truncate();

        /* access modifiers changed from: package-private */
        public void truncateFinal() {
            trimHead();
        }

        /* access modifiers changed from: package-private */
        public C68767f getHead() {
            return (C68767f) get();
        }

        AbstractC68762a() {
            C68767f fVar = new C68767f(null);
            this.tail = fVar;
            set(fVar);
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public final void complete() {
            addLast(new C68767f(enterTransform(NotificationLite.complete())));
            truncateFinal();
        }

        /* access modifiers changed from: package-private */
        public boolean hasCompleted() {
            if (this.tail.value == null || !NotificationLite.isComplete(leaveTransform(this.tail.value))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean hasError() {
            if (this.tail.value == null || !NotificationLite.isError(leaveTransform(this.tail.value))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void removeFirst() {
            this.size--;
            setFirst((C68767f) ((C68767f) get()).get());
        }

        /* access modifiers changed from: package-private */
        public final void trimHead() {
            C68767f fVar = (C68767f) get();
            if (fVar.value != null) {
                C68767f fVar2 = new C68767f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void setFirst(C68767f fVar) {
            set(fVar);
        }

        /* access modifiers changed from: package-private */
        public final void addLast(C68767f fVar) {
            this.tail.set(fVar);
            this.tail = fVar;
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public final void error(Throwable th) {
            addLast(new C68767f(enterTransform(NotificationLite.error(th))));
            truncateFinal();
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public final void next(T t) {
            addLast(new C68767f(enterTransform(NotificationLite.next(t))));
            truncate();
        }

        /* access modifiers changed from: package-private */
        public final void removeSome(int i) {
            C68767f fVar = (C68767f) get();
            while (i > 0) {
                fVar = (C68767f) fVar.get();
                i--;
                this.size--;
            }
            setFirst(fVar);
        }

        /* access modifiers changed from: package-private */
        public final void collect(Collection<? super T> collection) {
            C68767f head = getHead();
            while (true) {
                head = (C68767f) head.get();
                if (head != null) {
                    Object leaveTransform = leaveTransform(head.value);
                    if (!NotificationLite.isComplete(leaveTransform) && !NotificationLite.isError(leaveTransform)) {
                        collection.add((Object) NotificationLite.getValue(leaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public final void replay(C68765d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    C68767f fVar = (C68767f) dVar.index();
                    if (fVar == null) {
                        fVar = getHead();
                        dVar.index = fVar;
                    }
                    while (!dVar.isDisposed()) {
                        C68767f fVar2 = (C68767f) fVar.get();
                        if (fVar2 == null) {
                            dVar.index = fVar;
                            i = dVar.addAndGet(-i);
                        } else if (NotificationLite.accept(leaveTransform(fVar2.value), dVar.child)) {
                            dVar.index = null;
                            return;
                        } else {
                            fVar = fVar2;
                        }
                    }
                    return;
                } while (i != 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$d */
    public static final class C68765d<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final AbstractC69009q<? super T> child;
        Object index;
        final C68771j<T> parent;

        /* access modifiers changed from: package-private */
        public <U> U index() {
            return (U) this.index;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.parent.remove(this);
            }
        }

        C68765d(C68771j<T> jVar, AbstractC69009q<? super T> qVar) {
            this.parent = jVar;
            this.child = qVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cp$o */
    static final class C68776o implements AbstractC68763b<Object> {
        C68776o() {
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68763b
        /* renamed from: a */
        public AbstractC68769h<Object> mo238454a() {
            return new C68777p(16);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$i */
    public static final class C68770i<T> implements AbstractC68763b<T> {

        /* renamed from: a */
        private final int f172439a;

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68763b
        /* renamed from: a */
        public AbstractC68769h<T> mo238454a() {
            return new C68775n(this.f172439a);
        }

        C68770i(int i) {
            this.f172439a = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cp$j */
    static final class C68771j<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T> {
        static final C68765d[] EMPTY = new C68765d[0];
        static final C68765d[] TERMINATED = new C68765d[0];
        private static final long serialVersionUID = -533785617179540163L;
        final AbstractC68769h<T> buffer;
        boolean done;
        final AtomicReference<C68765d[]> observers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.observers.set(TERMINATED);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.observers.get() == TERMINATED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.complete();
                replayFinal();
            }
        }

        /* access modifiers changed from: package-private */
        public void replay() {
            for (C68765d<T> dVar : this.observers.get()) {
                this.buffer.replay(dVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void replayFinal() {
            for (C68765d<T> dVar : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(dVar);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.done) {
                this.buffer.next(t);
                replay();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                replay();
            }
        }

        C68771j(AbstractC68769h<T> hVar) {
            this.buffer = hVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th);
                replayFinal();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public boolean add(C68765d<T> dVar) {
            C68765d[] dVarArr;
            C68765d[] dVarArr2;
            do {
                dVarArr = this.observers.get();
                if (dVarArr == TERMINATED) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new C68765d[(length + 1)];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!this.observers.compareAndSet(dVarArr, dVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        public void remove(C68765d<T> dVar) {
            C68765d[] dVarArr;
            C68765d[] dVarArr2;
            do {
                dVarArr = this.observers.get();
                int length = dVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (dVarArr[i2].equals(dVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            dVarArr2 = EMPTY;
                        } else {
                            C68765d[] dVarArr3 = new C68765d[(length - 1)];
                            System.arraycopy(dVarArr, 0, dVarArr3, 0, i);
                            System.arraycopy(dVarArr, i + 1, dVarArr3, i, (length - i) - 1);
                            dVarArr2 = dVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(dVarArr, dVarArr2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$l */
    public static final class C68773l<T> implements AbstractC68763b<T> {

        /* renamed from: a */
        private final int f172442a;

        /* renamed from: b */
        private final long f172443b;

        /* renamed from: c */
        private final TimeUnit f172444c;

        /* renamed from: d */
        private final Scheduler f172445d;

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68763b
        /* renamed from: a */
        public AbstractC68769h<T> mo238454a() {
            return new C68774m(this.f172442a, this.f172443b, this.f172444c, this.f172445d);
        }

        C68773l(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f172442a = i;
            this.f172443b = j;
            this.f172444c = timeUnit;
            this.f172445d = scheduler;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cp$n */
    static final class C68775n<T> extends AbstractC68762a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68762a
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }

        C68775n(int i) {
            this.limit = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cp$p */
    static final class C68777p<T> extends ArrayList<Object> implements AbstractC68769h<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        C68777p(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public void error(Throwable th) {
            add(NotificationLite.error(th));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public void next(T t) {
            add(NotificationLite.next(t));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68769h
        public void replay(C68765d<T> dVar) {
            int i;
            if (dVar.getAndIncrement() == 0) {
                AbstractC69009q<? super T> qVar = dVar.child;
                int i2 = 1;
                while (!dVar.isDisposed()) {
                    int i3 = this.size;
                    Integer num = (Integer) dVar.index();
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    while (i < i3) {
                        if (!NotificationLite.accept(get(i), qVar) && !dVar.isDisposed()) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    dVar.index = Integer.valueOf(i);
                    i2 = dVar.addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cp$m */
    static final class C68774m<T> extends AbstractC68762a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final Scheduler scheduler;
        final TimeUnit unit;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68762a
        public C68767f getHead() {
            long now = this.scheduler.now(this.unit) - this.maxAge;
            C68767f fVar = (C68767f) get();
            Object obj = fVar.get();
            while (true) {
                fVar = (C68767f) obj;
                if (fVar != null) {
                    C68288b bVar = (C68288b) fVar.value;
                    if (NotificationLite.isComplete(bVar.mo237930a()) || NotificationLite.isError(bVar.mo237930a()) || bVar.mo237931b() > now) {
                        break;
                    }
                    obj = fVar.get();
                } else {
                    break;
                }
            }
            return fVar;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68762a
        public void truncate() {
            long now = this.scheduler.now(this.unit) - this.maxAge;
            C68767f fVar = (C68767f) get();
            C68767f fVar2 = (C68767f) fVar.get();
            int i = 0;
            while (true) {
                fVar = fVar2;
                if (fVar != null) {
                    if (this.size <= this.limit) {
                        if (((C68288b) fVar.value).mo237931b() > now) {
                            break;
                        }
                        i++;
                        this.size--;
                        fVar2 = (C68767f) fVar.get();
                    } else {
                        i++;
                        this.size--;
                        fVar2 = (C68767f) fVar.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(fVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68762a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void truncateFinal() {
            /*
                r10 = this;
                io.reactivex.Scheduler r0 = r10.scheduler
                java.util.concurrent.TimeUnit r1 = r10.unit
                long r0 = r0.now(r1)
                long r2 = r10.maxAge
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                io.reactivex.internal.operators.observable.cp$f r2 = (io.reactivex.internal.operators.observable.cp.C68767f) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.cp$f r3 = (io.reactivex.internal.operators.observable.cp.C68767f) r3
                r4 = 0
            L_0x0018:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L_0x003c
                int r5 = r10.size
                r6 = 1
                if (r5 <= r6) goto L_0x003c
                java.lang.Object r5 = r2.value
                io.reactivex.d.b r5 = (io.reactivex.p3456d.C68288b) r5
                long r7 = r5.mo237931b()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L_0x003c
                int r4 = r4 + 1
                int r3 = r10.size
                int r3 = r3 - r6
                r10.size = r3
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.cp$f r3 = (io.reactivex.internal.operators.observable.cp.C68767f) r3
                goto L_0x0018
            L_0x003c:
                if (r4 == 0) goto L_0x0041
                r10.setFirst(r3)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.cp.C68774m.truncateFinal():void");
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68762a
        public Object leaveTransform(Object obj) {
            return ((C68288b) obj).mo237930a();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cp.AbstractC68762a
        public Object enterTransform(Object obj) {
            return new C68288b(obj, this.scheduler.now(this.unit), this.unit);
        }

        C68774m(int i, long j, TimeUnit timeUnit, Scheduler scheduler2) {
            this.scheduler = scheduler2;
            this.limit = i;
            this.maxAge = j;
            this.unit = timeUnit;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cp$c */
    static final class C68764c<R> implements Consumer<Disposable> {

        /* renamed from: a */
        private final ObserverResourceWrapper<R> f172434a;

        C68764c(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.f172434a = observerResourceWrapper;
        }

        /* renamed from: a */
        public void accept(Disposable disposable) {
            this.f172434a.setResource(disposable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$f */
    public static final class C68767f extends AtomicReference<C68767f> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        C68767f(Object obj) {
            this.value = obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$g */
    public static final class C68768g<T> extends AbstractC68271a<T> {

        /* renamed from: a */
        private final AbstractC68271a<T> f172437a;

        /* renamed from: b */
        private final Observable<T> f172438b;

        @Override // io.reactivex.p3454b.AbstractC68271a
        /* renamed from: a */
        public void mo237900a(Consumer<? super Disposable> consumer) {
            this.f172437a.mo237900a(consumer);
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.Observable
        public void subscribeActual(AbstractC69009q<? super T> qVar) {
            this.f172438b.subscribe(qVar);
        }

        C68768g(AbstractC68271a<T> aVar, Observable<T> observable) {
            this.f172437a = aVar;
            this.f172438b = observable;
        }
    }

    /* renamed from: a */
    public static <T> AbstractC68271a<T> m265409a(ObservableSource<? extends T> observableSource) {
        return m265413a(observableSource, f172429e);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172433d.subscribe(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$e */
    public static final class C68766e<R, U> extends Observable<R> {

        /* renamed from: a */
        private final Callable<? extends AbstractC68271a<U>> f172435a;

        /* renamed from: b */
        private final Function<? super Observable<U>, ? extends ObservableSource<R>> f172436b;

        /* access modifiers changed from: protected */
        @Override // io.reactivex.Observable
        public void subscribeActual(AbstractC69009q<? super R> qVar) {
            try {
                AbstractC68271a aVar = (AbstractC68271a) C68362b.m265229a(this.f172435a.call(), "The connectableFactory returned a null ConnectableObservable");
                ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172436b.apply(aVar), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(qVar);
                observableSource.subscribe(observerResourceWrapper);
                aVar.mo237900a(new C68764c(observerResourceWrapper));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                EmptyDisposable.error(th, qVar);
            }
        }

        C68766e(Callable<? extends AbstractC68271a<U>> callable, Function<? super Observable<U>, ? extends ObservableSource<R>> function) {
            this.f172435a = callable;
            this.f172436b = function;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cp$k */
    public static final class C68772k<T> implements ObservableSource<T> {

        /* renamed from: a */
        private final AtomicReference<C68771j<T>> f172440a;

        /* renamed from: b */
        private final AbstractC68763b<T> f172441b;

        @Override // io.reactivex.ObservableSource
        public void subscribe(AbstractC69009q<? super T> qVar) {
            C68771j<T> jVar;
            while (true) {
                jVar = this.f172440a.get();
                if (jVar != null) {
                    break;
                }
                C68771j<T> jVar2 = new C68771j<>(this.f172441b.mo238454a());
                if (this.f172440a.compareAndSet(null, jVar2)) {
                    jVar = jVar2;
                    break;
                }
            }
            C68765d<T> dVar = new C68765d<>(jVar, qVar);
            qVar.onSubscribe(dVar);
            jVar.add(dVar);
            if (dVar.isDisposed()) {
                jVar.remove(dVar);
            } else {
                jVar.buffer.replay(dVar);
            }
        }

        C68772k(AtomicReference<C68771j<T>> atomicReference, AbstractC68763b<T> bVar) {
            this.f172440a = atomicReference;
            this.f172441b = bVar;
        }
    }

    @Override // io.reactivex.internal.disposables.AbstractC68376c
    /* renamed from: a */
    public void mo238089a(Disposable disposable) {
        this.f172431b.compareAndSet((C68771j) disposable, null);
    }

    @Override // io.reactivex.p3454b.AbstractC68271a
    /* renamed from: a */
    public void mo237900a(Consumer<? super Disposable> consumer) {
        C68771j<T> jVar;
        boolean z;
        while (true) {
            jVar = this.f172431b.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            C68771j<T> jVar2 = new C68771j<>(this.f172432c.mo238454a());
            if (this.f172431b.compareAndSet(jVar, jVar2)) {
                jVar = jVar2;
                break;
            }
        }
        if (jVar.shouldConnect.get() || !jVar.shouldConnect.compareAndSet(false, true)) {
            z = false;
        } else {
            z = true;
        }
        try {
            consumer.accept(jVar);
            if (z) {
                this.f172430a.subscribe(jVar);
            }
        } catch (Throwable th) {
            if (z) {
                jVar.shouldConnect.compareAndSet(true, false);
            }
            C68306a.m265071b(th);
            throw C68981f.m265557a(th);
        }
    }

    /* renamed from: a */
    public static <U, R> Observable<R> m265408a(Callable<? extends AbstractC68271a<U>> callable, Function<? super Observable<U>, ? extends ObservableSource<R>> function) {
        return RxJavaPlugins.onAssembly(new C68766e(callable, function));
    }

    /* renamed from: a */
    public static <T> AbstractC68271a<T> m265410a(ObservableSource<T> observableSource, int i) {
        if (i == Integer.MAX_VALUE) {
            return m265409a(observableSource);
        }
        return m265413a(observableSource, new C68770i(i));
    }

    /* renamed from: a */
    static <T> AbstractC68271a<T> m265413a(ObservableSource<T> observableSource, AbstractC68763b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((AbstractC68271a) new cp(new C68772k(atomicReference, bVar), observableSource, atomicReference, bVar));
    }

    /* renamed from: a */
    public static <T> AbstractC68271a<T> m265414a(AbstractC68271a<T> aVar, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((AbstractC68271a) new C68768g(aVar, aVar.observeOn(scheduler)));
    }

    private cp(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<C68771j<T>> atomicReference, AbstractC68763b<T> bVar) {
        this.f172433d = observableSource;
        this.f172430a = observableSource2;
        this.f172431b = atomicReference;
        this.f172432c = bVar;
    }

    /* renamed from: a */
    public static <T> AbstractC68271a<T> m265411a(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return m265412a(observableSource, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static <T> AbstractC68271a<T> m265412a(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return m265413a(observableSource, new C68773l(i, j, timeUnit, scheduler));
    }
}
