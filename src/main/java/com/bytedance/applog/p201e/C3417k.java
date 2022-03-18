package com.bytedance.applog.p201e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: com.bytedance.applog.e.k */
public class C3417k extends AbstractC3403c {

    /* renamed from: a */
    private final SharedPreferences f10836a;

    /* renamed from: b */
    private final SharedPreferences f10837b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3403c
    /* renamed from: a */
    public String mo13653a(String str) {
        return m14341c(str);
    }

    /* renamed from: c */
    private String m14341c(String str) {
        return m14342d(str).getString(str, null);
    }

    /* renamed from: d */
    private SharedPreferences m14342d(String str) {
        if ("device_id".equals(str)) {
            return this.f10837b;
        }
        return this.f10836a;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3403c
    /* renamed from: b */
    public void mo13656b(String str) {
        SharedPreferences d = m14342d(str);
        if (d != null && d.contains(str)) {
            m14342d(str).edit().remove(str).apply();
        }
        super.mo13656b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3403c
    /* renamed from: a */
    public void mo13655a(String str, String str2) {
        m14343e(str, str2);
    }

    public C3417k(Context context, String str) {
        if (context != null) {
            this.f10836a = context.getSharedPreferences("snssdk_openudid", 0);
            this.f10837b = context.getSharedPreferences(str, 0);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    /* renamed from: e */
    private void m14343e(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = m14342d(str).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
