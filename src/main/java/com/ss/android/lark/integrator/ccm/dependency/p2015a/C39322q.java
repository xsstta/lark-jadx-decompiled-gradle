package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.lark.p414b.AbstractC7995h;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.q */
public class C39322q implements AbstractC7995h {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7995h
    /* renamed from: a */
    public boolean mo30994a(String str) {
        return C37239a.m146648b().mo136951a(str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7995h
    /* renamed from: b */
    public String mo30995b(String str) {
        if ("suite_hybrid_config".equals(str)) {
            return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getHybridMaterialConfig();
        }
        return "";
    }
}
