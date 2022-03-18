package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30053r;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30024b;
import com.ss.android.lark.location.p2146b.AbstractC41558b;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.q */
public class C39219q implements AbstractC30053r {

    /* renamed from: a */
    private final ICoreApi f100518a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30053r
    /* renamed from: a */
    public AbstractC30024b mo108267a() {
        final AbstractC41558b calendarMap = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCalendarMap();
        return new AbstractC30024b() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39219q.C392201 */

            @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30024b
            /* renamed from: a */
            public void mo108158a() {
                calendarMap.mo149568e();
            }

            @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30024b
            /* renamed from: a */
            public void mo108159a(double d, double d2) {
                calendarMap.mo149539a(d, d2);
            }

            @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30024b
            /* renamed from: a */
            public View mo108157a(Context context, Bundle bundle, boolean z) {
                return calendarMap.mo149538a(context, bundle, z);
            }
        };
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30053r
    /* renamed from: a */
    public void mo108268a(Activity activity, String str, double d, double d2, int i) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).showLocationDialog(activity, str, d, d2, i);
    }
}
