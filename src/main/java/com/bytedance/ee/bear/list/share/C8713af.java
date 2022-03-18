package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.share.af */
public class C8713af extends C8277e {

    /* renamed from: b */
    private boolean f23560b;

    public C8713af() {
    }

    C8713af(boolean z) {
        this.f23560b = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: c */
    public void mo32565c(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        super.mo32565c(documentListInfo, jSONObject);
        documentListInfo.setAll_visited(jSONObject.optBoolean("all_visited"));
        documentListInfo.setHas_hidden(jSONObject.optBoolean("has_hidden"));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public Document mo32561a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        Document a = super.mo32561a(jSONObject, jSONObject2, z);
        if (a != null) {
            a.mo32478q(jSONObject.optString("create_time"));
            a.mo32455j(this.f23560b);
        }
        return a;
    }
}
