package com.bytedance.lynx.webview.internal;

import android.content.SharedPreferences;

/* renamed from: com.bytedance.lynx.webview.internal.e */
public class C19941e {

    /* renamed from: a */
    private static C19941e f48716a;

    /* renamed from: b */
    private SharedPreferences f48717b = C20011y.m72976a().mo67938u().getSharedPreferences("debug_setting_shared_preference", 0);

    /* renamed from: b */
    public boolean mo67726b() {
        return this.f48717b.getBoolean("enforce_pull_so", false);
    }

    /* renamed from: c */
    public void mo67727c() {
        this.f48717b.edit().commit();
    }

    private C19941e() {
    }

    /* renamed from: a */
    public static C19941e m72704a() {
        if (f48716a == null) {
            synchronized (C19941e.class) {
                if (f48716a == null) {
                    f48716a = new C19941e();
                }
            }
        }
        return f48716a;
    }

    /* renamed from: a */
    private String m72705a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int length = str.length() - 1;
        while (length >= 0) {
            try {
                if (!Character.isDigit(str.charAt(length))) {
                    break;
                }
                length--;
            } catch (Exception unused) {
            }
        }
        return str.substring(0, length + 1);
    }

    /* renamed from: a */
    public void mo67720a(boolean z) {
        this.f48717b.edit().putBoolean("enforce_pull_so", z).apply();
    }

    /* renamed from: a */
    public void mo67719a(String str, int i) {
        mo67724b(str, "process_feature", i);
    }

    /* renamed from: a */
    private String m72706a(String str, String str2) {
        String a = m72705a(str);
        return a + "_" + str2;
    }

    /* renamed from: a */
    public int mo67718a(String str, String str2, int i) {
        return this.f48717b.getInt(m72706a(str, str2), i);
    }

    /* renamed from: b */
    public void mo67723b(String str, int i, boolean z) {
        mo67725b(str, "process_feature" + i, z);
    }

    /* renamed from: b */
    public void mo67724b(String str, String str2, int i) {
        this.f48717b.edit().putInt(m72706a(str, str2), i).apply();
    }

    /* renamed from: b */
    public void mo67725b(String str, String str2, boolean z) {
        this.f48717b.edit().putBoolean(m72706a(str, str2), z).apply();
    }

    /* renamed from: a */
    public boolean mo67721a(String str, int i, boolean z) {
        if (this.f48717b.contains(m72706a(str, "process_feature" + i))) {
            return mo67722a(str, "process_feature" + i, z);
        } else if ((mo67718a(str, "process_feature", 0) & (1 << (i - 1))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo67722a(String str, String str2, boolean z) {
        return this.f48717b.getBoolean(m72706a(str, str2), z);
    }
}
