package com.ss.android.lark.moments.impl.common;

import com.larksuite.framework.thread.CoreThreadPool;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/MomentsDispatcher;", "", "()V", "IO", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getIO", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "IO$delegate", "Lkotlin/Lazy;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.b */
public final class MomentsDispatcher {

    /* renamed from: a */
    public static final MomentsDispatcher f119247a = new MomentsDispatcher();

    /* renamed from: b */
    private static final Lazy f119248b = LazyKt.lazy(C47279a.INSTANCE);

    /* renamed from: a */
    public final ExecutorCoroutineDispatcher mo166168a() {
        return (ExecutorCoroutineDispatcher) f119248b.getValue();
    }

    private MomentsDispatcher() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.b$a */
    static final class C47279a extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47279a INSTANCE = new C47279a();

        C47279a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-io");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…hreadPool(\"lk-moment-io\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }
}
