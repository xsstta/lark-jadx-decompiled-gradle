package com.bytedance.crash.util;

import android.os.Build;
import android.os.Debug;

/* renamed from: com.bytedance.crash.util.f */
public class C3938f {

    /* renamed from: a */
    private static final C3940a f12043a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.util.f$a */
    public static class C3940a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo15632a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15633b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo15634c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        private C3940a() {
        }
    }

    /* renamed from: com.bytedance.crash.util.f$b */
    private static class C3941b extends C3940a {
        private C3941b() {
            super();
        }

        @Override // com.bytedance.crash.util.C3938f.C3940a
        /* renamed from: a */
        public int mo15632a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.bytedance.crash.util.C3938f.C3940a
        /* renamed from: b */
        public int mo15633b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.bytedance.crash.util.C3938f.C3940a
        /* renamed from: c */
        public int mo15634c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f12043a = new C3941b();
        } else {
            f12043a = new C3940a();
        }
    }

    /* renamed from: a */
    public static int m16356a(Debug.MemoryInfo memoryInfo) {
        return f12043a.mo15632a(memoryInfo);
    }

    /* renamed from: b */
    public static int m16357b(Debug.MemoryInfo memoryInfo) {
        return f12043a.mo15633b(memoryInfo);
    }

    /* renamed from: c */
    public static int m16358c(Debug.MemoryInfo memoryInfo) {
        return f12043a.mo15634c(memoryInfo);
    }
}
