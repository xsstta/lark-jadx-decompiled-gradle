package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.lark.p414b.AbstractC8007p;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.af */
public class C39286af implements AbstractC8007p {
    /* renamed from: d */
    private String m154961d(int i) {
        return i != 2 ? "normal_v2" : "at_v2";
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8007p
    /* renamed from: b */
    public boolean mo31020b(int i) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSoundOn(m154961d(i));
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8007p
    /* renamed from: c */
    public String mo31021c(int i) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDetail(m154961d(i)).toString();
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8007p
    /* renamed from: a */
    public boolean mo31019a(int i) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isVibrateOn(m154961d(i));
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8007p
    /* renamed from: a */
    public void mo31018a(String str, String str2, String str3, String str4) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).sendNotificationShowEvent(str, str2, System.currentTimeMillis(), str3, str4);
    }
}
