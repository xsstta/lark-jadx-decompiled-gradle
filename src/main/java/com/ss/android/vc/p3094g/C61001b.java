package com.ss.android.vc.p3094g;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ss.android.vc.g.b */
public class C61001b {

    /* renamed from: a */
    private Context f152861a;

    /* renamed from: b */
    private SharedPreferences f152862b;

    /* renamed from: a */
    public Boolean mo210459a() {
        SharedPreferences sharedPreferences = this.f152862b;
        if (sharedPreferences == null) {
            return false;
        }
        return Boolean.valueOf(sharedPreferences.getBoolean("vc_is_crash", false));
    }

    public C61001b(Context context) {
        this.f152861a = context;
        if (context != null) {
            try {
                this.f152862b = context.getSharedPreferences("vc_crash_sp_file", 0);
            } catch (Exception unused) {
                this.f152862b = null;
            }
        }
    }

    /* renamed from: a */
    public void mo210460a(String str) {
        SharedPreferences sharedPreferences = this.f152862b;
        if (sharedPreferences != null) {
            if (str == null) {
                str = "";
            }
            sharedPreferences.edit().putString("vc_crash_meeting_id", str).commit();
        }
    }

    /* renamed from: a */
    public void mo210461a(boolean z) {
        SharedPreferences sharedPreferences = this.f152862b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("vc_is_crash", z).commit();
        }
    }
}
