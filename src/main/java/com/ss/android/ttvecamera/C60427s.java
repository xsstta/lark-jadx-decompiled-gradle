package com.ss.android.ttvecamera;

import android.util.Log;

/* renamed from: com.ss.android.ttvecamera.s */
public class C60427s {

    /* renamed from: a */
    public static byte f151006a = 1;

    /* renamed from: b */
    public static byte f151007b = 2;

    /* renamed from: c */
    public static byte f151008c = 4;

    /* renamed from: d */
    public static byte f151009d = 8;

    /* renamed from: e */
    public static byte f151010e = 16;

    /* renamed from: f */
    private static String f151011f = "VESDK-";

    /* renamed from: g */
    private static String f151012g = "monitorInfo";

    /* renamed from: h */
    private static byte f151013h = 3;

    /* renamed from: i */
    private static volatile AbstractC60429b f151014i = new C60428a();

    /* renamed from: com.ss.android.ttvecamera.s$b */
    public interface AbstractC60429b {
        /* renamed from: a */
        void mo206922a(byte b, String str, String str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ttvecamera.s$a */
    public static class C60428a implements AbstractC60429b {
        C60428a() {
        }

        @Override // com.ss.android.ttvecamera.C60427s.AbstractC60429b
        /* renamed from: a */
        public void mo206922a(byte b, String str, String str2) {
            if (b == C60427s.f151010e) {
                Log.v(str, str2);
            } else if (b == C60427s.f151009d) {
                Log.d(str, str2);
            } else if (b == C60427s.f151008c) {
                Log.i(str, str2);
            } else if (b == C60427s.f151007b) {
                Log.w(str, str2);
            } else if (b == C60427s.f151006a) {
                Log.e(str, str2);
            } else {
                Log.d(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m234835a() {
        m234842b("Debug", m234841b());
    }

    /* renamed from: b */
    public static String m234841b() {
        return Log.getStackTraceString(new Throwable());
    }

    /* renamed from: a */
    public static void m234836a(AbstractC60429b bVar) {
        if (bVar != null) {
            f151014i = bVar;
        } else {
            f151014i = new C60428a();
        }
    }

    /* renamed from: b */
    public static void m234842b(String str, String str2) {
        if ((f151009d & f151013h) != 0) {
            f151014i.mo206922a(f151009d, f151011f + str, str2);
        }
    }

    /* renamed from: c */
    public static void m234843c(String str, String str2) {
        if ((f151007b & f151013h) != 0) {
            f151014i.mo206922a(f151007b, f151011f + str, str2);
        }
    }

    /* renamed from: d */
    public static void m234844d(String str, String str2) {
        if ((f151006a & f151013h) != 0) {
            f151014i.mo206922a(f151006a, f151011f + str, str2);
        }
    }

    /* renamed from: e */
    public static void m234845e(String str, String str2) {
        if ((f151010e & f151013h) != 0) {
            f151014i.mo206922a(f151010e, f151011f + str, str2);
        }
    }

    /* renamed from: a */
    public static void m234837a(String str, byte b) {
        if (str != null && str.length() > 0) {
            f151011f = str + "-";
        }
        f151013h = b;
    }

    /* renamed from: a */
    public static void m234838a(String str, Object obj) {
        if ((f151009d & f151013h) != 0) {
            String str2 = f151012g;
            Log.d(str2, str + " = " + obj.toString());
        }
    }

    /* renamed from: a */
    public static void m234839a(String str, String str2) {
        if ((f151008c & f151013h) != 0) {
            f151014i.mo206922a(f151008c, f151011f + str, str2);
        }
    }

    /* renamed from: a */
    public static void m234840a(String str, String str2, Throwable th) {
        if ((f151007b & f151013h) != 0) {
            AbstractC60429b bVar = f151014i;
            byte b = f151007b;
            bVar.mo206922a(b, f151011f + str, str2 + th.getMessage() + "stack: " + Log.getStackTraceString(th));
        }
    }
}
