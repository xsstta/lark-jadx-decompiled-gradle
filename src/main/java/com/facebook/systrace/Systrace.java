package com.facebook.systrace;

import android.os.Build;
import android.os.Trace;

public class Systrace {
    /* renamed from: a */
    public static void m77080a(long j, String str, int i) {
    }

    /* renamed from: a */
    public static void m77081a(TraceListener traceListener) {
    }

    /* renamed from: a */
    public static boolean m77082a(long j) {
        return false;
    }

    /* renamed from: b */
    public static void m77084b(TraceListener traceListener) {
    }

    public enum EventScope {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        
        private final char mCode;

        public char getCode() {
            return this.mCode;
        }

        private EventScope(char c) {
            this.mCode = c;
        }
    }

    /* renamed from: b */
    public static void m77083b(long j) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m77079a(long j, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
