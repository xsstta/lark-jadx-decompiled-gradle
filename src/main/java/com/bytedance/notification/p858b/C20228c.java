package com.bytedance.notification.p858b;

import android.os.SystemProperties;
import android.text.TextUtils;

/* renamed from: com.bytedance.notification.b.c */
public class C20228c {

    /* renamed from: n */
    private static volatile C20228c f49488n;

    /* renamed from: a */
    public final String f49489a = "ro.build.version.opporom";

    /* renamed from: b */
    String f49490b;

    /* renamed from: c */
    String f49491c;

    /* renamed from: d */
    String f49492d;

    /* renamed from: e */
    String f49493e;

    /* renamed from: f */
    private String f49494f = "RomUtils";

    /* renamed from: g */
    private final String f49495g = "ro.vivo.os.build.display.id";

    /* renamed from: h */
    private final String f49496h = "ro.build.version.emui";

    /* renamed from: i */
    private final String f49497i = "oppo";

    /* renamed from: j */
    private double f49498j = -1.0d;

    /* renamed from: k */
    private double f49499k = -1.0d;

    /* renamed from: l */
    private double f49500l = -1.0d;

    /* renamed from: m */
    private volatile Object f49501m;

    private C20228c() {
    }

    /* renamed from: a */
    public static C20228c m73857a() {
        if (f49488n == null) {
            synchronized (C20228c.class) {
                if (f49488n == null) {
                    f49488n = new C20228c();
                }
            }
        }
        return f49488n;
    }

    /* renamed from: b */
    public boolean mo68462b() {
        if (TextUtils.isEmpty(this.f49490b)) {
            this.f49490b = SystemProperties.get("ro.miui.ui.version.name", "");
        }
        return !TextUtils.isEmpty(this.f49490b);
    }

    /* renamed from: d */
    public boolean mo68464d() {
        if (TextUtils.isEmpty(this.f49491c)) {
            this.f49491c = m73858a("ro.build.version.opporom");
        }
        return !TextUtils.isEmpty(this.f49491c);
    }

    /* renamed from: f */
    public boolean mo68466f() {
        if (TextUtils.isEmpty(this.f49492d)) {
            this.f49492d = m73858a("ro.vivo.os.build.display.id");
        }
        return !TextUtils.isEmpty(this.f49492d);
    }

    /* renamed from: h */
    public boolean mo68468h() {
        if (TextUtils.isEmpty(this.f49493e)) {
            this.f49493e = m73858a("ro.build.version.emui");
        }
        return !TextUtils.isEmpty(this.f49493e);
    }

    /* renamed from: k */
    private Object m73859k() {
        if (this.f49501m == null) {
            synchronized (C20228c.class) {
                if (this.f49501m == null) {
                    try {
                        this.f49501m = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return this.f49501m;
    }

    /* renamed from: c */
    public boolean mo68463c() {
        if (!mo68462b()) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(this.f49490b) || this.f49490b.length() < 2) {
                return false;
            }
            String substring = this.f49490b.substring(1);
            if (substring.indexOf(".") > 0) {
                substring = substring.substring(0, substring.indexOf("."));
            }
            if (Integer.parseInt(substring) >= 12) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo68465e() {
        try {
            if (!mo68464d()) {
                return false;
            }
            if (this.f49499k == -1.0d && !TextUtils.isEmpty(this.f49491c) && this.f49491c.length() >= 2) {
                String substring = this.f49491c.substring(1);
                if (substring.indexOf(".") > 0) {
                    substring = substring.substring(0, substring.indexOf("."));
                }
                this.f49499k = Double.parseDouble(substring);
                String str = this.f49494f;
                C20227b.m73856a(str, "isColor7: " + this.f49499k);
            }
            if (this.f49499k >= 7.0d) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    public boolean mo68467g() {
        if (!mo68466f()) {
            return false;
        }
        try {
            if (this.f49500l == -1.0d && !TextUtils.isEmpty(this.f49492d) && this.f49492d.length() >= 2) {
                String str = this.f49492d;
                String substring = str.substring(str.indexOf("_") + 1);
                if (substring.indexOf(".") > 0) {
                    substring = substring.substring(0, substring.indexOf("."));
                }
                this.f49500l = Double.parseDouble(substring);
            }
            if (this.f49500l <= 4.0d) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo68469i() {
        if (!mo68468h()) {
            return false;
        }
        try {
            if (this.f49498j == -1.0d) {
                if (TextUtils.isEmpty(this.f49493e)) {
                    return false;
                }
                String str = this.f49493e;
                String substring = str.substring(str.indexOf("_") + 1);
                if (substring.indexOf(".") > 0) {
                    substring = substring.substring(0, substring.indexOf("."));
                }
                this.f49498j = Double.parseDouble(substring);
            }
            if (this.f49498j < 5.0d) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    public boolean mo68470j() {
        if (!mo68468h()) {
            return false;
        }
        try {
            if (this.f49498j == -1.0d) {
                if (TextUtils.isEmpty(this.f49493e)) {
                    return false;
                }
                String str = this.f49493e;
                String substring = str.substring(str.indexOf("_") + 1);
                if (substring.indexOf(".") > 0) {
                    substring = substring.substring(0, substring.indexOf("."));
                }
                this.f49498j = Double.parseDouble(substring);
            }
            if (this.f49498j >= 10.0d) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private String m73858a(String str) throws IllegalArgumentException {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                Object k = m73859k();
                return (String) k.getClass().getMethod("get", String.class).invoke(k, str);
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Throwable unused) {
                return "";
            }
        }
    }
}
