package com.ss.android.lark.utils.rxjava;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.utils.rxjava.d */
public class C57876d {
    /* renamed from: a */
    public static void m224585a(Throwable th) {
        m224584a("RxJava", th);
    }

    /* renamed from: b */
    public static void m224587b(Throwable th) {
        m224584a("ThrowableHelper", th);
    }

    /* renamed from: a */
    private static void m224584a(String str, Throwable th) {
        if (th != null && (th instanceof RuntimeException)) {
            Throwable b = m224586b(str, th);
            b.printStackTrace();
            Log.m165385e(str, b.getMessage(), b, true);
        }
    }

    /* renamed from: b */
    private static Throwable m224586b(String str, Throwable th) {
        if (th == null) {
            return th;
        }
        return new Throwable(String.format("Handle in %1$s >> %2$s: %3$s", str, th.getClass().getName(), th.getMessage()), th);
    }
}
