package com.ss.android.lark.mail.impl.utils;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.utils.g */
public class C43764g {

    /* renamed from: a */
    private static HashMap<String, Long> f111064a = new HashMap<>();

    /* renamed from: a */
    public static boolean m173481a(String str) {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f111064a.containsKey(str)) {
            j = f111064a.get(str).longValue();
        } else {
            j = 0;
        }
        if (uptimeMillis - j > 1000) {
            z = false;
        } else {
            z = true;
        }
        f111064a.put(str, Long.valueOf(uptimeMillis));
        return z;
    }

    /* renamed from: b */
    public static boolean m173482b(String str) {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f111064a.containsKey(str)) {
            j = f111064a.get(str).longValue();
        } else {
            j = 0;
        }
        if (uptimeMillis - j > 500) {
            z = false;
        } else {
            z = true;
        }
        f111064a.put(str, Long.valueOf(uptimeMillis));
        return z;
    }
}
