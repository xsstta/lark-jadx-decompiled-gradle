package com.ss.android.lark.utils.rxjava;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.utils.rxjava.a */
public class C57861a extends ReportErrorConsumer {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.rxjava.a$a */
    public static class C57863a {

        /* renamed from: a */
        public static final C57861a f142491a = new C57861a();
    }

    private C57861a() {
    }

    /* renamed from: a */
    public static final C57861a m224572a() {
        return C57863a.f142491a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.utils.rxjava.ReportErrorConsumer
    public void error(Throwable th) throws Exception {
        Log.m165384e("EmptyErrorConsumer", th.getMessage(), th);
    }
}
