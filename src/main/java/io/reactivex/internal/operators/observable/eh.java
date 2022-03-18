package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68983g;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class eh<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final ObservableSource<?>[] f172696b;

    /* renamed from: c */
    final Iterable<? extends ObservableSource<?>> f172697c;

    /* renamed from: d */
    final Function<? super Object[], R> f172698d;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.eh$c */
    public static final class C68864c extends AtomicReference<Disposable> implements AbstractC69009q<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final C68863b<?, ?> parent;

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        C68864c(C68863b<?, ?> bVar, int i) {
            this.parent = bVar;
            this.index = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.eh$b */
    static final class C68863b<T, R> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 1577321883966341961L;
        final Function<? super Object[], R> combiner;
        volatile boolean done;
        final AbstractC69009q<? super R> downstream;
        final AtomicThrowable error;
        final C68864c[] observers;
        final AtomicReference<Disposable> upstream;
        final AtomicReferenceArray<Object> values;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            for (C68864c cVar : this.observers) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                cancelAllBut(-1);
                C68983g.m265564a(this.downstream, this, this.error);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        /* access modifiers changed from: package-private */
        public void cancelAllBut(int i) {
            C68864c[] cVarArr = this.observers;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                if (i2 != i) {
                    cVarArr[i2].dispose();
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            C68983g.m265563a((AbstractC69009q<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.done) {
                AtomicReferenceArray<Object> atomicReferenceArray = this.values;
                int length = atomicReferenceArray.length();
                Object[] objArr = new Object[(length + 1)];
                int i = 0;
                objArr[0] = t;
                while (i < length) {
                    Object obj = atomicReferenceArray.get(i);
                    if (obj != null) {
                        i++;
                        objArr[i] = obj;
                    } else {
                        return;
                    }
                }
                try {
                    C68983g.m265562a(this.downstream, C68362b.m265229a((Object) this.combiner.apply(objArr), "combiner returned a null value"), this, this.error);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    dispose();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void innerNext(int i, Object obj) {
            this.values.set(i, obj);
        }

        /* access modifiers changed from: package-private */
        public void innerComplete(int i, boolean z) {
            if (!z) {
                this.done = true;
                cancelAllBut(i);
                C68983g.m265564a(this.downstream, this, this.error);
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(int i, Throwable th) {
            this.done = true;
            DisposableHelper.dispose(this.upstream);
            cancelAllBut(i);
            C68983g.m265563a((AbstractC69009q<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        /* access modifiers changed from: package-private */
        public void subscribe(ObservableSource<?>[] observableSourceArr, int i) {
            C68864c[] cVarArr = this.observers;
            AtomicReference<Disposable> atomicReference = this.upstream;
            for (int i2 = 0; i2 < i && !DisposableHelper.isDisposed(atomicReference.get()) && !this.done; i2++) {
                observableSourceArr[i2].subscribe(cVarArr[i2]);
            }
        }

        C68863b(AbstractC69009q<? super R> qVar, Function<? super Object[], R> function, int i) {
            this.downstream = qVar;
            this.combiner = function;
            C68864c[] cVarArr = new C68864c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C68864c(this, i2);
            }
            this.observers = cVarArr;
            this.values = new AtomicReferenceArray<>(i);
            this.upstream = new AtomicReference<>();
            this.error = new AtomicThrowable();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.eh$a */
    final class C68862a implements Function<T, R> {
        C68862a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.functions.Function
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public R apply(T r4) throws java.lang.Exception {
            /*
                r3 = this;
                io.reactivex.internal.operators.observable.eh r0 = io.reactivex.internal.operators.observable.eh.this
                io.reactivex.functions.Function<? super java.lang.Object[], R> r0 = r0.f172698d
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The combiner returned a null value"
                java.lang.Object r4 = io.reactivex.internal.p3459a.C68362b.m265229a(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.eh.C68862a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        int i;
        ObservableSource<?>[] observableSourceArr = this.f172696b;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                i = 0;
                for (ObservableSource<?> observableSource : this.f172697c) {
                    if (i == observableSourceArr.length) {
                        observableSourceArr = (ObservableSource[]) Arrays.copyOf(observableSourceArr, (i >> 1) + i);
                    }
                    int i2 = i + 1;
                    observableSourceArr[i] = observableSource;
                    i = i2;
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                EmptyDisposable.error(th, qVar);
                return;
            }
        } else {
            i = observableSourceArr.length;
        }
        if (i == 0) {
            new bu(this.f172123a, new C68862a()).subscribeActual(qVar);
            return;
        }
        C68863b bVar = new C68863b(qVar, this.f172698d, i);
        qVar.onSubscribe(bVar);
        bVar.subscribe(observableSourceArr, i);
        this.f172123a.subscribe(bVar);
    }

    public eh(ObservableSource<T> observableSource, Iterable<? extends ObservableSource<?>> iterable, Function<? super Object[], R> function) {
        super(observableSource);
        this.f172697c = iterable;
        this.f172698d = function;
    }

    public eh(ObservableSource<T> observableSource, ObservableSource<?>[] observableSourceArr, Function<? super Object[], R> function) {
        super(observableSource);
        this.f172696b = observableSourceArr;
        this.f172698d = function;
    }
}
