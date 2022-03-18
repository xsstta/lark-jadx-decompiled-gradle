package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.bytedance.ee.bear.lark.p414b.AbstractC7991d;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.i */
public class C39313i implements AbstractC7991d {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7991d
    /* renamed from: a */
    public void mo30982a(Context context, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str, UrlParams.m108857a().mo105518a(UrlParams.Source.DOC).mo105523a());
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7991d
    /* renamed from: a */
    public void mo30983a(Context context, String str, Map<String, String> map) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str, UrlParams.m108857a().mo105523a(), map);
    }
}
