package com.ss.android.lark.mail.impl.p2161a;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.mail.impl.a.b */
public class C41773b extends C41772a<Long> {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo150230c(Long l) {
        long j;
        Object b = mo5927b();
        Log.m165388i("testSmartInbox original:" + b + " target:" + l);
        if (super.mo150230c(l)) {
            if (b != null) {
                j = ((Long) b).longValue();
            } else {
                j = 0;
            }
            if (j < l.longValue()) {
                return true;
            }
        }
        return false;
    }
}
