package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.banner.p249d.AbstractC4338a;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.h */
public class C39312h implements AbstractC4338a {
    @Override // com.bytedance.ee.bear.banner.p249d.AbstractC4338a
    /* renamed from: a */
    public AbstractC29479b mo16948a(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getBannerController(str);
    }
}
