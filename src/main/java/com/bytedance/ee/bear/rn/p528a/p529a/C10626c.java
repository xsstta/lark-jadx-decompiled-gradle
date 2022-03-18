package com.bytedance.ee.bear.rn.p528a.p529a;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* renamed from: com.bytedance.ee.bear.rn.a.a.c */
public class C10626c extends AbstractC10630i {

    /* renamed from: b */
    private String f28547b = "";

    /* renamed from: c */
    private boolean f28548c;

    @Override // com.bytedance.ee.bear.rn.p528a.p529a.AbstractC10630i, com.bytedance.ee.bridge.p597a.AbstractC12582b
    /* renamed from: a */
    public String mo40271a() {
        return this.f28547b;
    }

    /* renamed from: b */
    public boolean mo40273b() {
        return this.f28548c;
    }

    @Override // com.bytedance.ee.bear.rn.p528a.p529a.AbstractC10630i, com.bytedance.ee.bridge.p597a.AbstractC12582b
    /* renamed from: a */
    public void mo40272a(String str) {
        this.f28550a = str;
        m44127b(str);
    }

    /* renamed from: b */
    private void m44127b(String str) {
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject != null) {
                if (parseObject.containsKey(HiAnalyticsConstant.HaKey.BI_KEY_APINAME)) {
                    this.f28548c = true;
                } else {
                    JSONObject jSONObject = parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("header");
                    if (jSONObject != null) {
                        this.f28547b = jSONObject.getString("requestId");
                    }
                }
            }
        } catch (Exception e) {
            C13479a.m54759a("JSDocResponse", "parseJson exception", e);
        }
        if (this.f28547b == null) {
            this.f28547b = "";
        }
    }
}
