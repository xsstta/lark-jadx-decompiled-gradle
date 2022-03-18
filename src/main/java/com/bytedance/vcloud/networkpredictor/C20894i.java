package com.bytedance.vcloud.networkpredictor;

import com.C1711a;

/* renamed from: com.bytedance.vcloud.networkpredictor.i */
public class C20894i {

    /* renamed from: a */
    public static volatile boolean f51140a = false;

    /* renamed from: b */
    public static volatile String f51141b = "";

    /* renamed from: c */
    private static AbstractC20892g f51142c;

    /* renamed from: com.bytedance.vcloud.networkpredictor.i$a */
    private static class C20896a implements AbstractC20892g {
        private C20896a() {
        }

        @Override // com.bytedance.vcloud.networkpredictor.AbstractC20892g
        /* renamed from: a */
        public boolean mo70610a(String str) {
            try {
                C1711a.m7628a(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m76088a() {
        boolean z;
        synchronized (C20894i.class) {
            try {
                if (!f51140a) {
                    AbstractC20892g gVar = f51142c;
                    if (gVar == null) {
                        gVar = new C20896a();
                    }
                    f51140a = gVar.mo70610a("networkpredictor");
                }
            } catch (Throwable th) {
                f51141b = th.toString();
                f51140a = false;
            }
            z = f51140a;
        }
        return z;
    }
}
