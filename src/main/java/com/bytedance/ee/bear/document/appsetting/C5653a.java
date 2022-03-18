package com.bytedance.ee.bear.document.appsetting;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.appsetting.a */
public class C5653a extends C4918a {

    /* renamed from: com.bytedance.ee.bear.document.appsetting.a$a */
    private static class C5655a implements AbstractC7945d<Void> {
        private C5655a() {
        }

        /* renamed from: a */
        public void handle(Void r4, AbstractC7947h hVar) {
            if (hVar == null) {
                C13479a.m54758a("MinaConfigHandler", "handle, callback is null");
                return;
            }
            JSONObject parseObject = JSONObject.parseObject((String) C4211a.m17514a().mo16533a("app_config", "{}"));
            C13479a.m54772d("MinaConfigHandler", "callback = " + parseObject);
            hVar.mo17188a(parseObject);
        }
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.user.onMinaConfigChange", new C5655a());
        mo19344a("biz.user.onFGConfigChange", new C5656b());
    }
}
