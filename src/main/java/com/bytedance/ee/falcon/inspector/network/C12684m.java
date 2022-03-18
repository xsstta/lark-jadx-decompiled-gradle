package com.bytedance.ee.falcon.inspector.network;

import com.bytedance.ee.falcon.inspector.protocol.module.Page;

/* renamed from: com.bytedance.ee.falcon.inspector.network.m */
public class C12684m {

    /* renamed from: a */
    private final C12672h<Page.ResourceType> f33938a;

    public C12684m() {
        C12672h<Page.ResourceType> hVar = new C12672h<>();
        this.f33938a = hVar;
        hVar.mo48051a("text/css", Page.ResourceType.STYLESHEET);
        hVar.mo48051a("image/*", Page.ResourceType.IMAGE);
        hVar.mo48051a("application/x-javascript", Page.ResourceType.SCRIPT);
        hVar.mo48051a("text/javascript", Page.ResourceType.XHR);
        hVar.mo48051a("application/json", Page.ResourceType.XHR);
        hVar.mo48051a("text/*", Page.ResourceType.DOCUMENT);
        hVar.mo48051a("*", Page.ResourceType.OTHER);
    }

    /* renamed from: a */
    public Page.ResourceType mo48070a(String str) {
        return this.f33938a.mo48050a(mo48071b(str));
    }

    /* renamed from: b */
    public String mo48071b(String str) {
        int indexOf = str.indexOf(59);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return str;
    }
}
