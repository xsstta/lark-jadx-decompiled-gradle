package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.services.C4508f;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.m */
class C39318m implements C4508f.AbstractC4509a {
    C39318m() {
    }

    @Override // com.bytedance.ee.bear.basesdk.services.C4508f.AbstractC4509a
    /* renamed from: a */
    public boolean mo17339a(Context context, String str) throws Exception {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkSoNeedUpdate(context, str);
    }
}
