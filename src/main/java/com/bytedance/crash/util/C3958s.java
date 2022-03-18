package com.bytedance.crash.util;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.bytedance.crash.util.s */
public class C3958s {

    /* renamed from: a */
    private static final C3960a f12061a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.util.s$a */
    public static class C3960a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo15640a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }

        private C3960a() {
        }
    }

    /* renamed from: com.bytedance.crash.util.s$b */
    private static class C3961b extends C3960a {
        private C3961b() {
            super();
        }

        @Override // com.bytedance.crash.util.C3958s.C3960a
        /* renamed from: a */
        public long mo15640a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f12061a = new C3961b();
        } else {
            f12061a = new C3960a();
        }
    }

    /* renamed from: a */
    public static long m16477a(ActivityManager.MemoryInfo memoryInfo) {
        return f12061a.mo15640a(memoryInfo);
    }
}
