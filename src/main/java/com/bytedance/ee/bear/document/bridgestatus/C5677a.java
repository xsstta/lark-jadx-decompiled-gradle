package com.bytedance.ee.bear.document.bridgestatus;

import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.bridgestatus.a */
public class C5677a implements AbstractC7945d<String> {

    /* renamed from: a */
    private final String f16047a = "BridgePreloadReadyHandler";

    /* renamed from: b */
    private AbstractC5678b f16048b;

    public C5677a(AbstractC5678b bVar) {
        this.f16048b = bVar;
    }

    /* renamed from: a */
    public void handle(String str, AbstractC7947h hVar) {
        C13479a.m54772d("BridgePreloadReadyHandler", "handle()... data: " + str);
        AbstractC5678b bVar = this.f16048b;
        if (bVar != null && str != null) {
            bVar.ready(new BridgeReadyModel());
        }
    }
}
