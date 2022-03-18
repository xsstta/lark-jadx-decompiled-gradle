package com.ss.android.lark.mail.impl.mailtoolbar.p2198a;

import com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b;
import com.bytedance.ee.bear.document.bridgestatus.BridgeReadyModel;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.a.a */
public class C42754a implements AbstractC7948j<BridgeReadyModel> {

    /* renamed from: a */
    private AbstractC5678b f108894a;

    public C42754a(AbstractC5678b bVar) {
        this.f108894a = bVar;
    }

    /* renamed from: a */
    public void handle(BridgeReadyModel bridgeReadyModel, AbstractC7947h hVar) {
        String str;
        C13479a.m54772d("BridgeJSReadyHandler", "handle()... ");
        AbstractC5678b bVar = this.f108894a;
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
