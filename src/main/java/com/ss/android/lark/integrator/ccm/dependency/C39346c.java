package com.ss.android.lark.integrator.ccm.dependency;

import android.app.Activity;
import android.app.Application;
import com.bytedance.ee.bear.basesdk.AbstractC4463c;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.integrator.ccm.dependency.c */
public class C39346c implements AbstractC4463c {
    C39346c() {
    }

    /* renamed from: e */
    private boolean m155089e() {
        return !((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isPrimaryHost();
    }

    @Override // com.bytedance.ee.bear.basesdk.AbstractC4463c
    /* renamed from: b */
    public long mo17231b() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getBeginCreateApplicationTime();
    }

    @Override // com.bytedance.ee.bear.basesdk.AbstractC4463c
    /* renamed from: c */
    public Activity mo17232c() {
        return C29410a.m108289c().mo104290d();
    }

    @Override // com.bytedance.ee.bear.basesdk.AbstractC4463c
    /* renamed from: d */
    public Activity mo17233d() {
        return C29410a.m108289c().mo104289c();
    }

    @Override // com.bytedance.ee.bear.basesdk.AbstractC4463c
    /* renamed from: a */
    public String mo17229a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Lark");
        if (m155089e()) {
            str = " from/lark_tab";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.bytedance.ee.bear.basesdk.AbstractC4463c
    /* renamed from: a */
    public String mo17230a(Application application) {
        return C26252ad.m94992a(application);
    }
}
