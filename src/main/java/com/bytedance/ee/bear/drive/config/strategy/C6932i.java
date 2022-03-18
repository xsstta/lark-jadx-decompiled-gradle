package com.bytedance.ee.bear.drive.config.strategy;

import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;

/* renamed from: com.bytedance.ee.bear.drive.config.strategy.i */
public final class C6932i {
    /* renamed from: a */
    public static AbstractC6927d m27446a(C6937b bVar) {
        return m27445a(bVar.getBizType(), bVar.isHistoryMode(), bVar.isTypeWiki(), bVar.isVCFollowMode());
    }

    /* renamed from: a */
    static boolean m27447a(ConnectionService connectionService, long j, String str) {
        if (C6880a.m27096b() || j <= 5242880 || !connectionService.mo20038b().mo20043d() || "2".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static AbstractC6927d m27445a(int i, boolean z, boolean z2, boolean z3) {
        if (i != 2) {
            if (i != 3) {
                return C6920b.m27342f().mo27165a(C6924a.class);
            }
            return C6920b.m27342f().mo27165a(C6928e.class);
        } else if (z) {
            return C6920b.m27342f().mo27165a(C6926c.class);
        } else {
            if (z2) {
                return C6920b.m27342f().mo27165a(C6935l.class);
            }
            if (z3) {
                return C6920b.m27342f().mo27165a(C6934k.class);
            }
            return C6920b.m27342f().mo27165a(C6931h.class);
        }
    }
}
