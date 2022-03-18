package com.ss.android.agilelogger;

import com.C1711a;
import com.bytedance.android.alog.AbstractC2615b;
import com.bytedance.p203b.C3481a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.agilelogger.c */
public class C27507c implements AbstractC2615b {
    C27507c() {
    }

    @Override // com.bytedance.android.alog.AbstractC2615b
    /* renamed from: a */
    public void mo11329a(String str) {
        try {
            C3481a.m14718a("alog", ALog.sConfig.getContext());
        } catch (Throwable unused) {
            C1711a.m7628a("alog");
        }
    }
}
