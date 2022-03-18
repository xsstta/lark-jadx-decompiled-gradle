package com.ss.android.lark.passport.infra.base.network;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.android.C69367c;
import kotlinx.coroutines.android.HandlerDispatcher;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"FastMain", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getFastMain", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "asHandler", "Landroid/os/Handler;", "Landroid/os/Looper;", "async", "", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.b */
public final class C49070b {

    /* renamed from: a */
    private static final HandlerDispatcher f123233a;

    /* renamed from: a */
    public static final HandlerDispatcher m193384a() {
        return f123233a;
    }

    static {
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        f123233a = C69367c.m266289a(m193383a(mainLooper, true), "passport-main");
    }

    /* renamed from: a */
    public static final Handler m193383a(Looper looper, boolean z) {
        Intrinsics.checkParameterIsNotNull(looper, "$this$asHandler");
        if (!z || Build.VERSION.SDK_INT < 16) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
            Intrinsics.checkExpressionValueIsNotNull(declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Object newInstance = declaredConstructor.newInstance(looper, null, true);
            Intrinsics.checkExpressionValueIsNotNull(newInstance, "constructor.newInstance(this, null, true)");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
