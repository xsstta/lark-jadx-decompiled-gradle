package com.lynx.tasm.base;

import android.os.Trace;
import com.lynx.C26421a;

public class TraceEvent {
    private static native void nativeBeginSection(String str);

    private static native void nativeEndSection(String str);

    /* renamed from: a */
    public static void m96443a(String str) {
        if (!C26421a.f65260b.booleanValue()) {
            return;
        }
        if (!C26421a.f65261c.booleanValue()) {
            nativeBeginSection(str);
        } else {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m96444b(String str) {
        if (!C26421a.f65260b.booleanValue()) {
            return;
        }
        if (!C26421a.f65261c.booleanValue()) {
            nativeEndSection(str);
        } else {
            Trace.endSection();
        }
    }
}
