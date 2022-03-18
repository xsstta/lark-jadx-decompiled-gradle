package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.doc.resupdate.AbstractC5470j;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.C54931a;
import com.ss.android.lark.utils.ApiUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ak */
public class ak implements AbstractC5470j {
    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: d */
    public long mo21881d() {
        return 300000;
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: c */
    public String mo21880c() {
        return DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_FE_RESOURCE_HOTFIX);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: a */
    public String mo21877a() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: b */
    public int mo21879b() {
        return C29410a.m108287a().mo104277a();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: e */
    public boolean mo21882e() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isOverseaTenantBrand();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: f */
    public boolean mo21883f() {
        return C37239a.m146648b().mo136951a("tt_gecko_hotfix");
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5470j
    /* renamed from: a */
    public void mo21878a(String str, JSONObject jSONObject) {
        C54931a.m213007a(str, jSONObject);
    }
}
