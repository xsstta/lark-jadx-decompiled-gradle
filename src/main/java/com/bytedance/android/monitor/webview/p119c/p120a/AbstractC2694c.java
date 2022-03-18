package com.bytedance.android.monitor.webview.p119c.p120a;

import com.bytedance.android.monitor.p104a.AbstractC2631c;
import com.bytedance.android.monitor.p106c.C2645c;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.C2711i;
import com.bytedance.android.monitor.webview.p119c.p121b.C2697b;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.a.c */
public abstract class AbstractC2694c extends AbstractC2631c implements AbstractC2693b {

    /* renamed from: a */
    private String f8553a;

    /* renamed from: b */
    private String f8554b;

    /* renamed from: c */
    private String f8555c;

    /* renamed from: d */
    public C2697b f8556d;

    /* renamed from: e */
    private JSONObject f8557e;

    /* renamed from: f */
    private JSONObject f8558f;

    /* renamed from: j */
    public abstract AbstractC2692a mo11408d();

    @Override // com.bytedance.android.monitor.p104a.AbstractC2631c
    /* renamed from: b */
    public C2645c mo11407c() {
        return this.f8556d;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: e */
    public JSONObject mo11411e() {
        return this.f8558f;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: f */
    public JSONObject mo11412f() {
        return this.f8557e;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: g */
    public String mo11413g() {
        return this.f8554b;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: h */
    public String mo11414h() {
        return this.f8555c;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: i */
    public String mo11415i() {
        return this.f8553a;
    }

    @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2693b
    /* renamed from: l */
    public void mo11607l() {
        if (mo11408d() != null) {
            mo11408d().mo11602b();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2693b
    /* renamed from: k */
    public boolean mo11606k() {
        if (mo11408d() != null) {
            return mo11408d().mo11603c();
        }
        return true;
    }

    /* renamed from: a */
    public void mo11608a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f8557e = new JSONObject();
            this.f8558f = new JSONObject();
            C2657e.m11175a(this.f8557e, jSONObject.optJSONObject("jsBase"));
            C2657e.m11175a(this.f8558f, jSONObject.optJSONObject("jsInfo"));
        }
    }

    public AbstractC2694c(C2697b bVar, String str, String str2) {
        this.f8556d = bVar;
        this.f8553a = C2711i.m11492d().mo11663e(bVar.mo11613b().get());
        this.f8554b = str;
        this.f8555c = str2;
    }
}
