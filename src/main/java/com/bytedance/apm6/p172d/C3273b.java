package com.bytedance.apm6.p172d;

import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a;
import com.bytedance.apm6.util.C3356f;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.d.b */
public class C3273b extends AbstractC3329a {

    /* renamed from: g */
    private int f10477g;

    /* renamed from: h */
    private List<String> f10478h;

    /* renamed from: i */
    private boolean f10479i;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: a */
    public String mo13323a() {
        return "fd";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: b */
    public JSONObject mo13324b() {
        return null;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: d */
    public JSONObject mo13326d() {
        return C3331c.m13887a().mo13569c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: c */
    public JSONObject mo13325c() {
        JSONObject c = super.mo13325c();
        if (c == null) {
            try {
                c = new JSONObject();
            } catch (Exception unused) {
            }
        }
        c.put("is_front", this.f10479i);
        return c;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: e */
    public JSONObject mo13327e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fd_count", this.f10477g);
            if (!C3356f.m13964a(this.f10478h)) {
                jSONObject.put("fd_detail", C3356f.m13962a(this.f10478h, "\n"));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C3273b(int i, List<String> list, boolean z) {
        this.f10477g = i;
        this.f10478h = list;
        this.f10479i = z;
    }
}
