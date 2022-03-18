package com.bytedance.android.monitor.p104a;

import com.bytedance.android.monitor.p112i.C2657e;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.a.b */
public abstract class AbstractC2630b extends AbstractC2629a {

    /* renamed from: a */
    public String f8369a;

    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a, com.bytedance.android.monitor.p104a.AbstractC2634f
    /* renamed from: a */
    public JSONObject mo11403a() {
        JSONObject a = super.mo11403a();
        C2657e.m11174a(a, "event_type", this.f8369a);
        return a;
    }

    public AbstractC2630b(String str) {
        this.f8369a = str;
    }
}
