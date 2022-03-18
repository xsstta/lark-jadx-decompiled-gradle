package com.bytedance.morpheus.p856a;

import android.content.SharedPreferences;
import com.bytedance.morpheus.C20207c;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.morpheus.a.f */
public class C20205f {

    /* renamed from: a */
    private static volatile C20205f f49346a;

    /* renamed from: b */
    private SharedPreferences f49347b;

    /* renamed from: a */
    public static C20205f m73738a() {
        if (f49346a == null) {
            synchronized (C20205f.class) {
                if (f49346a == null) {
                    f49346a = new C20205f();
                }
            }
        }
        return f49346a;
    }

    private C20205f() {
        SharedPreferences sharedPreferences = C20207c.m73745a().getSharedPreferences("app_bundle_session_ids", 0);
        this.f49347b = sharedPreferences;
        if (C20207c.m73750b().mo68356b() != sharedPreferences.getInt("app_version_code", -1)) {
            this.f49347b.edit().clear().apply();
        }
    }

    /* renamed from: a */
    public int mo68375a(String str) {
        return this.f49347b.getInt(str, -1);
    }

    /* renamed from: a */
    public void mo68376a(String str, int i) {
        this.f49347b.edit().putInt(str, i).apply();
    }
}
