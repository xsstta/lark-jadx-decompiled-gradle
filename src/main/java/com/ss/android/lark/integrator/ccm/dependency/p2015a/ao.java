package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.app.Activity;
import com.bytedance.ee.bear.search.AbstractC10819d;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ao */
class ao implements AbstractC10819d {
    ao() {
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10819d
    /* renamed from: a */
    public void mo40916a(Activity activity, ArrayList<String> arrayList, String str, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openPickChatterFilterPageFromDoc(activity, arrayList, str, i);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10819d
    /* renamed from: b */
    public void mo40917b(Activity activity, ArrayList<String> arrayList, String str, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openPickChatFilterPageFromDoc(activity, arrayList, str, i);
    }
}
