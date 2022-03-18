package com.bytedance.ee.lark.infra.foundation.utils;

import android.content.Context;
import com.larksuite.framework.utils.C26252ad;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.f */
public class C12788f {

    /* renamed from: a */
    private static C12789a f34168a = new C12789a();

    /* renamed from: com.bytedance.ee.lark.infra.foundation.utils.f$a */
    public static class C12789a {

        /* renamed from: a */
        public Boolean f34169a;
    }

    /* renamed from: b */
    public static String m52856b(Context context) {
        return C26252ad.m94992a(context);
    }

    /* renamed from: c */
    public static boolean m52858c(String str) {
        return str.contains(":oryx");
    }

    /* renamed from: b */
    public static boolean m52857b(String str) {
        return str.contains(":miniapp");
    }

    /* renamed from: a */
    public static boolean m52855a(String str) {
        if (m52857b(str) || m52858c(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m52854a(Context context) {
        if (f34168a.f34169a != null) {
            return f34168a.f34169a.booleanValue();
        }
        String b = m52856b(context);
        if (b != null && b.contains(":")) {
            Boolean bool = false;
            f34168a.f34169a = bool;
            return bool.booleanValue();
        } else if (context == null || b == null) {
            return false;
        } else {
            C12789a aVar = f34168a;
            Boolean valueOf = Boolean.valueOf(b.equals(context.getPackageName()));
            aVar.f34169a = valueOf;
            if (valueOf.booleanValue()) {
                return true;
            }
            return false;
        }
    }
}
