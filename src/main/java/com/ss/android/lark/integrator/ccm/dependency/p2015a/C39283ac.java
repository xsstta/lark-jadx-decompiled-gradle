package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.apm.ApmAgent;
import com.bytedance.ee.bear.contract.p279c.AbstractC5118a;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ac */
class C39283ac implements AbstractC5118a {
    C39283ac() {
    }

    @Override // com.bytedance.ee.bear.contract.p279c.AbstractC5118a
    /* renamed from: a */
    public void mo20223a(String str, float f) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, (double) f);
            ApmAgent.monitorPerformance("start", str, jSONObject, null, null);
        } catch (Exception unused) {
        }
    }
}
