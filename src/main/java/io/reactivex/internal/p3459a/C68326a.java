package io.reactivex.internal.p3459a;

import io.reactivex.C68991m;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.functions.AbstractC68312d;
import io.reactivex.functions.AbstractC68314f;
import io.reactivex.functions.AbstractC68315g;
import io.reactivex.functions.AbstractC68316h;
import io.reactivex.functions.AbstractC68317i;
import io.reactivex.functions.AbstractC68318j;
import io.reactivex.functions.AbstractC68319k;
import io.reactivex.functions.AbstractC68320l;
import io.reactivex.functions.AbstractC68321m;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68288b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.a.a */
public final class C68326a {

    /* renamed from: a */
    static final Function<Object, Object> f171639a = new C68357v();

    /* renamed from: b */
    public static final Runnable f171640b = new RunnableC68352q();

    /* renamed from: c */
    public static final AbstractC68309a f171641c = new C68349n();

    /* renamed from: d */
    static final Consumer<Object> f171642d = new C68350o();

    /* renamed from: e */
    public static final Consumer<Throwable> f171643e = new C68354s();

    /* renamed from: f */
    public static final Consumer<Throwable> f171644f = new C68333af();

    /* renamed from: g */
    public static final AbstractC68321m f171645g = new C68351p();

    /* renamed from: h */
    static final AbstractC68322n<Object> f171646h = new ak();

    /* renamed from: i */
    static final AbstractC68322n<Object> f171647i = new C68355t();

    /* renamed from: j */
    static final Callable<Object> f171648j = new CallableC68332ae();

    /* renamed from: k */
    static final Comparator<Object> f171649k = new C68328aa();

    /* renamed from: l */
    public static final Consumer<AbstractC70022d> f171650l = new C68360y();

    /* renamed from: io.reactivex.internal.a.a$aa */
    static final class C68328aa implements Comparator<Object> {
        C68328aa() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.internal.a.a$ae */
    static final class CallableC68332ae implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }

        CallableC68332ae() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$af */
    static final class C68333af implements Consumer<Throwable> {
        C68333af() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            RxJavaPlugins.onError(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: io.reactivex.internal.a.a$ak */
    static final class ak implements AbstractC68322n<Object> {
        @Override // io.reactivex.functions.AbstractC68322n
        public boolean test(Object obj) {
            return true;
        }

        ak() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$n */
    static final class C68349n implements AbstractC68309a {
        @Override // io.reactivex.functions.AbstractC68309a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }

        C68349n() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$o */
    static final class C68350o implements Consumer<Object> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        C68350o() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$p */
    static final class C68351p implements AbstractC68321m {
        @Override // io.reactivex.functions.AbstractC68321m
        /* renamed from: a */
        public void mo238045a(long j) {
        }

        C68351p() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$q */
    static final class RunnableC68352q implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        RunnableC68352q() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$s */
    static final class C68354s implements Consumer<Throwable> {
        C68354s() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            RxJavaPlugins.onError(th);
        }
    }

    /* renamed from: io.reactivex.internal.a.a$t */
    static final class C68355t implements AbstractC68322n<Object> {
        @Override // io.reactivex.functions.AbstractC68322n
        public boolean test(Object obj) {
            return false;
        }

        C68355t() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$v */
    static final class C68357v implements Function<Object, Object> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }

        C68357v() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$w */
    public static final class CallableC68358w<T, U> implements Function<T, U>, Callable<U> {

        /* renamed from: a */
        final U f171677a;

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f171677a;
        }

        @Override // io.reactivex.functions.Function
        public U apply(T t) throws Exception {
            return this.f171677a;
        }

        CallableC68358w(U u) {
            this.f171677a = u;
        }
    }

    /* renamed from: io.reactivex.internal.a.a$y */
    static final class C68360y implements Consumer<AbstractC70022d> {
        C68360y() {
        }

        /* renamed from: a */
        public void accept(AbstractC70022d dVar) throws Exception {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public static <T> Function<T, T> m265175a() {
        return (Function<T, T>) f171639a;
    }

    /* renamed from: b */
    public static <T> Consumer<T> m265193b() {
        return (Consumer<T>) f171642d;
    }

    /* renamed from: c */
    public static <T> AbstractC68322n<T> m265198c() {
        return (AbstractC68322n<T>) f171646h;
    }

    /* renamed from: d */
    public static <T> AbstractC68322n<T> m265200d() {
        return (AbstractC68322n<T>) f171647i;
    }

    /* renamed from: e */
    public static <T> Callable<T> m265201e() {
        return (Callable<T>) f171648j;
    }

    /* renamed from: f */
    public static <T> Comparator<T> m265202f() {
        return (Comparator<T>) f171649k;
    }

    /* renamed from: g */
    public static <T> Callable<Set<T>> m265203g() {
        return EnumC68356u.INSTANCE;
    }

    /* renamed from: h */
    public static <T> Comparator<T> m265204h() {
        return EnumC68361z.INSTANCE;
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function<Object[], R> m265183a(AbstractC68320l<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> lVar) {
        C68362b.m265229a((Object) lVar, "f is null");
        return new C68344i(lVar);
    }

    /* renamed from: a */
    public static <T> Callable<T> m265192a(T t) {
        return new CallableC68358w(t);
    }

    /* renamed from: a */
    public static <T, U> Function<T, U> m265184a(Class<U> cls) {
        return new C68347l(cls);
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m265191a(int i) {
        return new CallableC68345j(i);
    }

    /* renamed from: a */
    public static <T> AbstractC68322n<T> m265190a(AbstractC68312d dVar) {
        return new C68346k(dVar);
    }

    /* renamed from: a */
    public static <T> Function<T, C68288b<T>> m265186a(TimeUnit timeUnit, Scheduler scheduler) {
        return new C68334ag(timeUnit, scheduler);
    }

    /* renamed from: a */
    public static <T, K> AbstractC68310b<Map<K, T>, T> m265187a(Function<? super T, ? extends K> function) {
        return new C68335ah(function);
    }

    /* renamed from: a */
    public static <T, K, V> AbstractC68310b<Map<K, V>, T> m265188a(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return new C68336ai(function2, function);
    }

    /* renamed from: a */
    public static <T, K, V> AbstractC68310b<Map<K, Collection<V>>, T> m265189a(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Function<? super K, ? extends Collection<? super V>> function3) {
        return new aj(function3, function2, function);
    }

    /* renamed from: a */
    public static <T> Function<List<T>, List<T>> m265185a(Comparator<? super T> comparator) {
        return new C68359x(comparator);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$j */
    public static final class CallableC68345j<T> implements Callable<List<T>> {

        /* renamed from: a */
        final int f171671a;

        /* renamed from: a */
        public List<T> call() throws Exception {
            return new ArrayList(this.f171671a);
        }

        CallableC68345j(int i) {
            this.f171671a = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$ab */
    public static final class C68329ab<T> implements AbstractC68309a {

        /* renamed from: a */
        final Consumer<? super C68991m<T>> f171652a;

        @Override // io.reactivex.functions.AbstractC68309a
        public void run() throws Exception {
            this.f171652a.accept(C68991m.m265593f());
        }

        C68329ab(Consumer<? super C68991m<T>> consumer) {
            this.f171652a = consumer;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$u */
    public enum EnumC68356u implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$a */
    public static final class C68327a<T> implements Consumer<T> {

        /* renamed from: a */
        final AbstractC68309a f171651a;

        C68327a(AbstractC68309a aVar) {
            this.f171651a = aVar;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            this.f171651a.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$ac */
    public static final class C68330ac<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final Consumer<? super C68991m<T>> f171653a;

        C68330ac(Consumer<? super C68991m<T>> consumer) {
            this.f171653a = consumer;
        }

        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.f171653a.accept(C68991m.m265592a(th));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$ad */
    public static final class C68331ad<T> implements Consumer<T> {

        /* renamed from: a */
        final Consumer<? super C68991m<T>> f171654a;

        C68331ad(Consumer<? super C68991m<T>> consumer) {
            this.f171654a = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            this.f171654a.accept(C68991m.m265591a((Object) t));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$ah */
    public static final class C68335ah<K, T> implements AbstractC68310b<Map<K, T>, T> {

        /* renamed from: a */
        private final Function<? super T, ? extends K> f171657a;

        C68335ah(Function<? super T, ? extends K> function) {
            this.f171657a = function;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void accept(Map<K, T> map, T t) throws Exception {
            map.put(this.f171657a.apply(t), t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$b */
    public static final class C68337b<T1, T2, R> implements Function<Object[], R> {

        /* renamed from: a */
        final BiFunction<? super T1, ? super T2, ? extends R> f171663a;

        C68337b(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.f171663a = biFunction;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return (R) this.f171663a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$c */
    public static final class C68338c<T1, T2, T3, R> implements Function<Object[], R> {

        /* renamed from: a */
        final AbstractC68314f<T1, T2, T3, R> f171664a;

        C68338c(AbstractC68314f<T1, T2, T3, R> fVar) {
            this.f171664a = fVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.functions.f<T1, T2, T3, R> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return (R) this.f171664a.apply(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$d */
    public static final class C68339d<T1, T2, T3, T4, R> implements Function<Object[], R> {

        /* renamed from: a */
        final AbstractC68315g<T1, T2, T3, T4, R> f171665a;

        C68339d(AbstractC68315g<T1, T2, T3, T4, R> gVar) {
            this.f171665a = gVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.functions.g<T1, T2, T3, T4, R> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return (R) this.f171665a.mo161434a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$e */
    public static final class C68340e<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {

        /* renamed from: a */
        private final AbstractC68316h<T1, T2, T3, T4, T5, R> f171666a;

        C68340e(AbstractC68316h<T1, T2, T3, T4, T5, R> hVar) {
            this.f171666a = hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.functions.h<T1, T2, T3, T4, T5, R> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return (R) this.f171666a.mo238041a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$f */
    public static final class C68341f<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {

        /* renamed from: a */
        final AbstractC68317i<T1, T2, T3, T4, T5, T6, R> f171667a;

        C68341f(AbstractC68317i<T1, T2, T3, T4, T5, T6, R> iVar) {
            this.f171667a = iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.functions.i<T1, T2, T3, T4, T5, T6, R> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return (R) this.f171667a.mo238042a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$g */
    public static final class C68342g<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {

        /* renamed from: a */
        final AbstractC68318j<T1, T2, T3, T4, T5, T6, T7, R> f171668a;

        C68342g(AbstractC68318j<T1, T2, T3, T4, T5, T6, T7, R> jVar) {
            this.f171668a = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.functions.j<T1, T2, T3, T4, T5, T6, T7, R> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 7) {
                return (R) this.f171668a.mo219592a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$h */
    public static final class C68343h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {

        /* renamed from: a */
        final AbstractC68319k<T1, T2, T3, T4, T5, T6, T7, T8, R> f171669a;

        C68343h(AbstractC68319k<T1, T2, T3, T4, T5, T6, T7, T8, R> kVar) {
            this.f171669a = kVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.functions.k<T1, T2, T3, T4, T5, T6, T7, T8, R> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return (R) this.f171669a.mo238043a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$i */
    public static final class C68344i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {

        /* renamed from: a */
        final AbstractC68320l<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f171670a;

        C68344i(AbstractC68320l<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> lVar) {
            this.f171670a = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.functions.l<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 9) {
                return (R) this.f171670a.mo238044a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$k */
    public static final class C68346k<T> implements AbstractC68322n<T> {

        /* renamed from: a */
        final AbstractC68312d f171672a;

        C68346k(AbstractC68312d dVar) {
            this.f171672a = dVar;
        }

        @Override // io.reactivex.functions.AbstractC68322n
        public boolean test(T t) throws Exception {
            return !this.f171672a.mo238040a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$l */
    public static final class C68347l<T, U> implements Function<T, U> {

        /* renamed from: a */
        final Class<U> f171673a;

        C68347l(Class<U> cls) {
            this.f171673a = cls;
        }

        @Override // io.reactivex.functions.Function
        public U apply(T t) throws Exception {
            return this.f171673a.cast(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$m */
    public static final class C68348m<T, U> implements AbstractC68322n<T> {

        /* renamed from: a */
        final Class<U> f171674a;

        C68348m(Class<U> cls) {
            this.f171674a = cls;
        }

        @Override // io.reactivex.functions.AbstractC68322n
        public boolean test(T t) throws Exception {
            return this.f171674a.isInstance(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$r */
    public static final class C68353r<T> implements AbstractC68322n<T> {

        /* renamed from: a */
        final T f171675a;

        C68353r(T t) {
            this.f171675a = t;
        }

        @Override // io.reactivex.functions.AbstractC68322n
        public boolean test(T t) throws Exception {
            return C68362b.m265230a((Object) t, (Object) this.f171675a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$x */
    public static final class C68359x<T> implements Function<List<T>, List<T>> {

        /* renamed from: a */
        final Comparator<? super T> f171678a;

        C68359x(Comparator<? super T> comparator) {
            this.f171678a = comparator;
        }

        /* renamed from: a */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f171678a);
            return list;
        }
    }

    /* renamed from: a */
    public static <T> Consumer<T> m265173a(Consumer<? super C68991m<T>> consumer) {
        return new C68331ad(consumer);
    }

    /* renamed from: b */
    public static <T> Consumer<Throwable> m265194b(Consumer<? super C68991m<T>> consumer) {
        return new C68330ac(consumer);
    }

    /* renamed from: c */
    public static <T> AbstractC68309a m265197c(Consumer<? super C68991m<T>> consumer) {
        return new C68329ab(consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$ag */
    public static final class C68334ag<T> implements Function<T, C68288b<T>> {

        /* renamed from: a */
        final TimeUnit f171655a;

        /* renamed from: b */
        final Scheduler f171656b;

        /* renamed from: a */
        public C68288b<T> apply(T t) throws Exception {
            return new C68288b<>(t, this.f171656b.now(this.f171655a), this.f171655a);
        }

        C68334ag(TimeUnit timeUnit, Scheduler scheduler) {
            this.f171655a = timeUnit;
            this.f171656b = scheduler;
        }
    }

    /* renamed from: a */
    public static <T> Consumer<T> m265174a(AbstractC68309a aVar) {
        return new C68327a(aVar);
    }

    /* renamed from: b */
    public static <T, U> Function<T, U> m265195b(U u) {
        return new CallableC68358w(u);
    }

    /* renamed from: c */
    public static <T> AbstractC68322n<T> m265199c(T t) {
        return new C68353r(t);
    }

    /* renamed from: a */
    public static <T1, T2, R> Function<Object[], R> m265176a(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C68362b.m265229a((Object) biFunction, "f is null");
        return new C68337b(biFunction);
    }

    /* renamed from: b */
    public static <T, U> AbstractC68322n<T> m265196b(Class<U> cls) {
        return new C68348m(cls);
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> Function<Object[], R> m265177a(AbstractC68314f<T1, T2, T3, R> fVar) {
        C68362b.m265229a((Object) fVar, "f is null");
        return new C68338c(fVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> Function<Object[], R> m265178a(AbstractC68315g<T1, T2, T3, T4, R> gVar) {
        C68362b.m265229a((Object) gVar, "f is null");
        return new C68339d(gVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> Function<Object[], R> m265179a(AbstractC68316h<T1, T2, T3, T4, T5, R> hVar) {
        C68362b.m265229a((Object) hVar, "f is null");
        return new C68340e(hVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> m265180a(AbstractC68317i<T1, T2, T3, T4, T5, T6, R> iVar) {
        C68362b.m265229a((Object) iVar, "f is null");
        return new C68341f(iVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, R> Function<Object[], R> m265181a(AbstractC68318j<T1, T2, T3, T4, T5, T6, T7, R> jVar) {
        C68362b.m265229a((Object) jVar, "f is null");
        return new C68342g(jVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Object[], R> m265182a(AbstractC68319k<T1, T2, T3, T4, T5, T6, T7, T8, R> kVar) {
        C68362b.m265229a((Object) kVar, "f is null");
        return new C68343h(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$ai */
    public static final class C68336ai<K, V, T> implements AbstractC68310b<Map<K, V>, T> {

        /* renamed from: a */
        private final Function<? super T, ? extends V> f171658a;

        /* renamed from: b */
        private final Function<? super T, ? extends K> f171659b;

        C68336ai(Function<? super T, ? extends V> function, Function<? super T, ? extends K> function2) {
            this.f171658a = function;
            this.f171659b = function2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void accept(Map<K, V> map, T t) throws Exception {
            map.put(this.f171659b.apply(t), this.f171658a.apply(t));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$z */
    public enum EnumC68361z implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.a.a$aj */
    public static final class aj<K, V, T> implements AbstractC68310b<Map<K, Collection<V>>, T> {

        /* renamed from: a */
        private final Function<? super K, ? extends Collection<? super V>> f171660a;

        /* renamed from: b */
        private final Function<? super T, ? extends V> f171661b;

        /* renamed from: c */
        private final Function<? super T, ? extends K> f171662c;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<K, java.util.Collection<V>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void accept(Map<K, Collection<V>> map, T t) throws Exception {
            Object apply = this.f171662c.apply(t);
            Collection collection = (Collection) map.get(apply);
            if (collection == null) {
                collection = (Collection) this.f171660a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f171661b.apply(t));
        }

        aj(Function<? super K, ? extends Collection<? super V>> function, Function<? super T, ? extends V> function2, Function<? super T, ? extends K> function3) {
            this.f171660a = function;
            this.f171661b = function2;
            this.f171662c = function3;
        }
    }
}
