package com.bytedance.ee.bear.middleground.docsdk.plugins.p450a;

import com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b;
import com.bytedance.ee.bear.document.bridgestatus.BridgeReadyModel;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.plugins.a.a */
public class C9314a implements AbstractC7945d<BridgeReadyModel> {

    /* renamed from: a */
    private AbstractC5678b f25047a;

    public C9314a(AbstractC5678b bVar) {
        this.f25047a = bVar;
    }

    /* renamed from: a */
    public void handle(BridgeReadyModel bridgeReadyModel, AbstractC7947h hVar) {
        String str;
        C13479a.m54772d("BridgeJSReadyHandler", "handle()... ");
        AbstractC5678b bVar = this.f25047a;
        if (bVar == null || bridgeReadyModel == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("readyHandler data: ");
            if (bridgeReadyModel == null) {
                str = "";
            } else {
                str = bridgeReadyModel.toString();
            }
            sb.append(str);
            C13479a.m54764b("BridgeJSReadyHandler", sb.toString());
            return;
        }
        bVar.ready(bridgeReadyModel);
    }
}
