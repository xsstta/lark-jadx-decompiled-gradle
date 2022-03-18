package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30033ac;
import com.ss.android.lark.calendar.wrapper.impl.tabspec.CalendarTabPageSpec;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.ab */
public class C39190ab implements AbstractC30033ac {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30033ac
    /* renamed from: a */
    public void mo108175a(Context context, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).launchMainWindow(context, str, CalendarTabPageSpec.f83898d.mo120473a());
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30033ac
    /* renamed from: a */
    public void mo108176a(Context context, String str, String str2, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSearchMainPageFromCalendar(context, str, str2, i);
    }
}
