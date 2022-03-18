package com.bytedance.crash;

import java.util.List;

/* renamed from: com.bytedance.crash.j */
public class C3767j {

    /* renamed from: a */
    private static Runnable f11605a;

    /* renamed from: b */
    private static AbstractC3768a f11606b;

    /* renamed from: c */
    private static AbstractC3769b f11607c;

    /* renamed from: com.bytedance.crash.j$a */
    interface AbstractC3768a {
        /* renamed from: a */
        List<String> mo15294a(long j, String str);
    }

    /* renamed from: com.bytedance.crash.j$b */
    interface AbstractC3769b {
        /* renamed from: a */
        boolean mo15295a();
    }

    /* renamed from: a */
    public static boolean m15576a() {
        if (f11605a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m15577b() {
        Runnable runnable = f11605a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public static boolean m15578c() {
        if (f11606b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m15579d() {
        AbstractC3769b bVar = f11607c;
        if (bVar == null || !bVar.mo15295a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<String> m15575a(long j, String str) {
        AbstractC3768a aVar = f11606b;
        if (aVar == null) {
            return null;
        }
        return aVar.mo15294a(j, str);
    }
}
