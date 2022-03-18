package io.reactivex.p3456d;

import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.C68929b;
import io.reactivex.internal.schedulers.C68934d;
import io.reactivex.internal.schedulers.C68941f;
import io.reactivex.internal.schedulers.C68945g;
import io.reactivex.internal.schedulers.C68960l;
import io.reactivex.internal.schedulers.C68962m;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: io.reactivex.d.a */
public final class C68279a {

    /* renamed from: a */
    static final Scheduler f171580a = RxJavaPlugins.initSingleScheduler(new CallableC68287h());

    /* renamed from: b */
    static final Scheduler f171581b = RxJavaPlugins.initComputationScheduler(new CallableC68281b());

    /* renamed from: c */
    static final Scheduler f171582c = RxJavaPlugins.initIoScheduler(new CallableC68282c());

    /* renamed from: d */
    static final Scheduler f171583d = C68962m.m265528a();

    /* renamed from: e */
    static final Scheduler f171584e = RxJavaPlugins.initNewThreadScheduler(new CallableC68285f());

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.d.a$a */
    public static final class C68280a {

        /* renamed from: a */
        static final Scheduler f171585a = new C68929b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.d.a$d */
    public static final class C68283d {

        /* renamed from: a */
        static final Scheduler f171586a = new C68941f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.d.a$e */
    public static final class C68284e {

        /* renamed from: a */
        static final Scheduler f171587a = new C68945g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.d.a$g */
    public static final class C68286g {

        /* renamed from: a */
        static final Scheduler f171588a = new C68960l();
    }

    /* renamed from: io.reactivex.d.a$b */
    static final class CallableC68281b implements Callable<Scheduler> {
        CallableC68281b() {
        }

        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C68280a.f171585a;
        }
    }

    /* renamed from: io.reactivex.d.a$c */
    static final class CallableC68282c implements Callable<Scheduler> {
        CallableC68282c() {
        }

        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C68283d.f171586a;
        }
    }

    /* renamed from: io.reactivex.d.a$f */
    static final class CallableC68285f implements Callable<Scheduler> {
        CallableC68285f() {
        }

        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C68284e.f171587a;
        }
    }

    /* renamed from: io.reactivex.d.a$h */
    static final class CallableC68287h implements Callable<Scheduler> {
        CallableC68287h() {
        }

        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C68286g.f171588a;
        }
    }

    /* renamed from: c */
    public static Scheduler m265024c() {
        return f171583d;
    }

    /* renamed from: a */
    public static Scheduler m265021a() {
        return RxJavaPlugins.onComputationScheduler(f171581b);
    }

    /* renamed from: b */
    public static Scheduler m265023b() {
        return RxJavaPlugins.onIoScheduler(f171582c);
    }

    /* renamed from: d */
    public static Scheduler m265025d() {
        return RxJavaPlugins.onSingleScheduler(f171580a);
    }

    /* renamed from: a */
    public static Scheduler m265022a(Executor executor) {
        return new C68934d(executor);
    }
}
