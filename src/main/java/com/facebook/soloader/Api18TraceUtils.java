package com.facebook.soloader;

import android.os.Trace;

/* access modifiers changed from: package-private */
public class Api18TraceUtils {
    Api18TraceUtils() {
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static void beginTraceSection(String str) {
        Trace.beginSection(str);
    }
}
