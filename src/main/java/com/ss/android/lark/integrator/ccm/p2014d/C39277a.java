package com.ss.android.lark.integrator.ccm.p2014d;

import android.graphics.RectF;
import android.view.View;
import com.bytedance.ee.bear.lark.p414b.AbstractC7992e;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.d.a */
public class C39277a implements AbstractC7992e {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7992e
    /* renamed from: a */
    public void mo30984a() {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).dismissEnterpriseTopicCard();
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7992e
    /* renamed from: a */
    public void mo30985a(String str, String str2, String str3, RectF rectF, View view, String str4, String str5, IGetDataCallback<String> iGetDataCallback) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).showEnterpriseTopic(str, str2, str3, rectF, view, str4, GetEnterpriseTopicRequest.Scene.DOCS, str5, iGetDataCallback);
    }
}
