package com.ss.android.lark.sdk;

/* renamed from: com.ss.android.lark.sdk.h */
public class C53241h {
    /* renamed from: a */
    public static void m205894a(String str, String str2) {
        C53254m.m205926b().mo103037a(str, str2);
    }

    /* renamed from: b */
    public static void m205898b(String str, String str2) {
        C53254m.m205926b().mo103039b(str, str2);
    }

    /* renamed from: c */
    public static void m205899c(String str, String str2) {
        C53254m.m205926b().mo103040c(str, str2);
    }

    /* renamed from: d */
    public static void m205900d(String str, String str2) {
        C53254m.m205926b().mo103041d(str, str2);
    }

    /* renamed from: a */
    public static void m205895a(String str, String str2, Throwable th) {
        String str3;
        AbstractC53239f b = C53254m.m205926b();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("Throwable = ");
        if (th == null) {
            str3 = "null";
        } else {
            str3 = th.getMessage();
        }
        sb.append(str3);
        b.mo103037a(str, sb.toString());
    }

    /* renamed from: a */
    public static void m205896a(String str, String str2, Throwable th, boolean z) {
        String str3;
        AbstractC53239f b = C53254m.m205926b();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("Throwable = ");
        if (th == null) {
            str3 = "null";
        } else {
            str3 = th.getMessage();
        }
        sb.append(str3);
        b.mo103037a(str, sb.toString());
    }

    /* renamed from: a */
    public static void m205897a(String str, boolean z, String str2, String str3) {
        String str4;
        AbstractC53239f b = C53254m.m205926b();
        StringBuilder sb = new StringBuilder();
        sb.append("[perf][RUST_PB_");
        sb.append(str2);
        sb.append("][");
        if (z) {
            str4 = "start";
        } else {
            str4 = "end";
        }
        sb.append(str4);
        sb.append("]context=");
        sb.append(str3);
        b.mo103038a("eesa_rust_pb_call", str, sb.toString());
    }
}
