package com.ss.android.lark.widget.photo_picker_impl.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/base/PPThreadPool;", "", "()V", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.a.i */
public final class PPThreadPool {

    /* renamed from: a */
    public static ExecutorService f145729a = Executors.newCachedThreadPool();

    /* renamed from: b */
    public static final Companion f145730b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rR\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/base/PPThreadPool$Companion;", "", "()V", "executors", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getExecutors", "()Ljava/util/concurrent/ExecutorService;", "setExecutors", "(Ljava/util/concurrent/ExecutorService;)V", "submit", "Ljava/util/concurrent/Future;", "task", "Ljava/util/concurrent/Callable;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.a.i$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ExecutorService mo199578a() {
            return PPThreadPool.f145729a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Future<Object> mo199579a(Callable<Object> callable) {
            Intrinsics.checkParameterIsNotNull(callable, "task");
            Future<Object> submit = mo199578a().submit(callable);
            Intrinsics.checkExpressionValueIsNotNull(submit, "executors.submit(task)");
            return submit;
        }
    }
}
