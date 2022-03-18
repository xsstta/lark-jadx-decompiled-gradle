package com.bytedance.ee.bear.document.appsetting;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.appsetting.b */
public class C5656b implements AbstractC7945d<FeatureGatingKey> {
    /* renamed from: a */
    public void handle(FeatureGatingKey featureGatingKey, AbstractC7947h hVar) {
        if (hVar == null) {
            C13479a.m54758a("FeatureGatingConfigHand", "handle, callback is null");
        } else if (featureGatingKey.getFeatureGatingKeys() == null) {
            C13479a.m54758a("FeatureGatingConfigHand", "handle, get FeatureGatingKeys is null");
        } else {
            JSONObject jSONObject = new JSONObject();
            for (String str : featureGatingKey.getFeatureGatingKeys()) {
                jSONObject.put(str, (Object) Boolean.valueOf(C4211a.m17514a().mo16536a(str, false)));
            }
            C13479a.m54772d("FeatureGatingConfigHand", "callback = " + jSONObject);
            hVar.mo17188a(jSONObject);
        }
    }
}
