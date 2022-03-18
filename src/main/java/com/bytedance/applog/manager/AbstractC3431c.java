package com.bytedance.applog.manager;

import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.c */
public abstract class AbstractC3431c {

    /* renamed from: a */
    boolean f10905a;

    /* renamed from: b */
    boolean f10906b;

    /* renamed from: c */
    boolean f10907c;

    /* renamed from: d */
    boolean f10908d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo13788a(JSONObject jSONObject) throws JSONException, SecurityException;

    AbstractC3431c(boolean z, boolean z2) {
        this.f10906b = z;
        this.f10907c = z2;
    }

    AbstractC3431c(boolean z, boolean z2, boolean z3) {
        this.f10906b = z;
        this.f10907c = z2;
        this.f10908d = z3;
    }
}
