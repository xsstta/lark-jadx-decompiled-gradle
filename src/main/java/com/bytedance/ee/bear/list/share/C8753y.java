package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.dto.Document;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.share.y */
public class C8753y extends C8277e {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public Document mo32561a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        Document a = super.mo32561a(jSONObject, jSONObject2, z);
        if (a != null) {
            a.mo32478q(jSONObject.optString("share_time"));
            a.mo32454j(jSONObject.optString("obj_token"));
        }
        return a;
    }
}
