package com.ss.android.appcenter.p1262a.p1264b;

import android.content.SharedPreferences;
import com.ss.android.appcenter.C27528a;

/* renamed from: com.ss.android.appcenter.a.b.c */
public final class C27563c {

    /* renamed from: a */
    private SharedPreferences f68786a;

    /* renamed from: com.ss.android.appcenter.a.b.c$a */
    private static class C27565a {

        /* renamed from: a */
        public static final C27563c f68787a = new C27563c();
    }

    /* renamed from: a */
    public static C27563c m100585a() {
        return C27565a.f68787a;
    }

    private C27563c() {
        if (C27528a.m100471a().mo98143b() != null) {
            this.f68786a = C27528a.m100471a().mo98143b().getSharedPreferences("AppInfoLocalStore", 0);
        }
    }

    /* renamed from: b */
    public boolean mo98242b() {
        if (this.f68786a == null) {
            if (C27528a.m100471a().mo98143b() == null) {
                return false;
            }
            this.f68786a = C27528a.m100471a().mo98143b().getSharedPreferences("AppInfoLocalStore", 0);
        }
        SharedPreferences sharedPreferences = this.f68786a;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("has_entered_bot", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo98241a(boolean z) {
        if (this.f68786a == null) {
            if (C27528a.m100471a().mo98143b() != null) {
                this.f68786a = C27528a.m100471a().mo98143b().getSharedPreferences("AppInfoLocalStore", 0);
            } else {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.f68786a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("has_entered_bot", z).apply();
        }
    }
}
