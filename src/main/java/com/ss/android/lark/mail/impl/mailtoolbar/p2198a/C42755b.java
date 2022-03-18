package com.ss.android.lark.mail.impl.mailtoolbar.p2198a;

import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.mail.impl.mailtoolbar.bridgemodel.BridgeResizeYModel;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.a.b */
public class C42755b implements AbstractC7948j<BridgeResizeYModel> {

    /* renamed from: a */
    private AbstractC42757d f108895a;

    public C42755b(AbstractC42757d dVar) {
        this.f108895a = dVar;
    }

    /* renamed from: a */
    public void handle(BridgeResizeYModel bridgeResizeYModel, AbstractC7947h hVar) {
        String str;
        C13479a.m54772d("BridgeJSResizeYHandler", "handle()... ");
        AbstractC42757d dVar = this.f108895a;
        if (dVar == null || bridgeResizeYModel == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("readyHandler data: ");
            if (bridgeResizeYModel == null) {
                str = "";
            } else {
                str = bridgeResizeYModel.toString();
            }
            sb.append(str);
            C13479a.m54764b("BridgeJSResizeYHandler", sb.toString());
            return;
        }
        dVar.mo153515a(bridgeResizeYModel);
    }
}
