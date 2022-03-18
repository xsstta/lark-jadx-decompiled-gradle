package com.huawei.hms.framework.network.grs.p1018d;

import com.huawei.hms.framework.common.Logger;

/* renamed from: com.huawei.hms.framework.network.grs.d.e */
public class C23587e {

    /* renamed from: a */
    private static final String f58161a = "e";

    /* renamed from: a */
    public static boolean m85566a(Long l) {
        if (l == null) {
            Logger.m85373v(f58161a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - System.currentTimeMillis() >= 0) {
                Logger.m85373v(f58161a, "isSpExpire false.");
                return false;
            }
            Logger.m85373v(f58161a, "isSpExpire true.");
            return true;
        } catch (NumberFormatException unused) {
            Logger.m85373v(f58161a, "isSpExpire spValue NumberFormatException.");
        }
    }

    /* renamed from: a */
    public static boolean m85567a(Long l, long j) {
        if (l == null) {
            Logger.m85373v(f58161a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.m85373v(f58161a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.m85373v(f58161a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
