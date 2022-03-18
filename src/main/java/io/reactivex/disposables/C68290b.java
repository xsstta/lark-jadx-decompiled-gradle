package io.reactivex.disposables;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;

/* renamed from: io.reactivex.disposables.b */
public final class C68290b {
    /* renamed from: b */
    public static Disposable m265041b() {
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: a */
    public static Disposable m265039a() {
        return m265040a(C68326a.f171640b);
    }

    /* renamed from: a */
    public static Disposable m265040a(Runnable runnable) {
        C68362b.m265229a((Object) runnable, "run is null");
        return new C68292d(runnable);
    }
}
