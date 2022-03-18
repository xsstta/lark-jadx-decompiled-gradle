package com.bytedance.ee.bear.list.recent;

import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.dto.Document;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.recent.c */
public class C8681c extends C8277e {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public Document mo32561a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        Document a = super.mo32561a(jSONObject, jSONObject2, z);
        if (a != null) {
            a.mo32476p(jSONObject.optString("open_time"));
            a.mo32497z(jSONObject.optString("my_edit_time"));
            a.mo32374A(jSONObject.optString("activity_time"));
        }
        return a;
    }
}
