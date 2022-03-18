package com.ss.android.lark.live.settings;

import android.os.SystemClock;

/* renamed from: com.ss.android.lark.live.settings.b */
public class C41525b<T> {

    /* renamed from: a */
    private static String f105560a = "cache-";

    /* renamed from: b */
    private long f105561b;

    /* renamed from: c */
    private T f105562c;

    /* renamed from: d */
    private long f105563d;

    /* renamed from: e */
    private String f105564e = f105560a;

    /* renamed from: a */
    private boolean m164798a() {
        if (SystemClock.elapsedRealtime() - this.f105563d > this.f105561b) {
            return true;
        }
        return false;
    }

    public C41525b(long j) {
        this.f105561b = j;
    }

    /* renamed from: b */
    private String m164799b(String str) {
        if (str == null) {
            return f105560a;
        }
        return f105560a + str;
    }

    /* renamed from: a */
    public T mo149422a(String str) {
        if (!m164799b(str).equals(this.f105564e) || m164798a()) {
            return null;
        }
        return this.f105562c;
    }

    /* renamed from: a */
    public void mo149423a(T t, String str) {
        this.f105564e = m164799b(str);
        this.f105563d = SystemClock.elapsedRealtime();
        this.f105562c = t;
    }
}
