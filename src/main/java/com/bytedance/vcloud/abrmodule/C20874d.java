package com.bytedance.vcloud.abrmodule;

import com.C1711a;

/* renamed from: com.bytedance.vcloud.abrmodule.d */
public class C20874d {

    /* renamed from: a */
    public static volatile boolean f51099a = false;

    /* renamed from: b */
    public static volatile String f51100b = "";

    /* renamed from: c */
    private static AbstractC20880h f51101c;

    /* renamed from: com.bytedance.vcloud.abrmodule.d$a */
    private static class C20876a implements AbstractC20880h {
        private C20876a() {
        }

        @Override // com.bytedance.vcloud.abrmodule.AbstractC20880h
        /* renamed from: a */
        public boolean mo70562a(String str) {
            try {
                C1711a.m7628a(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m75986a() {
        boolean z;
        synchronized (C20874d.class) {
            try {
                if (!f51099a) {
                    AbstractC20880h hVar = f51101c;
                    if (hVar == null) {
                        hVar = new C20876a();
                    }
                    f51099a = hVar.mo70562a("abrmodule");
                }
            } catch (Throwable th) {
                f51100b = th.toString();
                f51099a = false;
            }
            z = f51099a;
        }
        return z;
    }
}
