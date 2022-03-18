package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.p1430a.p1431a.aj;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalZenModeDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IZenModeDependency;", "()V", "isCurrentUserInZenMode", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.ai */
public final class CalZenModeDependency implements aj {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.aj
    /* renamed from: a */
    public boolean mo108204a() {
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        return ((ICoreApi) api).isCurrentUserInZenMode();
    }
}
