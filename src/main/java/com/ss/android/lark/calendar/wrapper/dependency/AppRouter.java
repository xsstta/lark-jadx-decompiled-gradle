package com.ss.android.lark.calendar.wrapper.dependency;

import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30042d;
import com.ss.android.lark.integrator.calendar.dependency.AppRouterBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/dependency/AppRouter;", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppRouterDependency;", "()V", "build", "Lcom/ss/android/lark/integrator/calendar/dependency/AppRouterBuilder;", "targetClass", "Ljava/lang/Class;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.dependency.a */
public final class AppRouter implements AbstractC30042d {
    /* renamed from: b */
    public AppRouterBuilder mo108210a(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "targetClass");
        return new AppRouterBuilder(cls);
    }
}
