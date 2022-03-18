package com.bytedance.ee.bear.document.vibra;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13630j;

/* renamed from: com.bytedance.ee.bear.document.vibra.a */
public class C6279a extends C4918a {

    /* renamed from: com.bytedance.ee.bear.document.vibra.a$a */
    private class C6281a implements AbstractC7945d<VibrateMsg> {
        private C6281a() {
        }

        /* renamed from: a */
        public void handle(VibrateMsg vibrateMsg, AbstractC7947h hVar) {
            C13479a.m54764b("VibrateWebService", "Vibrate:" + vibrateMsg);
            if (vibrateMsg != null) {
                C13630j.m55310a(C6279a.this.mo19345b(), vibrateMsg.time, vibrateMsg.strength);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.util.triggerShake", new C6281a());
    }
}
