package com.bytedance.dr;

import android.content.Context;
import android.content.SharedPreferences;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.l */
public final class C4017l {

    /* renamed from: a */
    private final SharedPreferences f12182a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4016k mo15753a() {
        return C4016k.m16693a(this.f12182a.getString("oaid", ""));
    }

    C4017l(Context context) {
        this.f12182a = context.getSharedPreferences("device_register_oaid_refine", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15754a(C4016k kVar) {
        if (kVar != null) {
            this.f12182a.edit().putString("oaid", kVar.mo15751b().toString()).apply();
        }
    }
}
