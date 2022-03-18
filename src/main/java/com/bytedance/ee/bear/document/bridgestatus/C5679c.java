package com.bytedance.ee.bear.document.bridgestatus;

import android.text.TextUtils;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.bridgestatus.c */
public class C5679c implements AbstractC7945d<BridgeReadyModel> {

    /* renamed from: a */
    private final String f16049a = "BridgeReadyHandler";

    /* renamed from: b */
    private AbstractC5678b f16050b;

    public C5679c(AbstractC5678b bVar) {
        this.f16050b = bVar;
    }

    /* renamed from: a */
    public void handle(BridgeReadyModel bridgeReadyModel, AbstractC7947h hVar) {
        String str;
        C13479a.m54772d("BridgeReadyHandler", "handle()... ");
        if (this.f16050b == null || bridgeReadyModel == null || TextUtils.isEmpty(bridgeReadyModel.getType())) {
            StringBuilder sb = new StringBuilder();
            sb.append("readyHandler data: ");
            if (bridgeReadyModel == null) {
                str = "";
            } else {
                str = bridgeReadyModel.toString();
            }
            sb.append(str);
            C13479a.m54764b("BridgeReadyHandler", sb.toString());
            return;
        }
        this.f16050b.ready(bridgeReadyModel);
    }
}
