package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.contract.p280d.AbstractC5125a;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ai */
class C39289ai implements AbstractC5125a {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m154969d() {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).syncReactionOrder();
    }

    @Override // com.bytedance.ee.bear.contract.p280d.AbstractC5125a
    /* renamed from: a */
    public List<String> mo20283a() {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getRecentReactionList();
    }

    @Override // com.bytedance.ee.bear.contract.p280d.AbstractC5125a
    /* renamed from: b */
    public List<String> mo20287b() {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getWholeReactionList();
    }

    @Override // com.bytedance.ee.bear.contract.p280d.AbstractC5125a
    /* renamed from: c */
    public void mo20288c() {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).fetchEmojis();
    }

    public C39289ai() {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            UICallbackExecutor.executeDelayed($$Lambda$ai$_w7cJXo71MsvZtg4JdVlfO4_M1A.INSTANCE, 15000);
        }
    }

    @Override // com.bytedance.ee.bear.contract.p280d.AbstractC5125a
    /* renamed from: b */
    public String mo20286b(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getEmojiImage(C57881t.m224610I(LarkContext.getApplication()), str);
    }

    @Override // com.bytedance.ee.bear.contract.p280d.AbstractC5125a
    /* renamed from: a */
    public void mo20285a(String str) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).updateReactionOrder(str);
    }

    @Override // com.bytedance.ee.bear.contract.p280d.AbstractC5125a
    /* renamed from: a */
    public void mo20284a(int i, List<String> list) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).fetchEmojis(i, list);
    }
}
