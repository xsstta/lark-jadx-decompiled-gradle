package com.bytedance.vcloud.strategy;

import android.util.Log;
import com.C1711a;

/* renamed from: com.bytedance.vcloud.strategy.a */
public class C20904a {

    /* renamed from: a */
    public static volatile boolean f51178a = false;

    /* renamed from: b */
    public static volatile String f51179b = "";

    /* renamed from: a */
    public static synchronized void m76134a() {
        synchronized (C20904a.class) {
            try {
                if (!f51178a) {
                    C1711a.m7628a("preload");
                    f51178a = true;
                }
            } catch (Throwable th) {
                f51179b = th.toString();
                Log.i("VCStrategy", "load so fail. " + f51179b);
            }
        }
        return;
    }
}
