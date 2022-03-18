package com.bytedance.applog.util;

import android.content.Context;
import android.util.Log;
import com.bytedance.applog.AbstractC3419f;

/* renamed from: com.bytedance.applog.util.r */
public class C3469r {

    /* renamed from: a */
    public static boolean f10990a;

    /* renamed from: b */
    public static final int f10991b;

    /* renamed from: c */
    private static AbstractC3419f f10992c;

    static {
        if (String.valueOf(50301453).charAt(0) >= '4') {
            f10991b = 60301052;
        } else {
            f10991b = 50301453;
        }
    }

    /* renamed from: a */
    public static void m14665a(String str) {
        m14666a(str, (Throwable) null);
    }

    /* renamed from: a */
    public static void m14667a(Throwable th) {
        m14666a("U SHALL NOT PASS!", th);
    }

    /* renamed from: b */
    public static void m14668b(String str, Throwable th) {
        m14666a(str, th);
    }

    /* renamed from: c */
    public static void m14669c(String str, Throwable th) {
        m14666a(str, th);
    }

    /* renamed from: d */
    public static void m14670d(String str, Throwable th) {
        m14666a(str, th);
    }

    /* renamed from: a */
    public static void m14664a(Context context, AbstractC3419f fVar) {
        boolean z;
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            f10990a = z;
        } catch (Throwable unused) {
            f10990a = true;
        }
        f10992c = fVar;
    }

    /* renamed from: a */
    public static void m14666a(String str, Throwable th) {
        AbstractC3419f fVar = f10992c;
        if (fVar != null) {
            fVar.mo13716a(str, th);
        } else if (f10990a) {
            Log.d("AppLog", str, th);
        }
    }
}
