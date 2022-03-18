package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.util.e */
public final class C68980e {
    /* renamed from: a */
    public static String m265553a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: a */
    public static void m265554a(Class<?> cls) {
        RxJavaPlugins.onError(new ProtocolViolationException(m265553a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m265555a(Disposable disposable, Disposable disposable2, Class<?> cls) {
        C68362b.m265229a((Object) disposable2, "next is null");
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        if (disposable == DisposableHelper.DISPOSED) {
            return false;
        }
        m265554a(cls);
        return false;
    }

    /* renamed from: a */
    public static boolean m265556a(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        C68362b.m265229a((Object) disposable, "next is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        m265554a(cls);
        return false;
    }
}
