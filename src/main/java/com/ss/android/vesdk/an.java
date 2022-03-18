package com.ss.android.vesdk;

import android.os.Trace;

public class an {

    /* renamed from: a */
    private static boolean f161464a;

    /* renamed from: a */
    public static void m251027a() {
        if (f161464a) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m251028a(String str) {
        if (f161464a) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static synchronized void m251029a(boolean z) {
        synchronized (an.class) {
            f161464a = z;
        }
    }
}
