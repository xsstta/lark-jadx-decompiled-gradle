package com.facebook.battery.metrics.core;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.battery.metrics.core.c */
public final class C20998c {

    /* renamed from: a */
    private static final AtomicReference<AbstractC20999a> f51384a = new AtomicReference<>();

    /* renamed from: com.facebook.battery.metrics.core.c$a */
    public interface AbstractC20999a {
        /* renamed from: a */
        void mo71117a(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static void m76504a(String str, String str2) {
        m76505a(str, str2, null);
    }

    /* renamed from: a */
    public static void m76505a(String str, String str2, Throwable th) {
        AbstractC20999a aVar = f51384a.get();
        if (aVar != null) {
            aVar.mo71117a(str, str2, th);
        } else {
            Log.e(str, str2, th);
        }
    }
}
