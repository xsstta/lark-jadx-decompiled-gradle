package com.bytedance.vcloud.mlcomponent_api;

import com.C1711a;

/* renamed from: com.bytedance.vcloud.mlcomponent_api.c */
public class C20883c {

    /* renamed from: a */
    public static volatile boolean f51123a = false;

    /* renamed from: b */
    public static volatile String f51124b = "";

    /* renamed from: a */
    public static synchronized void m76025a() {
        synchronized (C20883c.class) {
            try {
                if (!f51123a) {
                    try {
                        C1711a.m7628a("tensorflowlite");
                        C1711a.m7628a("networkpredict_tfengine");
                        f51123a = true;
                    } catch (Throwable th) {
                        f51124b = th.toString();
                        return;
                    }
                }
            } catch (Throwable th2) {
                f51124b = th2.toString();
            }
        }
        return;
    }
}
