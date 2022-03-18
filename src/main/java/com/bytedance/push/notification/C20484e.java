package com.bytedance.push.notification;

import android.os.SystemClock;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.notification.e */
public class C20484e {

    /* renamed from: a */
    private long f49979a;

    /* renamed from: b */
    private String f49980b;

    /* renamed from: c */
    private int f49981c;

    C20484e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo68975a(String str, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f49981c == i && elapsedRealtime - this.f49979a <= 1000 && TextUtils.equals(this.f49980b, str)) {
            return true;
        }
        this.f49980b = str;
        this.f49981c = i;
        this.f49979a = elapsedRealtime;
        return false;
    }
}
