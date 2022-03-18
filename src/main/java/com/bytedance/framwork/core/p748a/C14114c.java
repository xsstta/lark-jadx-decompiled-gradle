package com.bytedance.framwork.core.p748a;

import android.content.Context;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bytedance.framwork.core.a.c */
public final class C14114c {

    /* renamed from: a */
    private static AbstractC14116b f37090a = new C14115a();

    /* renamed from: b */
    private static boolean f37091b;

    /* renamed from: com.bytedance.framwork.core.a.c$a */
    public static class C14115a implements AbstractC14116b {
        @Override // com.bytedance.framwork.core.p748a.C14114c.AbstractC14116b
        /* renamed from: a */
        public boolean mo51875a(Context context) {
            return false;
        }
    }

    /* renamed from: com.bytedance.framwork.core.a.c$b */
    public interface AbstractC14116b {
        /* renamed from: a */
        boolean mo51875a(Context context);
    }

    /* renamed from: a */
    static boolean m57114a(Context context) {
        return f37090a.mo51875a(context);
    }

    /* renamed from: a */
    public static void m57113a(AbstractC14116b bVar) {
        if (!f37091b) {
            if (bVar != null) {
                f37090a = bVar;
            }
            f37091b = true;
        }
    }

    /* renamed from: a */
    public static byte[] m57115a(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
