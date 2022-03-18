package com.bytedance.ee.bear.document.share;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;

/* renamed from: com.bytedance.ee.bear.document.share.a */
public class C6154a implements AbstractC7945d<ShareItem> {

    /* renamed from: a */
    protected AbstractC7947h f17147a;

    /* renamed from: a */
    public void mo24844a(ShareItem shareItem) {
    }

    /* renamed from: a */
    public void mo24846a(String str) {
        if (this.f17147a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) str);
            this.f17147a.mo17188a(jSONObject);
        }
    }

    /* renamed from: a */
    public void handle(ShareItem shareItem, AbstractC7947h hVar) {
        this.f17147a = hVar;
        mo24844a(shareItem);
    }
}
