package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.dependency.idependency.ICommonDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalCommonDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/ICommonDependency;", "()V", "isLowMemoryDevice", "", "context", "Landroid/content/Context;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.g */
public final class CalCommonDependency implements ICommonDependency {
    @Override // com.ss.android.lark.calendar.dependency.idependency.ICommonDependency
    /* renamed from: a */
    public boolean mo108227a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isLowMemoryDevice(context);
    }
}
