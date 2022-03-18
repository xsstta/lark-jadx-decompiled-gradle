package com.facebook.battery.metrics.network;

import android.content.Context;
import android.os.Build;

/* renamed from: com.facebook.battery.metrics.network.a */
abstract class AbstractC21005a {
    /* renamed from: a */
    public static long[] m76521a() {
        return new long[8];
    }

    /* renamed from: a */
    public abstract boolean mo71154a(long[] jArr);

    /* renamed from: b */
    public abstract boolean mo71155b();

    AbstractC21005a() {
    }

    /* renamed from: a */
    public static AbstractC21005a m76520a(Context context) {
        if (Build.VERSION.SDK_INT >= 14) {
            C21007c cVar = new C21007c();
            if (cVar.mo71154a(new long[8])) {
                return cVar;
            }
        }
        return new C21008d(context);
    }
}
