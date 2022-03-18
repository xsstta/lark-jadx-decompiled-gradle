package com.ss.android.photoeditor.ve.p3018e;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.thread.CoreThreadPool;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\u0005"}, d2 = {"doAsyncInIo", "", "r", "Lkotlin/Function0;", "doInUIThread", "photoeditor_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.h */
public final class C59905h {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/photoeditor/ve/utils/ThreadUtilsKt$doAsyncInIo$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.e.h$a */
    public static final class RunnableC59906a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Function0 f149209a;

        RunnableC59906a(Function0 function0) {
            this.f149209a = function0;
        }

        public final void run() {
            this.f149209a.invoke();
        }
    }

    /* renamed from: a */
    public static final void m232489a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "r");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        ExecutorService cachedThreadPool = coreThreadPool.getCachedThreadPool();
        if (cachedThreadPool != null) {
            cachedThreadPool.execute(new RunnableC59906a(function0));
        }
    }

    /* renamed from: b */
    public static final void m232490b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "r");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC59907i(function0));
        }
    }
}
