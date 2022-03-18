package com.ss.android.lark.mail.impl.mailtoolbar.p2198a;

import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.mail.impl.mailtoolbar.bridgemodel.BridgeSelecttionChangeModel;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.a.c */
public class C42756c implements AbstractC7948j<BridgeSelecttionChangeModel> {

    /* renamed from: a */
    private AbstractC42758e f108896a;

    public C42756c(AbstractC42758e eVar) {
        this.f108896a = eVar;
    }

    /* renamed from: a */
    public void handle(BridgeSelecttionChangeModel bridgeSelecttionChangeModel, AbstractC7947h hVar) {
        String str;
        C13479a.m54772d("BridgeJSResizeYHandler", "handle()... ");
        AbstractC42758e eVar = this.f108896a;
        if (eVar == null || bridgeSelecttionChangeModel == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("readyHandler data: ");
            if (bridgeSelecttionChangeModel == null) {
                str = "";
            } else {
                str = bridgeSelecttionChangeModel.toString();
            }
            sb.append(str);
            C13479a.m54764b("BridgeJSResizeYHandler", sb.toString());
            return;
        }
        eVar.mo153516a(bridgeSelecttionChangeModel);
    }
}
