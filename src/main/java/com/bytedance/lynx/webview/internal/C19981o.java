package com.bytedance.lynx.webview.internal;

import java.util.HashMap;

/* renamed from: com.bytedance.lynx.webview.internal.o */
public class C19981o {

    /* renamed from: a */
    private static int f48812a;

    /* renamed from: a */
    public static void m72874a() {
        f48812a++;
    }

    /* renamed from: b */
    public static void m72875b() {
        if (f48812a != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("PV", Integer.valueOf(f48812a));
            C19943g.m72727a("ttwebview_pv", hashMap, new HashMap());
            f48812a = 0;
        }
    }
}
