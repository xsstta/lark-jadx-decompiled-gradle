package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30058x;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalPhoneDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IPhoneDependency;", "()V", "showPhoneCallDialog", "", "context", "Landroid/app/Activity;", "userName", "", "phoneNumber", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.w */
public final class CalPhoneDependency implements AbstractC30058x {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30058x
    /* renamed from: a */
    public void mo108290a(Activity activity, String str, String str2) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).showPhoneCallDialog(activity, str, str2);
    }
}
