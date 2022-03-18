package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.lark.p414b.AbstractC8000k;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57858o;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.y */
public class C39343y implements AbstractC8000k {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8000k
    /* renamed from: a */
    public boolean mo31003a() {
        return false;
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8000k
    /* renamed from: a */
    public TabType mo31000a(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTabType(str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8000k
    /* renamed from: a */
    public void mo31001a(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openAboutPage(context);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8000k
    /* renamed from: a */
    public void mo31002a(Context context, String str, Bundle bundle) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105707b(context, str, bundle);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8000k
    /* renamed from: a */
    public Intent mo30999a(Context context, String str, String str2, String str3, int i, boolean z, boolean z2) {
        return C57858o.m224559a(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105704b()).mo196060a("key_doc_jump_detail", z).mo196058a("key_doc_url", str).mo196058a("key_doc_id", str2).mo196060a("key_doc_open_from_notice", z2).mo196058a("key_doc_message_id", str3).mo196050a(i).mo196066b(context);
    }
}
