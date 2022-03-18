package com.bytedance.ee.bear.wiki.wikitree.tree.p586a;

import com.bytedance.ee.bear.contract.NetService;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.a.d */
public final class C12135d {
    /* renamed from: a */
    public static boolean m50189a(Throwable th) {
        if (m50193e(th) == 920004002) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m50190b(Throwable th) {
        if (m50193e(th) == 920004001) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m50192d(Throwable th) {
        if (m50193e(th) == 920004011) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static int m50193e(Throwable th) {
        int code;
        NetService.ServerErrorException f = m50194f(th);
        if (f == null || (code = f.getCode()) == 0) {
            return -1;
        }
        return code;
    }

    /* renamed from: c */
    public static boolean m50191c(Throwable th) {
        int e = m50193e(th);
        if (e == 920004003 || e == 920004004 || e == 920004007 || e == 920004012) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static NetService.ServerErrorException m50194f(Throwable th) {
        if (th instanceof NetService.ServerErrorException) {
            return (NetService.ServerErrorException) th;
        }
        if (th.getCause() == null || !(th.getCause() instanceof NetService.ServerErrorException)) {
            return null;
        }
        return (NetService.ServerErrorException) th.getCause();
    }
}
