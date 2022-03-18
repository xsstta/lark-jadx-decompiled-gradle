package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30041c;
import com.ss.android.lark.calendar.wrapper.impl.tabspec.CalendarTabPageSpec;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalAppLink;", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLinkDependency;", "()V", "clickCalendarTab", "", "context", "Landroid/content/Context;", "showCalendarView", ShareHitPoint.f121869d, "", "date", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.d */
public final class CalAppLink implements AbstractC30041c {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30041c
    /* renamed from: a */
    public void mo108208a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        ((ICoreApi) api).getMainLauncher().mo105706b(context, "calendar");
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30041c
    /* renamed from: a */
    public void mo108209a(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "date");
        Bundle a = CalendarTabPageSpec.f83898d.mo120474a(str, str2);
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        ((ICoreApi) api).getMainLauncher().mo105707b(context, "calendar", a);
    }
}
