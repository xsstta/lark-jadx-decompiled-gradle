package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.SharedPreferencesC2910d;

/* renamed from: com.bytedance.apm.internal.b */
public class C3010b {

    /* renamed from: a */
    private final SharedPreferences f9722a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.internal.b$a */
    public static class C3012a {

        /* renamed from: a */
        public static final C3010b f9723a = new C3010b();
    }

    /* renamed from: a */
    public static C3010b m12651a() {
        return C3012a.f9723a;
    }

    private C3010b() {
        this.f9722a = SharedPreferencesC2910d.m12319a(C2785b.m11735a(), "monitor_config");
    }

    /* renamed from: a */
    public String mo12819a(String str) {
        return this.f9722a.getString(str, null);
    }

    /* renamed from: b */
    public int mo12823b(String str) {
        return this.f9722a.getInt(str, -1);
    }

    /* renamed from: c */
    public long mo12824c(String str) {
        return this.f9722a.getLong(str, 0);
    }

    /* renamed from: a */
    public void mo12820a(String str, int i) {
        this.f9722a.edit().putInt(str, i).apply();
    }

    /* renamed from: a */
    public void mo12821a(String str, long j) {
        this.f9722a.edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public void mo12822a(String str, String str2) {
        this.f9722a.edit().putString(str, str2).apply();
    }
}
