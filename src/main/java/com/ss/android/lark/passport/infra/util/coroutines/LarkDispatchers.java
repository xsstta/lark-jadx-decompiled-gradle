package com.ss.android.lark.passport.infra.util.coroutines;

import com.larksuite.framework.thread.CoreThreadPool;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/coroutines/LarkDispatchers;", "", "()V", "CPU", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getCPU", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "IO", "getIO", "Main", "Lkotlinx/coroutines/CoroutineDispatcher;", "getMain", "()Lkotlinx/coroutines/CoroutineDispatcher;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.a.b */
public final class LarkDispatchers {

    /* renamed from: a */
    public static final LarkDispatchers f123416a = new LarkDispatchers();

    /* renamed from: b */
    private static final ExecutorCoroutineDispatcher f123417b;

    /* renamed from: c */
    private static final ExecutorCoroutineDispatcher f123418c;

    /* renamed from: d */
    private static final CoroutineDispatcher f123419d;

    private LarkDispatchers() {
    }

    /* renamed from: a */
    public final ExecutorCoroutineDispatcher mo171626a() {
        return f123418c;
    }

    /* renamed from: b */
    public final CoroutineDispatcher mo171627b() {
        return f123419d;
    }

    static {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        ExecutorService cachedThreadPool = coreThreadPool.getCachedThreadPool();
        Intrinsics.checkExpressionValueIsNotNull(cachedThreadPool, "CoreThreadPool.getDefault().cachedThreadPool");
        f123417b = bl.m266382a(cachedThreadPool);
        CoreThreadPool coreThreadPool2 = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool2, "CoreThreadPool.getDefault()");
        ExecutorService fixedThreadPool = coreThreadPool2.getFixedThreadPool();
        Intrinsics.checkExpressionValueIsNotNull(fixedThreadPool, "CoreThreadPool.getDefault().fixedThreadPool");
        f123418c = bl.m266382a(fixedThreadPool);
        CoreThreadPool coreThreadPool3 = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool3, "CoreThreadPool.getDefault()");
        Executor uIExecutor = coreThreadPool3.getUIExecutor();
        Intrinsics.checkExpressionValueIsNotNull(uIExecutor, "CoreThreadPool.getDefault().uiExecutor");
        f123419d = bl.m266381a(uIExecutor);
    }
}
