package com.ss.android.lark.passport.infra.util.p2441c;

import android.os.Looper;
import com.larksuite.framework.thread.CoreThreadPool;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.passport.infra.util.c.c */
public final class C49168c {
    /* renamed from: a */
    public static final void m193879a(ExecutorService executorService, boolean z, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(executorService, "executor");
        Intrinsics.checkParameterIsNotNull(function0, "runnable");
        if (!(!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) || !z) {
            executorService.execute(new RunnableC49169d(function0));
        } else {
            function0.invoke();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m193880a(ExecutorService executorService, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            executorService = coreThreadPool.getFixedThreadPool();
            Intrinsics.checkExpressionValueIsNotNull(executorService, "CoreThreadPool.getDefault().fixedThreadPool");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        m193879a(executorService, z, function0);
    }
}
