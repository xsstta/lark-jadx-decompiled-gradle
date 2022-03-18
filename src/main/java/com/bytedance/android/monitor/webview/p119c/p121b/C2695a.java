package com.bytedance.android.monitor.webview.p119c.p121b;

import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2692a;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.b.a */
public class C2695a extends AbstractC2694c {

    /* renamed from: a */
    private C2696a f8559a = new C2696a("falconPerf");

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.android.monitor.webview.c.b.a$a */
    public class C2696a extends AbstractC2692a {

        /* renamed from: c */
        private JSONArray f8561c = new JSONArray();

        @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2692a
        /* renamed from: b */
        public void mo11602b() {
            mo11605e();
        }

        @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
        /* renamed from: a */
        public void mo11404a(JSONObject jSONObject) {
            C2657e.m11173a(jSONObject, "resource_list", this.f8561c);
        }

        public C2696a(String str) {
            super(str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c
    /* renamed from: j */
    public AbstractC2692a mo11408d() {
        return this.f8559a;
    }

    @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2693b, com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c
    /* renamed from: k */
    public boolean mo11606k() {
        return this.f8559a.mo11603c();
    }

    @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2693b, com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c
    /* renamed from: l */
    public void mo11607l() {
        this.f8559a.mo11602b();
    }

    public C2695a(C2697b bVar) {
        super(bVar, "falconPerf", bVar.f8408c);
    }
}
