package com.ss.android.lark.browser.biz.webapp;

import com.ss.android.lark.biz.core.api.aq;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.browser.biz.webapp.b */
public class C29878b {

    /* renamed from: a */
    private Map<String, String> f74615a;

    /* renamed from: b */
    private Map<aq, aq> f74616b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.biz.webapp.b$a */
    public static class C29880a {

        /* renamed from: a */
        public static final C29878b f74617a = new C29878b();
    }

    /* renamed from: a */
    public static C29878b m110476a() {
        return C29880a.f74617a;
    }

    /* renamed from: b */
    public Map<aq, aq> mo107587b() {
        return this.f74616b;
    }

    private C29878b() {
        this.f74615a = new HashMap();
        this.f74616b = new HashMap();
    }

    /* renamed from: a */
    public void mo107586a(aq aqVar) {
        this.f74616b.put(aqVar, aqVar);
    }

    /* renamed from: b */
    public void mo107588b(aq aqVar) {
        if (this.f74616b.containsKey(aqVar)) {
            this.f74616b.remove(aqVar);
        }
    }
}
