package com.bytedance.vcloud.mlcomponent_api;

import com.C1711a;

/* renamed from: com.bytedance.vcloud.mlcomponent_api.a */
public class C20881a {

    /* renamed from: a */
    public static volatile boolean f51120a = false;

    /* renamed from: b */
    public static volatile String f51121b = "";

    /* renamed from: a */
    public static synchronized void m76023a() {
        synchronized (C20881a.class) {
            try {
                if (!f51120a) {
                    C1711a.m7628a("mlcomponent");
                    f51120a = true;
                }
            } catch (Throwable th) {
                f51121b = th.toString();
            }
        }
        return;
    }
}
