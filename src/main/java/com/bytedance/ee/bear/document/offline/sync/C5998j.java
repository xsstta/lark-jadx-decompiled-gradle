package com.bytedance.ee.bear.document.offline.sync;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.j */
public class C5998j extends AbstractC5983c {
    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
    }

    public C5998j() {
        this.f16764a = "MindnotePreloadStrategy";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5983c, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        this.f16770g = account.f14592i + "_" + account.f14584a + "_MINDNOTE_CLIENT_VARS";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        if (TextUtils.isEmpty(this.f16770g)) {
            return new C5968f();
        }
        C5968f d = C5955d.m24025b().mo24098d(this.f16770g, str);
        if (!(d == null || this.f16773j == null)) {
            this.f16773j.mo24233a(str, d.mo24139e().longValue());
        }
        return d;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, (Object) "MINDNOTE");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("member_id", (Object) this.f16772i);
            jSONObject2.put("base_rev", (Object) 0);
            jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, (Object) 0);
            jSONObject2.put(ShareHitPoint.f121869d, (Object) "CLIENT_VARS");
            jSONObject2.put("token", (Object) str);
            jSONObject2.put("open_type", (Object) 1);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) jSONObject2);
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, (Object) 2);
            return jSONObject;
        } catch (Exception e) {
            String str2 = this.f16764a;
            C13479a.m54758a(str2, "consumeMindnote()... e = " + e);
            return null;
        }
    }
}
