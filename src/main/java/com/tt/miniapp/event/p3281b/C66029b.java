package com.tt.miniapp.event.p3281b;

import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b.b */
public class C66029b {

    /* renamed from: a */
    public String f166686a;

    /* renamed from: b */
    public JSONObject f166687b;

    /* renamed from: c */
    public boolean f166688c;

    /* renamed from: d */
    public String f166689d;

    public int hashCode() {
        return (this.f166686a.hashCode() * 31) + this.f166689d.hashCode();
    }

    public String toString() {
        return "{eventName='" + this.f166686a + '\'' + ", eventData=" + this.f166687b + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C66029b bVar = (C66029b) obj;
        if (!this.f166686a.equals(bVar.f166686a)) {
            return false;
        }
        return this.f166689d.equals(bVar.f166689d);
    }

    public C66029b(String str, JSONObject jSONObject, boolean z) {
        this(str, jSONObject, z, C66030c.m258561a(str, jSONObject));
    }

    private C66029b(String str, JSONObject jSONObject, boolean z, String str2) {
        this.f166686a = str;
        this.f166687b = jSONObject;
        this.f166688c = z;
        this.f166689d = str2;
    }
}
