package com.ss.android.ad.splash.core;

/* renamed from: com.ss.android.ad.splash.core.a */
public class C27266a {

    /* renamed from: a */
    private static volatile C27266a f67943a;

    /* renamed from: a */
    public static C27266a m99126a() {
        if (f67943a == null) {
            synchronized (C27266a.class) {
                if (f67943a == null) {
                    f67943a = new C27266a();
                }
            }
        }
        return f67943a;
    }

    /* renamed from: b */
    public void mo97252b() {
        if (C27287e.ai()) {
            C27360s.m99683a().mo97630b();
        } else {
            C27360s.m99683a().mo97633d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo97253c() {
        if (C27287e.ai()) {
            C27355p.m99650a().mo97600b();
        } else {
            C27355p.m99650a().mo97603e();
        }
    }
}
