package com.bytedance.ee.bear.wiki.wikitree.tree.p586a;

import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.service.C10917c;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.a.c */
public class C12134c {
    /* renamed from: a */
    static String m50188a(int i) {
        return i != 1001 ? i != 1003 ? i != 1008 ? i != 1005 ? i != 1006 ? "" : "remove" : "add" : "move" : "expand" : "open";
    }

    /* renamed from: a */
    public static int m50187a(C10917c cVar, Throwable th) {
        if (C12135d.m50189a(th)) {
            return 1003;
        }
        if (C12135d.m50191c(th)) {
            return 1004;
        }
        if (C12135d.m50192d(th)) {
            return 1005;
        }
        if (C12135d.m50190b(th)) {
            return 1006;
        }
        ConnectionService.NetworkState b = C5084ad.m20847d().mo20038b();
        if (b == null || b.mo20041b()) {
            return 1002;
        }
        return 1007;
    }
}
