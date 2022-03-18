package com.bytedance.apm.p124a.p127c;

import com.bytedance.apm.p152m.C3045a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.c.a */
public class C2755a {

    /* renamed from: a */
    private static volatile C2755a f8857a;

    /* renamed from: b */
    private C3045a<JSONObject> f8858b = new C3045a<>(20);

    /* renamed from: b */
    public List<JSONObject> mo11825b() {
        return this.f8858b.mo12876a();
    }

    private C2755a() {
    }

    /* renamed from: a */
    public static C2755a m11711a() {
        if (f8857a == null) {
            synchronized (C2755a.class) {
                if (f8857a == null) {
                    f8857a = new C2755a();
                }
            }
        }
        return f8857a;
    }

    /* renamed from: a */
    public void mo11824a(JSONObject jSONObject) {
        this.f8858b.mo12877a(jSONObject);
    }
}
