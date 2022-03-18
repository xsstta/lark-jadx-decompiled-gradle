package com.ss.android.vesdk.keyvaluepair;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.keyvaluepair.a */
public class C64030a {

    /* renamed from: a */
    private Map<String, String> f161672a = new HashMap();

    /* renamed from: b */
    private StringBuilder f161673b = new StringBuilder();

    /* renamed from: c */
    private boolean f161674c = true;

    /* renamed from: a */
    public JSONObject mo221706a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f161672a.keySet()) {
                jSONObject.put(str, this.f161672a.get(str));
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C64030a mo221705a(String str, String str2) {
        this.f161672a.put(str, str2);
        m251307b(str, str2);
        return this;
    }

    /* renamed from: b */
    private void m251307b(String str, String str2) {
        if (!this.f161674c) {
            this.f161673b.append(",");
        }
        this.f161673b.append("\"");
        this.f161673b.append(str);
        this.f161673b.append("\"");
        this.f161673b.append(":");
        this.f161673b.append("\"");
        this.f161673b.append(str2);
        this.f161673b.append("\"");
        if (this.f161674c) {
            this.f161674c = false;
        }
    }

    /* renamed from: a */
    public C64030a mo221704a(String str, int i) {
        Map<String, String> map = this.f161672a;
        map.put(str, i + "");
        m251307b(str, i + "");
        return this;
    }
}
