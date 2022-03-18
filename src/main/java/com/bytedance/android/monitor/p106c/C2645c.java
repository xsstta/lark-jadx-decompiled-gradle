package com.bytedance.android.monitor.p106c;

import com.bytedance.android.monitor.p104a.AbstractC2629a;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.p112i.C2658g;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.c.c */
public class C2645c extends AbstractC2629a {

    /* renamed from: a */
    public String f8406a;

    /* renamed from: b */
    public String f8407b = C2658g.m11184a();

    /* renamed from: c */
    public String f8408c = null;

    /* renamed from: d */
    public String f8409d = null;

    /* renamed from: e */
    public long f8410e = 0;

    /* renamed from: f */
    public String f8411f;

    /* renamed from: g */
    public JSONObject f8412g;

    /* renamed from: h */
    public long f8413h;

    /* renamed from: i */
    public Boolean f8414i;

    /* renamed from: b */
    public void mo11449b(JSONObject jSONObject) {
        if (this.f8412g == null) {
            this.f8412g = new JSONObject();
        }
        C2657e.m11175a(this.f8412g, jSONObject);
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
    /* renamed from: a */
    public void mo11404a(JSONObject jSONObject) {
        C2657e.m11174a(jSONObject, "navigation_id", this.f8407b);
        C2657e.m11174a(jSONObject, "url", this.f8406a);
        C2657e.m11174a(jSONObject, "container_type", this.f8408c);
        C2657e.m11172a(jSONObject, "click_start", this.f8410e);
        C2657e.m11174a(jSONObject, "sdk_version", "1.2.1-alpha.1");
        C2657e.m11174a(jSONObject, "virtual_aid", this.f8411f);
        C2657e.m11173a(jSONObject, "context", this.f8412g);
        C2657e.m11173a(jSONObject, "debug_context", new JSONObject());
        long j = this.f8413h;
        if (j != 0) {
            C2657e.m11172a(jSONObject, "container_init_ts", j);
        }
        Boolean bool = this.f8414i;
        if (bool != null) {
            C2657e.m11173a(jSONObject, "container_reuse", (Object) bool);
        }
    }

    /* renamed from: a */
    public void mo11448a(String str, Object obj) {
        if (this.f8412g == null) {
            this.f8412g = new JSONObject();
        }
        C2657e.m11173a(this.f8412g, str, obj);
    }
}
