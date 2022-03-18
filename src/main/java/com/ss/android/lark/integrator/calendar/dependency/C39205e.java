package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30043e;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.ccm_api.p1592a.C32804a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.e */
public class C39205e implements AbstractC30043e {

    /* renamed from: a */
    private final ICoreApi f100494a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30043e
    /* renamed from: b */
    public void mo108212b(Context context, String str) {
        this.f100494a.openUrl(context, str);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30043e
    /* renamed from: a */
    public void mo108211a(Context context, String str) {
        this.f100494a.openUrl(context, str, UrlParams.m108857a().mo105523a(), new C32804a().mo120923a("calendar").mo120925a());
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30043e
    /* renamed from: c */
    public void mo108213c(Context context, String str) {
        Map<String, String> a = new C32804a().mo120923a("calendar").mo120925a();
        a.put("sourceType", "conference_records");
        this.f100494a.openUrl(context, str, UrlParams.m108857a().mo105523a(), a);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30043e
    /* renamed from: d */
    public void mo108214d(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("mountNodeToken", "");
        hashMap.put("mountPoint", "calendar");
        hashMap.put("bussinessId", "calendar");
        SpaceRouteBean spaceRouteBean = new SpaceRouteBean();
        spaceRouteBean.mo20957a(12);
        spaceRouteBean.mo20959a(str);
        spaceRouteBean.mo20962b("thirdparty_attachment");
        spaceRouteBean.mo20960a(hashMap);
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).openDocs(spaceRouteBean);
    }
}
