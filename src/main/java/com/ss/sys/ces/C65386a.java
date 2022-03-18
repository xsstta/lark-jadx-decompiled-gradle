package com.ss.sys.ces;

import android.content.Context;
import com.C1711a;

/* renamed from: com.ss.sys.ces.a */
public final class C65386a {
    static {
        try {
            C1711a.m7628a("ees");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private static final void Bill() {
    }

    public static native String DebugPrint(Context context, int i);

    public static final void Louis() {
    }

    public static final void Zeoy() {
    }

    public static native byte[] decode(int i, byte[] bArr);

    public static native byte[] encode(byte[] bArr);

    public static native byte[] leviathan(int i, byte[] bArr);

    public static native Object meta(int i, Context context, Object obj);

    public static Object metas(int i, Context context, Object obj) {
        Object meta;
        synchronized (C65386a.class) {
            meta = meta(i, context, obj);
        }
        return meta;
    }

    public static Object njss(int i, Object obj) {
        try {
            return C65387b.m256413a().mo225025a(i, obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void Francies() {
    }
}
