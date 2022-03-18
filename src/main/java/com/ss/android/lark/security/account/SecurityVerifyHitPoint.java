package com.ss.android.lark.security.account;

import com.ss.android.lark.statistics.Statistics;

public final class SecurityVerifyHitPoint {

    public @interface Event {
    }

    /* renamed from: a */
    public static void m209796a(String str) {
        Statistics.sendEvent(str);
    }
}
