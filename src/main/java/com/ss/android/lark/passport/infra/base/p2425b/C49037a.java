package com.ss.android.lark.passport.infra.base.p2425b;

import android.app.Application;
import android.content.SharedPreferences;
import com.ss.android.lark.passport.infra.util.security.C49214c;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.passport.infra.base.b.a */
public class C49037a {

    /* renamed from: a */
    private static C49037a f123099a;

    /* renamed from: b */
    private final SharedPreferences f123100b;

    /* renamed from: c */
    private final C49214c f123101c;

    /* renamed from: a */
    public static C49037a m193154a() {
        synchronized (C49037a.class) {
            if (f123099a == null) {
                f123099a = new C49037a();
            }
        }
        return f123099a;
    }

    private C49037a() {
        Application application = LarkContext.getApplication();
        this.f123101c = new C49214c(application);
        if (application != null) {
            this.f123100b = application.getSharedPreferences("siginsdk_pref", 0);
            return;
        }
        throw new IllegalStateException("You should initialize SiginManager before use");
    }

    /* renamed from: a */
    public static String m193155a(String str) {
        return m193156a("default", str);
    }

    /* renamed from: b */
    public void mo171214b(String str) {
        m193157d("default", str);
    }

    /* renamed from: d */
    private void m193157d(String str, String str2) {
        mo171212a(str, str2, false);
    }

    /* renamed from: b */
    public String mo171213b(String str, String str2) {
        return mo171210a("default", str, str2);
    }

    /* renamed from: c */
    public void mo171215c(String str, String str2) {
        mo171211a("default", str, str2, false);
    }

    /* renamed from: a */
    public int mo171209a(String str, int i) {
        return m193153a("default", str, i);
    }

    /* renamed from: a */
    public static String m193156a(String str, String str2) {
        return C49214c.m194026a(str + "_" + str2);
    }

    /* renamed from: a */
    private int m193153a(String str, String str2, int i) {
        String string = this.f123100b.getString(this.f123101c.mo171728b(str + "_" + str2), null);
        if (string == null) {
            return i;
        }
        try {
            C49214c cVar = this.f123101c;
            return Integer.parseInt(cVar.mo171727a(string, i + ""));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public String mo171210a(String str, String str2, String str3) {
        String string = this.f123100b.getString(m193156a(str, str2), null);
        if (string == null) {
            return str3;
        }
        return this.f123101c.mo171727a(string, str3);
    }

    /* renamed from: a */
    public void mo171212a(String str, String str2, boolean z) {
        if (str != null && str2 != null) {
            this.f123100b.edit().remove(this.f123101c.mo171728b(str + "_" + str2)).apply();
        }
    }

    /* renamed from: a */
    public void mo171211a(String str, String str2, String str3, boolean z) {
        if (str != null && str2 != null) {
            String str4 = str + "_" + str2;
            if (z) {
                this.f123100b.edit().putString(this.f123101c.mo171728b(str4), this.f123101c.mo171729c(str3)).commit();
            } else {
                this.f123100b.edit().putString(this.f123101c.mo171728b(str4), this.f123101c.mo171729c(str3)).apply();
            }
        }
    }
}
