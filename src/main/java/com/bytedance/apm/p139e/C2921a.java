package com.bytedance.apm.p139e;

import com.bytedance.apm6.foundation.AbstractC3320b;

/* renamed from: com.bytedance.apm.e.a */
public class C2921a {

    /* renamed from: a */
    private static boolean f9422a = true;

    /* renamed from: b */
    private static boolean f9423b;

    /* renamed from: c */
    private static AbstractC2923c f9424c;

    /* renamed from: d */
    private static volatile AbstractC3320b f9425d;

    /* renamed from: b */
    public static boolean m12359b() {
        if (f9425d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12357a() {
        return f9423b;
    }

    /* renamed from: a */
    public static void m12354a(AbstractC3320b bVar) {
        f9425d = bVar;
    }

    /* renamed from: a */
    public static void m12353a(AbstractC2923c cVar) {
        f9424c = cVar;
        if (cVar != null) {
            f9422a = true;
        }
    }

    /* renamed from: a */
    public static void m12356a(boolean z) {
        f9422a = z;
    }

    /* renamed from: a */
    public static void m12355a(String str, String str2) {
        AbstractC2923c cVar;
        if (f9422a && (cVar = f9424c) != null) {
            cVar.mo12627b(str, str2);
        }
    }

    /* renamed from: b */
    public static void m12358b(String str, String str2) {
        AbstractC2923c cVar;
        if (f9422a && (cVar = f9424c) != null) {
            cVar.mo12626a(str, str2);
        }
    }

    /* renamed from: c */
    public static void m12360c(String str, String str2) {
        AbstractC2923c cVar;
        if (f9422a && (cVar = f9424c) != null) {
            cVar.mo12628c(str, str2);
        }
    }

    /* renamed from: d */
    public static void m12361d(String str, String str2) {
        AbstractC2923c cVar;
        if (f9423b && (cVar = f9424c) != null) {
            cVar.mo12628c(str, str2);
        }
    }

    /* renamed from: e */
    public static void m12362e(String str, String str2) {
        if (f9425d != null) {
            f9425d.mo13558a(str, str2);
        }
    }
}
