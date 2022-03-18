package com.ss.android.lark.utils.rxjava;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.utils.rxjava.e */
public class C57877e extends ReportErrorConsumer {

    /* renamed from: a */
    private static C57877e f142498a = new C57877e();

    private C57877e() {
    }

    /* renamed from: a */
    public static C57877e m224588a() {
        return f142498a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.utils.rxjava.ReportErrorConsumer
    public void error(Throwable th) throws Exception {
        Log.m165384e("UnCaughtErrorHandler", th.getMessage(), th);
    }
}
