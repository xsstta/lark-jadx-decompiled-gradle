package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.basesdk.AbstractC4483f;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Locale;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.u */
class C39339u implements AbstractC4483f {
    C39339u() {
    }

    @Override // com.bytedance.ee.bear.basesdk.AbstractC4483f
    /* renamed from: a */
    public Locale mo17251a() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageSetting();
    }
}
