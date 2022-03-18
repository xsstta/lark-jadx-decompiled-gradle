package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30036af;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.ae */
public class C39193ae implements AbstractC30036af {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30036af
    /* renamed from: a */
    public void mo108184a() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startFromCardWithKeyDoc();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30036af
    /* renamed from: b */
    public void mo108187b() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startFromCardWithKeyChatWindow();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30036af
    /* renamed from: a */
    public void mo108185a(String str) {
        Statistics.sendEvent(str);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30036af
    /* renamed from: a */
    public void mo108186a(String str, JSONObject jSONObject) {
        Statistics.sendEvent(str, jSONObject);
    }
}
