package com.bytedance.ttnet.config;

import com.bytedance.common.utility.reflect.Reflect;

/* renamed from: com.bytedance.ttnet.config.c */
public class C20755c {

    /* renamed from: a */
    private static volatile boolean f50842a = true;

    /* renamed from: a */
    public static void m75628a() {
        if (f50842a) {
            try {
                Reflect.on(Class.forName("com.bytedance.crash.Npth").newInstance()).call("registerSdk", new Class[]{Integer.TYPE, String.class}, 2616, "4.0.78.3-tudp");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
