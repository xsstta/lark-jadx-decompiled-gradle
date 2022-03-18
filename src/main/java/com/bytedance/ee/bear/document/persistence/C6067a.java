package com.bytedance.ee.bear.document.persistence;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;

/* renamed from: com.bytedance.ee.bear.document.persistence.a */
public class C6067a extends C4918a {

    /* renamed from: a */
    public PersistenceSharedPreference f16952a;

    /* renamed from: com.bytedance.ee.bear.document.persistence.a$a */
    class C6068a implements AbstractC7945d<JsPreference> {
        C6068a() {
        }

        /* renamed from: a */
        public void handle(JsPreference jsPreference, AbstractC7947h hVar) {
            String key = jsPreference.getKey();
            if (key != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", (Object) ((String) C6067a.this.f16952a.mo34038b(key, new JSONObject().toString())));
                hVar.mo17188a(jSONObject);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.persistence.a$b */
    class C6069b implements AbstractC7945d<JsPreference> {
        C6069b() {
        }

        /* renamed from: a */
        public void handle(JsPreference jsPreference, AbstractC7947h hVar) {
            String key = jsPreference.getKey();
            String value = jsPreference.getValue();
            if (key != null && value != null) {
                C6067a.this.f16952a.mo34037a(key, value);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        this.f16952a = new PersistenceSharedPreference("JSPreference");
        mo19344a("biz.util.setPreference", new C6069b());
        mo19344a("biz.util.getPreference", new C6068a());
    }
}
