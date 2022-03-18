package com.ss.android.lark.mail.impl.p2166e;

import android.os.SystemClock;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.mail.impl.e.a */
public class C42051a {

    /* renamed from: a */
    private final String f106714a = "DebugTrigger";

    /* renamed from: b */
    private final long f106715b = 500;

    /* renamed from: c */
    private final int f106716c = 5;

    /* renamed from: d */
    private int f106717d;

    /* renamed from: e */
    private long f106718e;

    /* renamed from: a */
    public boolean mo151065a() {
        Log.m165379d("DebugTrigger", "tryTrigger");
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        if (valueOf.longValue() - this.f106718e > 500) {
            this.f106717d = 0;
        } else {
            this.f106717d++;
        }
        this.f106718e = valueOf.longValue();
        if (this.f106717d != 5) {
            return false;
        }
        this.f106717d = 0;
        return true;
    }
}
