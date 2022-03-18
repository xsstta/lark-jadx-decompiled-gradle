package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.lark.p414b.AbstractC7989b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.c */
public class C39297c implements AbstractC7989b {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7989b
    /* renamed from: a */
    public boolean mo30981a() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isAppFront();
    }
}
