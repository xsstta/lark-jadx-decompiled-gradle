package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.util.p702e.C13657b;
import org.json.JSONObject;

public class ak extends C8277e {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: c */
    public void mo32565c(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        int i;
        super.mo32565c(documentListInfo, jSONObject);
        if (C13657b.m55421a(documentListInfo.getDocumentList())) {
            i = 0;
        } else {
            i = documentListInfo.getDocumentList().size();
        }
        documentListInfo.setTotal(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public Document mo32561a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        Document a = super.mo32561a(jSONObject, jSONObject2, z);
        if (a != null) {
            a.mo32480r("");
        }
        return a;
    }
}
