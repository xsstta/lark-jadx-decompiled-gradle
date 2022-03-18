package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.p3454b.AbstractC68271a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.internal.operators.observable.bm */
public final class C68711bm {
    /* renamed from: a */
    public static <T> Callable<AbstractC68271a<T>> m265381a(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC68725n(observable, j, timeUnit, scheduler);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$g */
    public static final class C68718g<T> implements AbstractC68309a {

        /* renamed from: a */
        final AbstractC69009q<T> f172312a;

        @Override // io.reactivex.functions.AbstractC68309a
        public void run() throws Exception {
            this.f172312a.onComplete();
        }

        C68718g(AbstractC69009q<T> qVar) {
            this.f172312a = qVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$j */
    public static final class CallableC68721j<T> implements Callable<AbstractC68271a<T>> {

        /* renamed from: a */
        private final Observable<T> f172315a;

        /* renamed from: a */
        public AbstractC68271a<T> call() {
            return this.f172315a.replay();
        }

        CallableC68721j(Observable<T> observable) {
            this.f172315a = observable;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$a */
    public static final class CallableC68712a<T> implements Callable<AbstractC68271a<T>> {

        /* renamed from: a */
        private final Observable<T> f172299a;

        /* renamed from: b */
        private final int f172300b;

        /* renamed from: a */
        public AbstractC68271a<T> call() {
            return this.f172299a.replay(this.f172300b);
        }

        CallableC68712a(Observable<T> observable, int i) {
            this.f172299a = observable;
            this.f172300b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$b */
    public static final class CallableC68713b<T> implements Callable<AbstractC68271a<T>> {

        /* renamed from: a */
        private final Observable<T> f172301a;

        /* renamed from: b */
        private final int f172302b;

        /* renamed from: c */
        private final long f172303c;

        /* renamed from: d */
        private final TimeUnit f172304d;

        /* renamed from: e */
        private final Scheduler f172305e;

        /* renamed from: a */
        public AbstractC68271a<T> call() {
            return this.f172301a.replay(this.f172302b, this.f172303c, this.f172304d, this.f172305e);
        }

        CallableC68713b(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f172301a = observable;
            this.f172302b = i;
            this.f172303c = j;
            this.f172304d = timeUnit;
            this.f172305e = scheduler;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$n */
    public static final class CallableC68725n<T> implements Callable<AbstractC68271a<T>> {

        /* renamed from: a */
        private final Observable<T> f172320a;

        /* renamed from: b */
        private final long f172321b;

        /* renamed from: c */
        private final TimeUnit f172322c;

        /* renamed from: d */
        private final Scheduler f172323d;

        /* renamed from: a */
        public AbstractC68271a<T> call() {
            return this.f172320a.replay(this.f172321b, this.f172322c, this.f172323d);
        }

        CallableC68725n(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f172320a = observable;
            this.f172321b = j;
            this.f172322c = timeUnit;
            this.f172323d = scheduler;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$c */
    public static final class C68714c<T, U> implements Function<T, ObservableSource<U>> {

        /* renamed from: a */
        private final Function<? super T, ? extends Iterable<? extends U>> f172306a;

        C68714c(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.f172306a = function;
        }

        /* renamed from: a */
        public ObservableSource<U> apply(T t) throws Exception {
            return new be((Iterable) C68362b.m265229a(this.f172306a.apply(t), "The mapper returned a null Iterable"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$f */
    public static final class C68717f<T, U> implements Function<T, ObservableSource<T>> {

        /* renamed from: a */
        final Function<? super T, ? extends ObservableSource<U>> f172311a;

        C68717f(Function<? super T, ? extends ObservableSource<U>> function) {
            this.f172311a = function;
        }

        /* renamed from: a */
        public ObservableSource<T> apply(T t) throws Exception {
            return new dk((ObservableSource) C68362b.m265229a(this.f172311a.apply(t), "The itemDelay returned a null ObservableSource"), 1).map(C68326a.m265195b((Object) t)).defaultIfEmpty(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$h */
    public static final class C68719h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final AbstractC69009q<T> f172313a;

        C68719h(AbstractC69009q<T> qVar) {
            this.f172313a = qVar;
        }

        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.f172313a.onError(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$i */
    public static final class C68720i<T> implements Consumer<T> {

        /* renamed from: a */
        final AbstractC69009q<T> f172314a;

        C68720i(AbstractC69009q<T> qVar) {
            this.f172314a = qVar;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            this.f172314a.onNext(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$l */
    public static final class C68723l<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* renamed from: a */
        final AbstractC68310b<S, Emitter<T>> f172318a;

        C68723l(AbstractC68310b<S, Emitter<T>> bVar) {
            this.f172318a = bVar;
        }

        /* renamed from: a */
        public S apply(S s, Emitter<T> emitter) throws Exception {
            this.f172318a.accept(s, emitter);
            return s;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$m */
    public static final class C68724m<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* renamed from: a */
        final Consumer<Emitter<T>> f172319a;

        C68724m(Consumer<Emitter<T>> consumer) {
            this.f172319a = consumer;
        }

        /* renamed from: a */
        public S apply(S s, Emitter<T> emitter) throws Exception {
            this.f172319a.accept(emitter);
            return s;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$o */
    public static final class C68726o<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {

        /* renamed from: a */
        private final Function<? super Object[], ? extends R> f172324a;

        C68726o(Function<? super Object[], ? extends R> function) {
            this.f172324a = function;
        }

        /* renamed from: a */
        public ObservableSource<? extends R> apply(List<ObservableSource<? extends T>> list) {
            return Observable.zipIterable(list, this.f172324a, false, Observable.bufferSize());
        }
    }

    /* renamed from: a */
    public static <T, S> BiFunction<S, Emitter<T>, S> m265372a(Consumer<Emitter<T>> consumer) {
        return new C68724m(consumer);
    }

    /* renamed from: b */
    public static <T> Consumer<Throwable> m265382b(AbstractC69009q<T> qVar) {
        return new C68719h(qVar);
    }

    /* renamed from: c */
    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> m265384c(Function<? super Object[], ? extends R> function) {
        return new C68726o(function);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$d */
    public static final class C68715d<U, R, T> implements Function<U, R> {

        /* renamed from: a */
        private final BiFunction<? super T, ? super U, ? extends R> f172307a;

        /* renamed from: b */
        private final T f172308b;

        @Override // io.reactivex.functions.Function
        public R apply(U u) throws Exception {
            return (R) this.f172307a.apply(this.f172308b, u);
        }

        C68715d(BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.f172307a = biFunction;
            this.f172308b = t;
        }
    }

    /* renamed from: a */
    public static <T, S> BiFunction<S, Emitter<T>, S> m265373a(AbstractC68310b<S, Emitter<T>> bVar) {
        return new C68723l(bVar);
    }

    /* renamed from: b */
    public static <T, U> Function<T, ObservableSource<U>> m265383b(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new C68714c(function);
    }

    /* renamed from: c */
    public static <T> AbstractC68309a m265385c(AbstractC69009q<T> qVar) {
        return new C68718g(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$e */
    public static final class C68716e<T, R, U> implements Function<T, ObservableSource<R>> {

        /* renamed from: a */
        private final BiFunction<? super T, ? super U, ? extends R> f172309a;

        /* renamed from: b */
        private final Function<? super T, ? extends ObservableSource<? extends U>> f172310b;

        /* renamed from: a */
        public ObservableSource<R> apply(T t) throws Exception {
            return new bu((ObservableSource) C68362b.m265229a(this.f172310b.apply(t), "The mapper returned a null ObservableSource"), new C68715d(this.f172309a, t));
        }

        C68716e(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends ObservableSource<? extends U>> function) {
            this.f172309a = biFunction;
            this.f172310b = function;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bm$k */
    public static final class C68722k<T, R> implements Function<Observable<T>, ObservableSource<R>> {

        /* renamed from: a */
        private final Function<? super Observable<T>, ? extends ObservableSource<R>> f172316a;

        /* renamed from: b */
        private final Scheduler f172317b;

        /* renamed from: a */
        public ObservableSource<R> apply(Observable<T> observable) throws Exception {
            return Observable.wrap((ObservableSource) C68362b.m265229a(this.f172316a.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.f172317b);
        }

        C68722k(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
            this.f172316a = function;
            this.f172317b = scheduler;
        }
    }

    /* renamed from: a */
    public static <T> Consumer<T> m265374a(AbstractC69009q<T> qVar) {
        return new C68720i(qVar);
    }

    /* renamed from: a */
    public static <T, U> Function<T, ObservableSource<T>> m265375a(Function<? super T, ? extends ObservableSource<U>> function) {
        return new C68717f(function);
    }

    /* renamed from: a */
    public static <T> Callable<AbstractC68271a<T>> m265378a(Observable<T> observable) {
        return new CallableC68721j(observable);
    }

    /* renamed from: a */
    public static <T, R> Function<Observable<T>, ObservableSource<R>> m265376a(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        return new C68722k(function, scheduler);
    }

    /* renamed from: a */
    public static <T, U, R> Function<T, ObservableSource<R>> m265377a(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new C68716e(biFunction, function);
    }

    /* renamed from: a */
    public static <T> Callable<AbstractC68271a<T>> m265379a(Observable<T> observable, int i) {
        return new CallableC68712a(observable, i);
    }

    /* renamed from: a */
    public static <T> Callable<AbstractC68271a<T>> m265380a(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC68713b(observable, i, j, timeUnit, scheduler);
    }
}
